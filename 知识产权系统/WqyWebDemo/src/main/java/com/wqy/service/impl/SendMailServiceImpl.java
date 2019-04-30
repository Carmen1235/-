package com.wqy.service.impl;

import com.wqy.dao.mapper.BrandNoticeMapper;
import com.wqy.dao.mapper.MailMapper;
import com.wqy.entity.Mail;
import com.wqy.pojo.brand.BrandNoticeInfo;
import com.wqy.service.SendMailService;
import com.wqy.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import static com.wqy.util.MailUtil.*;

/**
 * @author WordK 王秋叶
 * @create 2018-07-04 13:23
 * @desc 发送邮件ServiceImpl
 **/
@Service
public class SendMailServiceImpl implements SendMailService{
    @Autowired
    private BrandNoticeMapper brandNoticeMapper;

    /**
     * 发送邮件
     */
    @Override
    public void send() throws MessagingException {
        //邮箱信息
        Mail mailInfo = this.getMailInfo();
        //提醒信息
        List<BrandNoticeInfo> lists = this.getSBNoticeContent();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String now = sdf.format(new Date());
        for(BrandNoticeInfo notice :lists){
            /**
             * 判断现在时间和提醒时间 一致时候进行发送邮件
             */
           if(sdf.format(notice.getTxrq()).equals(now)){
               /*设置smtp服务器*/
               Properties pro = MailUtil.setProperties(mailInfo.getSmtpAddress());
               /*创建会话*/
               Session session = createSession(pro, mailInfo.getMailUser(), mailInfo.getMailPassword());
               /*创建邮件*/
               MimeMessage mimeMessage = setMimemessage1(session, mailInfo.getFromMail(), mailInfo.getToMail());

//        BodyPart bodyPart = setContentText(mimeMessage, "邮件内容");//设置邮件内容
               BodyPart bodyPart = setContentHtml(mimeMessage, mailInfo.getContent());
//               BodyPart bodyPart1 = setContentImageOrAttachment(mimeMessage, "C:\\ff60ff21-444c-4d8a-aac0-056c2154be1e.png");
               MimeMultipart multipart = new MimeMultipart();
               /*添加内容*/
               multipart.addBodyPart(bodyPart);
//               multipart.addBodyPart(bodyPart1);//添加图片
               multipart.setSubType("mixed");
               /*添加所有内容*/
               mimeMessage.setContent(multipart);
                /*设置主题*/
               mimeMessage.setSubject(mailInfo.getSubject());
               //设置附件
               /*保存邮件*/
               mimeMessage.saveChanges();
                /*发送邮件*/
               sendMail(session,mimeMessage,mailInfo.getMailUser(),mailInfo.getMailPassword(),mailInfo.getToMail());
           }
        }
    }

    /**
     * 获取提醒的数据
     */
    public List<BrandNoticeInfo> getSBNoticeContent(){
        List<BrandNoticeInfo> list = brandNoticeMapper.selectByEnables("开启");
        return list;
    }

    /**
     * 获取邮箱数据
     */

    @Autowired
    private MailMapper mailMapper;
    public Mail getMailInfo(){
        Mail mail = mailMapper.selectByPrimaryKey("mail-admin");
        return mail;
    }

    @Override
    public void testSendMail() throws MessagingException {
        //邮箱信息
        Mail mailInfo = this.getMailInfo();
        /*设置smtp服务器*/
        Properties pro = MailUtil.setProperties(mailInfo.getSmtpAddress());
        /*创建会话*/
        Session session = createSession(pro, mailInfo.getMailUser(), mailInfo.getMailPassword());
        /*创建邮件*/
        MimeMessage mimeMessage = setMimemessage1(session, mailInfo.getFromMail(), mailInfo.getToMail());

//        BodyPart bodyPart = setContentText(mimeMessage, "邮件内容");//设置邮件内容
        BodyPart bodyPart = setContentHtml(mimeMessage, mailInfo.getContent());
//               BodyPart bodyPart1 = setContentImageOrAttachment(mimeMessage, "C:\\ff60ff21-444c-4d8a-aac0-056c2154be1e.png");
        MimeMultipart multipart = new MimeMultipart();
        /*添加内容*/
        multipart.addBodyPart(bodyPart);
//               multipart.addBodyPart(bodyPart1);//添加图片
        multipart.setSubType("mixed");
        /*添加所有内容*/
        mimeMessage.setContent(multipart);
        /*设置主题*/
        mimeMessage.setSubject(mailInfo.getSubject());
        //设置附件
        /*保存邮件*/
        mimeMessage.saveChanges();
        /*发送邮件*/
        sendMail(session,mimeMessage,mailInfo.getMailUser(),mailInfo.getMailPassword(),mailInfo.getToMail());
    }
}
