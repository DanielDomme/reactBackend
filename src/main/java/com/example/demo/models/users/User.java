package com.example.demo.models.users;

import lombok.Getter;

@Getter
public class User {
    private String userName;
    private String password;
    private String role;

    public User(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
}
