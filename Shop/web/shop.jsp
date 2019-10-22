<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/25
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">

    <title>后台管理系统</title>
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body{
            margin-top: 65px;
        }
        .col-md-2{
            background-color: #ccc;
            /*?*/
            height: 600px;
        }
        #left-content{
            margin-top: 20px;
        }
        .list-group{
            padding-left: 0;
        }
        #panel-group{
            margin-top: 20px;
        }
        #onebtn{
            margin: 10px 0;
        }
        #btngroup button{
            width: 100%;
        }
        .progress{
            margin-top: 15px;
        }

    </style>

</head>

<body>
<nav class="navbar navbar-default navbar-fixed-top navbar-inverse" role="navigation">
    <!--container-fluid表示自适应大小，container表示居中-->
    <div class="container">
        <!--定义顶部导航栏-->
        <div class="navbar-header">
            <!--button是当屏幕小于多少时出现的可以打开导航列表的按钮-->
            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#demo-navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">某管理系统</a>
        </div>

        <!--collapse用于导航栏折叠之后数据在button按钮里点击显示-->
        <div class="collapse navbar-collapse" id="demo-navbar">
            <!--nav navbar-nav表示显示在导航栏里-->
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">首页</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">功能<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <!--通过dropdown-header来标记一组动作-->
                        <li class="dropdown-header">信息</li>
                        <li><a href="add.jsp" target="if1">信息建立</a></li>
                        <li><a href="#">信息查询</a></li>
                        <li><a href="#">信息管理</a></li>
                    </ul>
                </li>

                <li><a href="#" data-toggle="modal" data-target="#about">帮助</a></li>

                <span style="font-size: 20px;color:#00bcd4;margin-left: 300px">${requestScope.username}欢迎您！</span>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
            <div class="text-center" id="left-content">
                <div class="list-group">
                    <a href="#" class="list-group-item active">首页</a>
                </div>
                <div class="list-group">
                    <a href="/query.do" class="list-group-item" target="if1">信息查询</a>
                    <a href="#" class="list-group-item">信息管理</a>
                    <a href="add.jsp" target="if1" class="list-group-item">信息建立</a>
                </div>
                <div class="list-group">
                    <a href="#" class="list-group-item">设置</a>
                    <a href="#" class="list-group-item">帮助</a>
                </div>
            </div>
        </div>

        <div class="col-md-10"  style="width: 82%;height: 550px;">
            <iframe name="if1" style="width: 100%;height: 100%">

            </iframe>
        </div>

    </div>

</div>

<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>