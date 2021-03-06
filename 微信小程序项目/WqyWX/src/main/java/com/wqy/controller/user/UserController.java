package com.wqy.controller.user;

import com.wqy.service.UserService;
import com.wqy.util.Results;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 王秋叶
 * @create 2018-08-08 10:17
 * @desc 用户登录注册 Controller
 **/
@Controller
public class UserController {
    @Resource
    private UserService userService;

//    public Results userLogin(@RequestParam(value = "name" , required = false) String name, @RequestParam(value = "password" ,required = false) String password){
//        Results results = userService.userLogin(name,password);
//        System.out.println(name+","+password);
//        return  results;
//    }

    /**
     * 用户登陆
     * @param name 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("/login.do")
    @ResponseBody
    public  Results userLogin(@RequestParam(value = "name" , required = false) String name, @RequestParam(value = "password" ,required = false) String password,String validate,String validate2){
        Results results = new Results();
        if(validate.equals(validate2)){
            results = userService.userLogin(name.trim(),password.trim());
            return  results;
        }
        results.setMsg("验证码错误");
        results.setResult(false);
        return  results;
    }

    /**
     * 用户注册
     * @param name 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("/reg.do")
    @ResponseBody
    public  Results userReg(@RequestParam(value = "name" , required = false) String name, @RequestParam(value = "password" ,required = false) String password){
        System.out.println(name+","+password);
        Results results = userService.userReg(name,password);
        return  results;
    }
}
