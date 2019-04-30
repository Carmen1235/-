package com.wqy.controller;

import com.wqy.entity.User;
import com.wqy.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * 菜单控制
 */
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
        modelAndView.addObject("menu_address",user.getAddress());
        modelAndView.setViewName("menu");
        return modelAndView;
    }
    /**
     * 以下是提醒弹出窗
     */
    @RequestMapping("tooltip.do")
    public String toPageTooltip(String address){
        return "notice/tooltip";
    }
    /**
     * 以下是专利内容
     */

    @RequestMapping("/zl.do")
    public ModelAndView toPageZL(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("zlwh/zl");
        return modelAndView;
    }//专利

    @RequestMapping("/zlxz.do")
    public ModelAndView toPageZLXZ(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("zlwh/zlxz");
        return modelAndView;
    }//专利续展

    @RequestMapping("/zlxzNEW.do")
    public ModelAndView toPageZLXZNEW(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("zlwh/zlxzNEW");
        return modelAndView;
    }//专利续展NEW

    @RequestMapping("/zlwxxg.do")
    public ModelAndView toPageZLWXXG(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("zlwh/zlwxxg");
        return modelAndView;
    }//专利无效宣言

    @RequestMapping("/zlzr.do")
    public ModelAndView toPageZLZR(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("zlwh/zlzr");
        return modelAndView;
    }//专利转让

    @RequestMapping("/zlss.do")
    public ModelAndView toPageZLSS(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("zlwh/zlss");
        return modelAndView;
    }//专利诉讼
    /**
     * 以下是商标内容
     */

    @RequestMapping("/sb.do")
    public ModelAndView toPageSB(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        System.out.println("测试"+address);
        modelAndView.setViewName("sbwh/sb");
        return modelAndView;
    }//商标

    @RequestMapping("/sbyy.do")
    public ModelAndView toPageSBYY(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("sbwh/sbyy");
        return modelAndView;
    }//商标异议

    @RequestMapping("/sbcx.do")
    public ModelAndView toPageSBCX(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("sbwh/sbcx");
        return modelAndView;
    }//商标撤销

    @RequestMapping("/sbss.do")
    public ModelAndView toPageSBSS(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("sbwh/sbss");
        return modelAndView;
    }//商标诉讼

    @RequestMapping("/sbjc.do")
    public ModelAndView toPageSBJC(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("sbwh/sbjc");
        return modelAndView;
    }//商标检测

    @RequestMapping("/sbsy.do")
    public ModelAndView toPageSBSY(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("sbwh/sbsy");
        return modelAndView;
    }//商标使用

    @RequestMapping("/sbzr.do")
    public ModelAndView toPageSBZR(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("sbwh/sbzr");
        return modelAndView;
    }//商标转让

    @RequestMapping("/sbxk.do")
    public ModelAndView toPageSBXK(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("sbwh/sbxk");
        return modelAndView;
    }//商标许可

    /**
     * 以下是提醒菜单
     * @return
     */

    //商标提醒
    @RequestMapping("/txss.do")
    public ModelAndView toPageTXSX(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("notice/txss");
        return modelAndView;
    }
    //专利提醒
    @RequestMapping("/zltx.do")
    public ModelAndView toPageZLTX(String address){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("address",address);
        modelAndView.setViewName("notice/zltx");
        return modelAndView;
    }
    /**
     * 以下是邮件菜单
     */

    @RequestMapping("/mail.do")
    public String toPageMail(){
        return "mail/mail";
    }


    /**
     * 管理员
     * @return
     */
    //用户管理
    @RequestMapping("/users.do")
    public String toPageAdmin(){
        return "admin/users";
    }


}
