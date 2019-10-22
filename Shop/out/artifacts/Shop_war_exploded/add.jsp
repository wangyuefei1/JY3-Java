<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/24
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
<div style="width: 500px ;height: 500px;">
<form  enctype="multipart/form-data" action="add.do" method="post">

        <div class="form-group">
            <label for="exampleInputEmail1">商品名称</label>
            <input type="text" class="form-control" id="exampleInputEmail1" name="pro_name">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">商品价格</label>
            <input type="text" class="form-control" id="exampleInputPassword1" name="pro_price">
        </div>
        <div class="form-group">
            <label for="exampleInputFile">商品图片</label>
            <input type="file" id="exampleInputFile" name="pro_image">
        </div>
        <div class="form-group">
            <label for="exampleInputFile1">商品描述</label>
            <textarea  id="exampleInputFile1" name="pro_des"></textarea>
        </div>
        <div class="form-group">
            <label for="exampleInputFile2">商品库存</label>
            <input type="number" id="exampleInputFile2" name="pro_stock">
        </div>
        <div class="form-group">
            <label for="exampleInputFile3">商品上架日期</label>
            <input type="date" id="exampleInputFile3" name="pro_date">
        </div>
        <div class="form-group">
            <label for="exampleInputFile4">商品类别</label>
            <input type="text" id="exampleInputFile4" name="pro_category_id">
        </div>
        <div class="form-group">
            <label for="exampleInputFile5">商品厂家</label>
            <input type="text" id="exampleInputFile5" name="pro_factory">
        </div>
        <button type="submit" class="btn btn-default">确认</button>

</form>
</div>
</body>
</html>
