package com.butegg.controller.servlet;

import com.butegg.controller.vo.EmpVo;
import com.butegg.controller.vo.User;
import com.butegg.service.impl.AllServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SellectAllServlet",urlPatterns = "/SellectAllServlet")
public class SellectAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<EmpVo> empVos = new AllServiceImpl().sellectAllEmp();
        request.setAttribute("emps",empVos);
        request.getRequestDispatcher("/homePage.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
