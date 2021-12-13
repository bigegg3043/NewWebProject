package com.butegg.test;

import com.butegg.controller.vo.EmpVo;
import com.butegg.service.impl.AllServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestAll {
    @Test
    public void test01(){
        List<EmpVo> empVos = new AllServiceImpl().sellectAllEmp();
        for (EmpVo empVo : empVos) {
            System.out.println(empVo);
        }
    }
}
