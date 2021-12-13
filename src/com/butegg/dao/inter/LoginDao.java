package com.butegg.dao.inter;

import com.butegg.pojo.User;

public interface LoginDao {
    User selectUser(String username,String password) throws Exception;
}
