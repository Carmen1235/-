package com.wqy.hr.core.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 王秋叶
 * @create 2019-02-19 15:01
 * @desc
 **/
@Controller
public class MainPage {

    @GetMapping("/")
    public String index(){
        return "login";
    }

    @GetMapping("/index")
    public String toIndex(){
        return "login";
    }

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    @GetMapping("/user/workOverTime")
    public String toWorkOverTime(){
        return "user/workOverTime";
    }
    @GetMapping("/user/workOverTimePlan")
    public String toWorkOverTimePlan(){
        return "user/workOverTimePlan";
    }

    /**后台管理*/
    @GetMapping("/admin")
    public String admin() {
        return "admin/admin";
    }

    /**用户管理*/
    @GetMapping("/admin/user")
    public String adminUser() {
        return "admin/user/index";
    }
}
