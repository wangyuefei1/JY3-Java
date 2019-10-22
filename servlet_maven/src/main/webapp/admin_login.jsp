<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8"
	isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
<meta charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<style>
.error {
	color: red;
}
</style>
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
							window.setInterval(function() {
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
				<h1>登录</h1>
				<form action="admin_login.do" method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">username:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="aname" /> 
								<%
 									String error_msg = (String)request.getAttribute("error_msg");
 								%> 
 							</td>
 							<span class="error"> <%=error_msg==null?"":error_msg%>
							</span>
						</tr>
						<tr>
							<td valign="middle" align="right">password:</td>
							<td valign="middle" align="left"><input type="password"
								class="inputgri" name="apwd" /></td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="登录" /> 
						<input type="button" class="button" value="注册"
							onclick="window.location.href='admin_register.jsp'" />
					</p>
				</form>
			</div>
		</div>
		<div id="footer">
			<div id="footer_bg">ABC@126.com</div>
		</div>
	</div>
</body>
</html>
