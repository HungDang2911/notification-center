package com.example.notificationcenter.services.impl;

import com.example.notificationcenter.repositories.DeviceRepository;
import com.example.notificationcenter.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceRepository deviceRepository;
}
