package com.butegg.service.impl;

import com.butegg.controller.vo.EmpVo;
import com.butegg.controller.vo.User;
import com.butegg.dao.impl.AllDaoImpl;
import com.butegg.pojo.TUser;
import com.butegg.service.inter.AllService;

import java.util.ArrayList;
import java.util.List;

public class AllServiceImpl implements AllService {
    @Override
    public List<User> sellectAll() {
        List<User> ulist = new ArrayList<>();
        try {
            List<TUser> list = new AllDaoImpl().selectAll();
            for (TUser tUser:list){
                ulist.add(new User(tUser.getId(),tUser.getUsername(),getAdmin(tUser.getAdmin())));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ulist;
    }

    @Override
    public List<EmpVo> sellectAllEmp() {
        List<EmpVo> empVos = null;
        try {
            empVos = new AllDaoImpl().selectAllEmp();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return empVos;
    }

    public String getAdmin(int admin){
        if (admin==0){
            return "普通用户";
        }else {
            return "管理员";
        }
    }
}
