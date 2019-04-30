package com.wqy.controller.validate;

import com.wqy.util.ValidateCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/9/20 13:44
 * @Description: 验证码Controller
 */
@Controller
public class ValiDateController {

    @RequestMapping("/validate.do")
    public void test(HttpServletRequest request, HttpServletResponse response,String code) throws IOException {

        ArrayList<Object> list = ValidateCode.getSecurityCode(code);
        // 设置不缓存图片
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "No-cache");
        response.setDateHeader("Expires", 0);
        // 设置响应图片类型
        response.setContentType("image/jpeg");

//        HttpSession session = request.getSession();

        //设置session使其进行效验
//        System.out.println("controller: "+list.get(0));
//        session.setAttribute("validate",list.get(0));
        // 输出图片
        ImageIO.write((RenderedImage) list.get(1), "jpeg", response.getOutputStream());
    }
}
