package com.example.notificationcenter.repositories;

import com.example.notificationcenter.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
