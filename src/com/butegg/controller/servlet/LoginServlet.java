package com.butegg.controller.servlet;

import com.butegg.pojo.User;
import com.butegg.service.impl.LoginServiceImpl;
import com.butegg.service.inter.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String likeme = request.getParameter("likeme");
        User yon = new LoginServiceImpl().login(username,password);
        if (yon!=null){
            if ("on".equals(likeme)){
                request.getSession().setAttribute("user1",yon);
            }
            response.getWriter().write("<h1 style=\"color: green\">登录成功！！！（3秒后跳转）</h1>");
            response.setHeader("refresh","3,url=/homePage.jsp");
//            request.getRequestDispatcher("/homePage.jsp").forward(request,response);
        }else {
            response.getWriter().write("<h1 style=\"color: red\">登陆失败！！！（3秒后跳转）</h1>");
            response.setHeader("refresh","3,url=/index.jsp");
//            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
