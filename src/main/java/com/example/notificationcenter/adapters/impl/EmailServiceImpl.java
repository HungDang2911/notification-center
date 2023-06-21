package com.example.notificationcenter.adapters.impl;

import com.example.notificationcenter.adapters.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private JavaMailSender emailSender;
    private static final Logger logger = LoggerFactory.getLogger("Email");
    @Override
    public void send(String[] recipientEmails, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("");
        message.setTo(recipientEmails);
        message.setSubject(subject);
        message.setText(content);

        logger.info("");
        emailSender.send(message);
    }
}
