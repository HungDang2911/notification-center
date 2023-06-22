package com.example.notificationcenter.ingestors.impl;

import org.springframework.mail.SimpleMailMessage;

public class EmailIngestorImpl extends BaseIngestorImpl{
    @Override
    void preIngest() {

    }

    @Override
    void ingest() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("");
        message.setTo(recipientEmails);
        message.setSubject(subject);
        message.setText(content);

        emailSender.send(message);
    }

    @Override
    void postIngestIfSuccess() {

    }

    @Override
    void postIngestIfFailed() {

    }
}
