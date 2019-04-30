package com.wqy.util;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * @author WordK
 * date 2018/06/19
 * mail Jar Version 1.6.1
 */
public class MailUtil {


    //测试邮件发送
    public static void main(String[] args) throws MessagingException {
        Properties pro = setProperties("smtp.163.com");//设置smtp服务器
        Session session = createSession(pro, "18758365020@163.com", "wqy1314");//创建会话
        MimeMessage mimeMessage = setMimemessage1(session, "18758365020@163.com", "wqy@activa-leisure.com");//创建邮件

//        BodyPart bodyPart = setContentText(mimeMessage, "邮件内容");//设置邮件内容
        BodyPart bodyPart = setContentHtml(mimeMessage, "<a href=\"www.baidu.com\" target=\"_blank\">Baidu</a>");
        BodyPart bodyPart1 = setContentImageOrAttachment(mimeMessage, "C:\\ff60ff21-444c-4d8a-aac0-056c2154be1e.png");
        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(bodyPart);//添加内容
        multipart.addBodyPart(bodyPart1);//添加图片
        multipart.setSubType("mixed");//混合关系 还有一个related 关联关系
        mimeMessage.setContent(multipart);//添加所有内容

        mimeMessage.setSubject("主题2018");//设置主题
        //设置附件
        mimeMessage.saveChanges();//保存邮件

        sendMail(session,mimeMessage,"18758365020@163.com","wqy1314","wqy@activa-leisure.com");//发送邮件

    }

    /**    《一》
     *  1.配置邮件服务器参数 用来连接邮件服务器
     * @param smtp 发件人的邮箱的SMTP服务器地址
     */
    public static Properties setProperties(String smtp){
        System.out.println("开始配置连接邮件服务器参数...");
        Properties pro = new Properties();
        pro.setProperty("mail.transport.protocol", "smtp");//使用协议（工具javamail规范要求）
        pro.setProperty("mail.host", smtp);//发件人的邮箱的SMTP服务器地址
        pro.setProperty("mail.smtp.auth", "true");//需要请求认证
        System.out.println("完成配置连接邮件服务器参数...");
        return pro;
    }

    /** 《二》
     *  2.创建邮件发送的会话
     * @param pro 连接邮件服务器的配置
     * @param username 登陆邮件服务器的账号 （一般为邮箱账号）
     * @param password 登陆邮件服务器的密码 （一般为邮箱密码）
     * @return
     */
    public static Session createSession(Properties pro, final String username, final String password){
        Session session = Session.getInstance(pro, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }
        });
        return session;
    }

    /**  《三》
     * 3.设置邮件信息（收件人，发件人）不带昵称
     *
     * @param session 邮件会话;
     * @param from    发件邮箱地址;
     * @param to      收件邮箱地址
     */
    public static MimeMessage setMimemessage1(Session session, String from, String to) {
        MimeMessage mimeMessage = new MimeMessage(session);//创建邮件

        try {
            mimeMessage.setFrom(new InternetAddress(from));//设置发件人邮箱第二种方式 一般使用这种的就够了
        } catch (MessagingException e) {
            System.err.println("设置发件人邮箱异常");
            e.printStackTrace();
        }
        try {
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));//设置收件人邮箱地址
        } catch (MessagingException e) {
            System.err.println("设置收件人邮箱异常");
            e.printStackTrace();
        }
        return mimeMessage;
    }



    /** 《三》
     * 3.设置邮件信息（收件人，发件人）带昵称
     *
     * @param session 邮件会话
     * @param from    发件邮箱地址
     * @param nc1     发件邮箱昵称
     * @param to      收件邮箱地址
     * @param nc2     收件邮箱昵称
     */
    public static MimeMessage setMimemessage2(Session session, String from, String nc1, String to, String nc2) {
        MimeMessage mimeMessage = new MimeMessage(session);//创建邮件

        try {
            mimeMessage.setFrom(new InternetAddress(from, nc1, "UTF-8")); //设置发件人邮箱第一种方式 （发件邮箱地址，昵称，字符集）
        } catch (MessagingException e) {
            System.err.println("设置发件人邮箱异常");
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            System.err.println("设置发件人邮箱编码异常");
            e.printStackTrace();
        }
        try {
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to, nc2, "UTF-8"));//设置收件人邮箱第一种方式 （收件邮箱地址，昵称，字符集）
        } catch (MessagingException e) {
            System.err.println("设置收件人邮箱异常");
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            System.err.println("设置收件人邮箱编码异常");
            e.printStackTrace();
        }
        return mimeMessage;
    }

    /** 《四》
     * 4.设置邮件内容 只带文字
     * @param mimeMessage 邮件
     * @param contentText 文本内容，要写的内容
     */
    public static BodyPart setContentText(MimeMessage mimeMessage,String contentText){
        MimeBodyPart bodyPart = new MimeBodyPart();
        try {
            bodyPart.setText(contentText);
        } catch (MessagingException e) {
            System.err.println("设置邮件文本内容失败");
            e.printStackTrace();
        }
        return bodyPart;
    }

    /** 《四》
     * 4.设置邮件内容 只带文字
     * @param mimeMessage 邮件
     * @param html html格式的文本内容，要写的内容
     */
    public static BodyPart setContentHtml(MimeMessage mimeMessage,String html){
        MimeBodyPart bodyPart = new MimeBodyPart();
        try {
            bodyPart.setContent(html,"text/html;charset=UTF-8");
        } catch (MessagingException e) {
            System.err.println("设置邮件Html文本内容失败");
            e.printStackTrace();
        }
        return bodyPart;
    }

    /** 《四》
     * 4.设置邮件内容 只带图片/附件
     * @param mimeMessage 邮件
     * @param filePath 图片/附件存放的路径地址
     */
    public static BodyPart setContentImageOrAttachment(MimeMessage mimeMessage,String filePath){
        //配置图片
        DataHandler dh = new DataHandler(new FileDataSource(filePath));
        //创建邮件内容主体部分
        MimeBodyPart bodyPart = new MimeBodyPart();
        try {
            bodyPart.setDataHandler(dh);//设置图片
            bodyPart.setFileName(dh.getName());//设置图片名字
        } catch (MessagingException e) {
            System.err.println("设置邮件附件图片失败");
            e.printStackTrace();
        }
        return bodyPart;
    }

    /** 《四》
     * 4.设置邮件内容 只带图片并显示再文本
     * @param mimeMessage 邮件
     * @param imagePath 图片存放的路径地址
     */
    public static BodyPart setContentImage2(MimeMessage mimeMessage,String imagePath){
        //配置图片
        DataHandler dh = new DataHandler(new FileDataSource(imagePath));
        //创建邮件内容主体部分
        MimeBodyPart bodyPart = new MimeBodyPart();
        try {
            bodyPart.setDataHandler(dh);
        } catch (MessagingException e) {
            System.err.println("设置邮件附件/图片失败");
            e.printStackTrace();
        }
        return bodyPart;
    }

    /** 《五》
     * 发送邮件
     * @param session
     * @param mimeMessage
     * @param username
     * @param password
     * @param to
     */
    public static void sendMail(Session session,MimeMessage mimeMessage,String username,String password,String to){
        System.out.println("开启邮箱传输...");
        Transport transport = null;
        try {
            transport = session.getTransport();
            transport.connect(username,password);//连接邮件
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        try {
            transport.sendMessage(mimeMessage,new Address[]{new InternetAddress(to)});//发送邮件
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        try {
            transport.close();//关闭邮件传输
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        System.out.println("完成邮箱传输...");
    }
}
