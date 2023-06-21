package com.example.notificationcenter.adapters;

public interface EmailService {
    public void send(String[] recipientEmail, String subject, String content);
}
