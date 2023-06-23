package com.example.notificationcenter.services.impl;

import com.example.notificationcenter.services.EmailService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final Logger logger = LoggerFactory.getLogger("Email");
    @Override
    public void send(String[] recipientEmails, String subject, String content) {

    }
}
