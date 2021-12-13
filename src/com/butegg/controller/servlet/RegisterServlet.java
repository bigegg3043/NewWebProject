package com.butegg.controller.servlet;

import com.butegg.service.impl.RegServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet",urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean b = new RegServiceImpl().regUser(username,password);
        if (b){
            response.getWriter().write("<h1 style=\"color: green\">注册成功！！！（3秒后跳转登录页面）</h1>");
            response.setHeader("refresh","3,url=/index.jsp");
        }else {
            response.getWriter().write("<h1 style=\"color: red\">注册失败，请重试！（3秒后跳转注册页面）</h1>");
            response.setHeader("refresh","3,url=/reg.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
