<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/25
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <style>
        body
        {
            margin: 0;
            padding: 0;
            background-color: aquamarine;
        }
        #div1
        {
            width: 300px;
            height: 300px;
            margin: 0 auto;
            margin-top: 200px;
        }
    </style>
</head>
<body style="position: relative">
<span style="position: absolute;font-size: 50px;color: #00bcd4;margin-top: -100px;margin-left: 450px">管理员登录</span>
<div id="div1">
<form class="form-horizontal" action="/register.do" method="post">
    <div class="form-group">
        <label for="username" class="col-sm-2 control-label">user</label>
        <div class="col-sm-10">

            <input type="text"  name="username" class="form-control" id="username" placeholder="Username">
            <span id="user"></span>
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">PSW</label>
        <div class="col-sm-10">
            <input type="password" name="password" class="form-control" id="password" placeholder="Password">
            <span id="psw"></span>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default" id="btn1">Register</button>
            <a href="login.jsp"><button class="btn btn-default">Login</button></a>
        </div>
    </div>
</form>
</div>
</body>
<script type="text/javascript" src="js/register.js"></script>
</html>
