package com.butegg.controller.vo;

import lombok.Data;

@Data
public class User {
    int id;
    String name;
    String admin;

    public User() {
    }

    public User(int id, String name, String admin) {
        this.id = id;
        this.name = name;
        this.admin = admin;
    }
}
