package com.example.notificationcenter.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
    @Bean
    public JavaMailSender mailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("");
        mailSender.setPort(123);

        mailSender.setUsername("123");
        mailSender.setPassword("");

        return mailSender;
    }
}
