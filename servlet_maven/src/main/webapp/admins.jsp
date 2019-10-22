<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.neuedu.pojo.Admin"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8" isErrorPage="true" isELIgnored="false"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
/* session验证 */
	Admin admin = (Admin)session.getAttribute("admin");
	if(admin == null){
		response.sendRedirect("admin_login.jsp");
		return;
	}

%>
<!DOCTYPE html>
<html>
<head>
<title>管理员列表</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<div id="wrap">
		<div id="top_content">
			<div id="header">
				<div id="rightheader">
					<p id="date">
					<%-- <%
						Date date = new Date();
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						String now = sdf.format(date);
					%>
						<%=now %> --%>
					<script type="text/javascript">
						window.setInterval(function(){
							var date = new Date();
							var elmDate = document.getElementById("date");
							elmDate.innerHTML = date;
						}, 1000);
					</script>
						<br />
					</p>
					<a href="admin_login.jsp">登录</a>
					<a href="admin_logout.do">注销</a>
				</div>
				<div id="topheader">
					<h1 id="title">
						<a href="#">员工管理系统</a>
					</h1>
				</div>
				<div id="navigation"></div>
			</div>
			<div id="content">
				<p id="whereami"></p>
				<h1>管理员列表</h1>
				<table class="table">
					<tr class="table_header">
						<td>ID</td>
						<td>AName</td>
						<td>Apsw</td>
						<td>Operation</td>
					</tr>
					
					<c:forEach var="admin" items="${admins}">
					<tr class="row1">
						<td>${admin.id}</td>
						<td>${admin.aname}</td>
						<td>${admin.apwd}%></td>
						<td><a href="javascript:;" onclick="del(${admin.id})">删除</a>&nbsp;
							<a href="admin_load.do?id=${admin.id}">修改</a>
						</td>
						<script type="text/javascript">
							 function del(id){
								if(confirm("确定删除吗")){
									window.location.href ="admin_delete.do?id="+id; 
				 				}
							}
						</script>
						
					</tr>
					</c:forEach>
				</table>
				<p>
					<input type="button" class="button" value="添加管理员"
						onclick="window.location.href='admin_register.jsp'" />
				</p>
			</div>
		</div>
		<div id="footer">
			<div id="footer_bg">ABC@126.com</div>
		</div>
	</div>
</body>
</html>
