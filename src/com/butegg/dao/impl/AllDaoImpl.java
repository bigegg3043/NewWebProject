package com.butegg.dao.impl;

import com.butegg.controller.vo.EmpVo;
import com.butegg.dao.inter.AllDao;
import com.butegg.pojo.TUser;
import com.butegg.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AllDaoImpl implements AllDao {
    @Override
    public List<TUser> selectAll() throws Exception{
        Connection connection = DBUtil.getConnection();
        String sql = "SELECT id,username,`password`,pri FROM tuser";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet resultSet = ps.executeQuery();
        List<TUser> tUserList = new ArrayList<>();
        while (resultSet.next()){
            tUserList.add(new TUser(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4)));
        }
        return tUserList;
    }

    @Override
    public List<EmpVo> selectAllEmp() throws Exception {
        Connection connection = DBUtil.getConnection();
        String sql = "SELECT l.empno,l.ename AS `name`,l.sal,l.hiredate,dept.dname,dept.loc,r.ename AS bossName FROM `emp` AS l INNER JOIN `emp` AS r ON l.superior = r.empno INNER JOIN dept ON dept.deptno=l.deptno";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet r = ps.executeQuery();
        List<EmpVo> empVos = new ArrayList<>();
        while (r.next()){
            empVos.add(new EmpVo(r.getInt(1),r.getString(2),r.getBigDecimal(3),r.getDate(4),r.getString(5),r.getString(6),r.getString(7)));
        }
        return empVos;
    }
}
