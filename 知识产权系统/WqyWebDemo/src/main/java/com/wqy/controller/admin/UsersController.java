package com.wqy.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.UserMapper;
import com.wqy.entity.User;
import com.wqy.entity.UserExample;
import com.wqy.model.WebUsersInfo;
import com.wqy.util.MD5Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/10/8 09:32
 * @Description: 管理员 用户管理Controller
 */
@Controller
public class UsersController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 显示数据列表 ， 根据查询条件显示数据列表
     * @param page
     * @param rows
     * @param webUsersInfo
     * @return
     */
    @RequestMapping("/usersList.do")
    @ResponseBody
    public Map list(int page, int rows, WebUsersInfo webUsersInfo){
        PageHelper.startPage(page,rows);
        List<User> users = userMapper.list(webUsersInfo);

        PageInfo<User> pageInfo = new PageInfo<>(users);
        Map map = new HashMap();
        map.put("total",pageInfo.getTotal());
        map.put("rows",users);
        return map;
    }

    /**
     * 弹出添加用户Dialog
     * @return 跳转到Add.jsp
     */
    @RequestMapping("admin/add.do")
    public String toAddPage(){
        return "admin/public/add";
    }

    /**
     * 弹出编辑用户的Dialog
     * @return 跳转到Edit.jsp
     */
    @RequestMapping("admin/edit.do")
    public String toEditPage(){
        return "admin/public/edit";
    }


    @RequestMapping("admin/save.do")
    @ResponseBody
    public Map save(WebUsersInfo webUsersInfo){
        Map map = new HashMap();
        List<User> list = userMapper.list(webUsersInfo);
        if(list.size()==0){
            webUsersInfo.setId(UUID.randomUUID().toString());
            webUsersInfo.setPassword(MD5Util.md5(webUsersInfo.getPassword()));
            webUsersInfo.setBirthday(new Date());
            User user = new User();
            BeanUtils.copyProperties(webUsersInfo,user);

            System.out.println("yuh："+user.toString());
            int i = userMapper.insertSelective(user);

            map.put("msg","新增"+i+"条记录，成功！");
            map.put("res",true);
            return map;
        }

        map.put("msg",webUsersInfo.getUsername()+"已经存在！请重新输入。");
        map.put("res",false);
        return map;
    }

    @PostMapping("admin/del.do")
    @ResponseBody
    public Map del(String id){
        Map map = new HashMap();
        try{
            userMapper.deleteByPrimaryKey(id);

            map.put("result",true);
            map.put("msg","删除成功");
        }catch (Exception e){
            map.put("result",false);
            map.put("msg","错误代码：del");
        }
        return map;
    }

    @GetMapping("admin/changeStat.do")
    @ResponseBody
    public Map changeStat(String id,String isStat){
        System.out.println(id+" "+isStat);
        User user = new User();
        user.setId(id);
        user.setExt1(isStat);
        Map map = new HashMap();
        try{
            userMapper.updateByPrimaryKeySelective(user);

            map.put("result",true);
            map.put("msg","更新成功");
        }catch (Exception e){
            map.put("result",false);
            map.put("msg","错误代码：del");
        }
        return map;
    }
}
