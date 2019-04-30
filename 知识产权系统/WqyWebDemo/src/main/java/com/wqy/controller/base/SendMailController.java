package com.wqy.controller.base;

import com.wqy.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.mail.MessagingException;

/**
 * 定时发送
 * 发送邮件Controller
 */
@Controller
public class SendMailController {

    @Autowired
    private SendMailService sendMailService;

    // 每天凌晨1点执行一次
    @Scheduled(cron = "0 0 1 * * ?")
    public  void sendMail(){
        System.out.println("开启1点的定时器");
        try {
            sendMailService.send();//发送邮件

        } catch (MessagingException e) {
            System.out.println("发送邮件异常");
            e.printStackTrace();
        }
    }

    // 每天12点执行一次
    @Scheduled(cron = "0 0 12 * * ?")
    public void sendMail1(){
        System.out.println("开启12点的定时器");
        try {
            sendMailService.send();//发送邮件

        } catch (MessagingException e) {
            System.out.println("发送邮件异常");
            e.printStackTrace();
        }
    }

    /**
     * 测试发送邮件服务
     * @throws MessagingException
     */
    @GetMapping("/testSendMail")
    public void testSendMail() throws MessagingException {
        sendMailService.testSendMail();
    }
}
