<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/17
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/login.do" method="get">
    用户名：<input type="text" name="username">
    密码: <input type="password" name="password">
    <input type="submit" value="登录">
    <a href="updatepsw.jsp"> <input type="button"  value="修改密码"></a>
</form>
</body>
</html>
