package com.butegg.service.impl;

import com.butegg.dao.impl.LoginDaoImpl;
import com.butegg.dao.inter.LoginDao;
import com.butegg.pojo.User;
import com.butegg.service.inter.LoginService;

public class LoginServiceImpl implements LoginService {
    LoginDao loginDao;

    public LoginServiceImpl() {
        loginDao= new LoginDaoImpl();
    }

    @Override
    public User login(String username, String password) {
        User user = null;
        try {
            user = loginDao.selectUser(username,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
       return user;
    }
}
