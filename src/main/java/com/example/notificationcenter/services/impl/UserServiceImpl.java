package com.example.notificationcenter.services.impl;

import com.example.notificationcenter.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;
}
