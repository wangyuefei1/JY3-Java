<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/20
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
    <form action="/updatepsw" method="get">
        用户名：<input  type="text" name="username">
        <br/>
        原密码：<input type="text" name="password">
        <br/>
        新密码: <input type="text " name="newpsw">
        <input type="submit" value="确定">
    </form>
</head>
<body>

</body>
</html>
