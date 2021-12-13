package com.butegg.service.inter;

import com.butegg.controller.vo.EmpVo;
import com.butegg.controller.vo.User;

import java.util.List;

public interface AllService {
    List<User> sellectAll();
    List<EmpVo> sellectAllEmp();
}
