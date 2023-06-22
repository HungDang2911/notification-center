package com.example.notificationcenter.services;

public interface EmailService {
    public void send(String[] recipientEmail, String subject, String content);
}
