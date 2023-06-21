package com.example.notificationcenter.repositories;

import com.example.notificationcenter.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
