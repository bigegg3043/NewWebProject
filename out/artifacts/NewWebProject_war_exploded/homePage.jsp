<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/10
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>鸡蛋网-主页</title>
    <link rel="stylesheet" href="layui.css">
    <script src="layui.js"></script>
    <script src="jquery-3.6.0.min.js"></script>
    <script>
        function tijiao() {
            document.getElementById("idform").submit();
        }
    </script>
    <style>
        table tr:hover {background-color:yellow;}

        table {font-family: verdana,arial,sans-serif;font-size:33px;color:#333333;border-width: 1px;border-color: #666666;border-collapse: collapse;}

        table th {border-width: 1px;padding: 8px;border-style: solid;border-color: #666666;background-color: #17a2b8;}

        table td {border-width: 1px;padding: 8px;border-style: solid;border-color: #666666;background-color: #80bdff;}

        .button1{border-width: 1px;padding: 8px;border-style: solid;border-color: #666666;background-color: #80bdff;font-size: 33px}

        .int1{border: none;width: 200px;height: 60px}
    </style>
</head>
<body style=" display: flex;
        justify-content: center;
        align-items: center;
        background-image: url(bg1.png);
">
<div>
    <div style=" display: flex;
        justify-content: center;
        align-items: center;">
        <form action="/SellectIdServlet" method="post" id="idform">
            <input class="int1" type="text" placeholder="请输入要查询的ID">
        </form>
        <button class="button1" onclick="tijiao()">查询ID</button>
        <form action="/SellectAllServlet" method="post">
            <input class="button1" type="submit" value="查询所有">
        </form>
    </div>
    <br>
    <table id="demo">
        <tr>
            <th>工号</th>
            <th>员工姓名</th>
            <th>薪资/月</th>
            <th>入职时间</th>
            <th>所属部门</th>
            <th>部门所在地址</th>
            <th>直属上司</th>
            <th colspan="2">操作</th>
        </tr>
        <c:forEach items="${requestScope.emps}" var="emp">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.sal}</td>
                <td>${emp.time}</td>
                <td>${emp.bm}</td>
                <td>${emp.bmAddress}</td>
                <td>${emp.boos}</td>
                <td><span><a href="#" style="color: red">删除</a></span></td>
                <td><span><a href="/UpServlet?id=${u.id}" style="color: green">修改</a></span></td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
