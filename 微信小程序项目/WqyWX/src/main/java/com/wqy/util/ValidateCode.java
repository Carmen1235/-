package com.wqy.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/9/20 13:23
 * @Description: 验证码
 */
public class ValidateCode {

    /**
     * 获取验证码和图片
     *
     * @return list包含两个对象,第一个是验证码对应字符串(String),第二个是验证码图片(BufferedImage)
     */
    public static ArrayList<Object> getSecurityCode(String code) {
        // 验证码图片对应的字符串
        StringBuilder sb = new StringBuilder();
        // 验证码图片宽高
        int width = 120;
        int height = 40;
        // 可能出现的字符
        char[] chars = code.toCharArray();
        // 随机数
        Random ran = new Random();
        // 创建空白画布
        BufferedImage bufImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 获得画笔
        Graphics2D g = (Graphics2D) bufImage.getGraphics();
        // 填充背景为随机颜色
        g.setColor(new Color(ran.nextInt(50), ran.nextInt(50), ran.nextInt(50)));
        g.fillRect(0, 0, width, height);
        // 填充字体
        g.setFont(new Font("font", Font.BOLD, 30));// 设置字体
        for (int i = 1; i <= 4; i++) {
            // 随机颜色,随机字符
            g.setColor(new Color(ran.nextInt(55) + 200, ran.nextInt(55) + 200, ran.nextInt(55) + 200));
            char ch = chars[i-1];
            sb.append(ch);
            // 设置字体倾斜
            int jiaodu = (int) (Math.random() * 60) - 30;// 旋转 -30 ~ 30度
            double theta = jiaodu * Math.PI / 180;// 换算弧度
            g.rotate(theta, width / 5 * i, height - 10);
            g.drawString(ch + "", width / 5 * i - 8, height - 10);// 画字符
            g.rotate(-theta, width / 5 * i, height - 10);
        }
        // 绘制干扰线
        int x1, x2, y1, y2;
        for (int i = 0; i < 5; i++) {
            g.setColor(new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255)));
            x1 = (int) (Math.random() * width);
            x2 = (int) (Math.random() * width);
            y1 = (int) (Math.random() * height);
            y2 = (int) (Math.random() * height);
            g.drawLine(x1, y1, x2, y2);
        }
        g.dispose();// 释放画笔资源
        // 返回验证码和图片
        ArrayList<Object> list = new ArrayList<>();
        list.add(sb.toString());
        list.add(bufImage);

        System.out.println(sb.toString());

//        try {
//            ImageIO.write(bufImage,"jpg",new File("C:\\test\\1.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Object> list = ValidateCode.getSecurityCode("abcd");
        System.out.println(list.get(0));
    }

}
