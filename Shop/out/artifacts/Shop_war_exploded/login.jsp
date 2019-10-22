<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/25
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
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
<body>
<div id="div1">
    <form class="form-horizontal" action="/login.do" method="post">
        <div class="form-group">
            <label for="username1" class="col-sm-2 control-label">user</label>
            <div class="col-sm-10">

                <input type="text"  name="username" class="form-control" id="username1" placeholder="Username">
                <span id="user"></span>
            </div>
        </div>
        <div class="form-group">
            <label for="password1" class="col-sm-2 control-label">PSW</label>
            <div class="col-sm-10">
                <input type="password" name="password" class="form-control" id="password1" placeholder="Password">
                <span id="psw"></span>
            </div>
        </div>
        <div class="form-group">
            <label for="yanz" class="col-sm-2 control-label">Check</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="yanz">
                <span id="yan"></span>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default" id="btn1">Login</button>
            </div>
        </div>
    </form>
</div>
</body>
<script type="text/javascript" src="js/login.js"></script>
</html>
