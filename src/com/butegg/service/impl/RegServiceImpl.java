package com.butegg.service.impl;

import com.butegg.dao.impl.RegDaoImpl;
import com.butegg.service.inter.RegService;

public class RegServiceImpl implements RegService {
    @Override
    public boolean regUser(String username, String password) {
        int i = 0;
        try {
            i = new RegDaoImpl().addUser(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i==1){
            return true;
        }
        return false;
    }
}
