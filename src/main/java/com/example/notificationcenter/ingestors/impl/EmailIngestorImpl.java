package com.example.notificationcenter.ingestors.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@RequiredArgsConstructor
public class EmailIngestorImpl extends BaseIngestorImpl{
    private final JavaMailSender emailSender;
    @Override
    void preIngest() {

    }

    @Override
    void ingest() {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("");
//        message.setTo(recipientEmails);
//        message.setSubject(subject);
//        message.setText(content);
//
//        emailSender.send(message);
    }

    @Override
    void postIngestIfSuccess() {

    }

    @Override
    void postIngestIfFailed() {

    }
}
