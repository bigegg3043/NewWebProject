package com.butegg.controller.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class EmpVo {;
    int id;
    String name;
    BigDecimal sal;
    Date time;
    String bm;
    String bmAddress;
    String boos;

    public EmpVo() {
    }

    public EmpVo(int id, String name, BigDecimal sal, Date time, String bm, String bmAddress, String boos) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.time = time;
        this.bm = bm;
        this.bmAddress = bmAddress;
        this.boos = boos;
    }
}
