package com.butegg.dao.inter;

import com.butegg.controller.vo.EmpVo;
import com.butegg.pojo.TUser;


import java.util.List;

public interface AllDao {
    List<TUser> selectAll() throws Exception;
    List<EmpVo> selectAllEmp() throws Exception;
}
