package com.butegg.pojo;

import lombok.Data;

@Data
public class User {
    int id;
    String username;
    String password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
