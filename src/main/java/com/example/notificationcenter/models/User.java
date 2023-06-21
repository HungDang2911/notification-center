package com.example.notificationcenter.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String phoneNumber;
    @OneToMany(mappedBy = "user")
    private List<Device> devices;
}
