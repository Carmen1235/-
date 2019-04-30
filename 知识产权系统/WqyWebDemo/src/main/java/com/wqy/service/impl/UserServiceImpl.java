package com.wqy.service.impl;

import com.wqy.dao.mapper.UserMapper;
import com.wqy.entity.User;
import com.wqy.service.UserService;
import com.wqy.util.MD5Util;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 用户登陆注册ServiceImpl
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 用户登陆
     *
     * @param name
     * @param password
     * @return
     */
    @Override
    public Results userLogin(String name, String password) {
        Results results = new Results();

        List<User> users = userMapper.findByName(name);

        if (users.size() == 0) {
            results.setResult(false);
            results.setMsg("用户不存在");
            return results;
        }
        User user = users.get(0);
        if(user.getExt1().equals("0")){
            results.setResult(false);
            results.setMsg("用户被禁用");
            results.setObj(user);
            return results;
        }
        if (user.getPassword().equals(MD5Util.md5(password))) {
            results.setResult(true);
            results.setMsg("登陆成功");
            results.setObj(user);
            return results;
        } else {
            results.setResult(false);
            results.setMsg("密码错误");
            return results;
        }

    }

    /**
     * 用户注册
     *
     * @param name
     * @param password
     * @return
     */
    @Override
    public Results userReg(String name, String password) {
        Results results = new Results();
        if (userMapper.login(name) != null) {//检查用户是否存在
            results.setResult(false);
            results.setMsg("用户已经存在，重新注册");
        } else {
            User user = new User();
            user.setUsername(name);
            user.setPassword(MD5Util.md5(password));
            user.setId(UUID.randomUUID().toString());
            user.setBirthday(new Date());
            int i = userMapper.reg(user);
            results.setResult(true);
            results.setMsg("注册成功");
            results.setObj("注册数+" + i);
        }

        return results;
    }
}
