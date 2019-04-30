package com.wqy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/8/31 11:21
 * @Description: 测试
 */
@Controller
public class TestController {

    @RequestMapping("/test.do")
    public void test(){
        System.out.println("test");
    }
}
