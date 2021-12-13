package com.butegg.dao.impl;

import com.butegg.dao.inter.LoginDao;
import com.butegg.pojo.User;
import com.butegg.utils.DBUtil;

import java.sql.*;

public class LoginDaoImpl implements LoginDao {
    @Override
    public User selectUser(String username, String password) throws Exception{
        Connection connection = DBUtil.getConnection();
        String sql = "SELECT id,username,`password` FROM tuser WHERE username=? AND password=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            return new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"));
        }
        return null;
    }
}
