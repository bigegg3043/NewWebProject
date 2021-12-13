package com.butegg.pojo;

import lombok.Data;

@Data
public class TUser {
    int id;
    String username;
    String password;
    int admin;

    public TUser() {
    }

    public TUser(int id, String username, String password, int admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.admin = admin;
    }
}
