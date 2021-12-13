package com.butegg.dao.impl;

import com.butegg.dao.inter.RegDao;
import com.butegg.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegDaoImpl implements RegDao {
    @Override
    public int addUser(String username, String password) throws Exception{
        Connection connection = DBUtil.getConnection();
        String sql = "INSERT INTO tuser (username,password) VALUES (?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2,password);
        return ps.executeUpdate();
    }
}
