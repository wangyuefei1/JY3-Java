<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/27
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="border: 1px solid;padding: 2px">
    <thead>
    <td>ID</td>
    <td>商品名称</td>
    <td>商品价格</td>
    <td>商品图片</td>
    <td>商品描述</td>
    <td>商品库存</td>
    <td>商品日期</td>
    <td>商品分类</td>
    <td>生产厂家</td>
    </thead>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.pro_id}</td>
            <td>${product.pro_name}</td>
            <td>${product.pro_price}</td>
            <td><img src="/imgs/${product.pro_image}"  style="width: 20px;height: 20px">   </td>
            <td>${product.pro_des}</td>
            <td>${product.pro_stock}</td>
            <td>${product.pro_date}</td>
            <td>${product.pro_category_id}</td>
            <td>${product.pro_factory}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
