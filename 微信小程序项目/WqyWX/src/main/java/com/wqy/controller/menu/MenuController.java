package com.wqy.controller.menu;

import com.wqy.entity.User;
import com.wqy.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author 王秋叶
 * @create 2018-08-08 10:17
 * @desc 网页页面跳转 Controller
 **/
@Controller("menuController")
public class MenuController {
    /**
     * 登陆后查询用户信息
     */
    @Resource
    private MenuService menuService;
    @RequestMapping("/menu.do")
    public  ModelAndView toMenuPage(String id){
        System.out.println("id="+id);
        User user = menuService.getUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("menu_name",user.getUsername());
        modelAndView.setViewName("menu");
        return modelAndView;
    }

    /**
     * 以下是Mail内容
     */
    @RequestMapping("/message.do")
    public String toPageMessage(){
        return  "mail/message";
    }//收件页面






}
