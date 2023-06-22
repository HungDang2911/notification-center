package com.example.notificationcenter.controllers;


import com.example.notificationcenter.services.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmailController {
    private final EmailService emailService;

    @RequestMapping(value="/email/send", method = RequestMethod.POST)
    public int sendEmail() {
        return 0;
    }
}
