package com.wqy.service;

import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

/**
 * 发送邮件Controller
 */
@Service
public interface SendMailService {
    public void send() throws MessagingException;

    public void testSendMail() throws MessagingException;
}
