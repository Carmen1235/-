package com.wqy.hr.core.controller;

import com.wqy.hr.core.dao.secondary.UserDao;
import com.wqy.hr.core.entity.secondary.User;
import com.wqy.hr.core.vo.ResponseJson;
import com.wqy.hr.core.vo.UserVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author 王秋叶
 * @create 2019-02-26 15:43
 * @desc
 **/
@Controller
@RequestMapping("/user")
public class UserAction {

    @Autowired
    private UserDao userDao;

    @GetMapping("/load")
    @ResponseBody
    public ResponseJson load(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "") String username) {
        Page<User> all = null;
        if (StringUtils.isEmpty(username)) {
            all = userDao.findAll(PageRequest.of(page - 1, limit));
        } else {
            all = userDao.findAllByUsernameLike(username, PageRequest.of(page - 1, limit));
        }
        ResponseJson res = new ResponseJson();
        res.setCount(all.getTotalElements());
        System.out.println(all.getContent().get(0));
        res.setData(all.getContent());
        return res;
    }

    @PostMapping("/loginUser")
    public String loginUser(String username, String password) {
        User user = userDao.findUserByUsername(username);
        if(!Optional.ofNullable(user).isPresent()){
            return "login";
        }
        if (password.equals(user.getPassword())) {
            return "index";
        }
        return "login";
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseJson save(UserVO vo) {
        ResponseJson res = new ResponseJson();
        try {
            User user = new User();
            BeanUtils.copyProperties(vo, user);
            userDao.save(user);
            res.setMsg("新增成功");
        } catch (Exception e) {
            res.setMsg("新增失败");
        }
        return res;
    }

    @GetMapping("/admin/user/changeState/{id}")
    @ResponseBody
    public ResponseJson changeState(@PathVariable Long id) {
        System.out.println(id);
        Optional<User> byId = userDao.findById(id);
        User user = byId.get();
        user.setState(user.getState() ? false : true);
        userDao.save(user);
        return null;
    }

    @GetMapping("/admin/user/del/{id}")
    @ResponseBody
    public ResponseJson del(@PathVariable Long id) {
        System.out.println(id);
        Optional<User> byId = userDao.findById(id);
        User user = byId.get();
        user.setFlag(0l);
        userDao.save(user);
        return null;
    }
}
