<%@page import="com.neuedu.pojo.Admin"%>
<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<title>管理员修改</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<body>
	<div id="wrap">
		<div id="top_content">
			<div id="header">
				<div id="rightheader">
					<p>
						日期 <br />
					</p>
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
				<h1>管理员修改</h1>
				<%
					Admin admin = (Admin) request.getAttribute("admin");
				%>
				<form action="admin_update.do" method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">id:</td>
							<td valign="middle" align="left"><input type="hidden"
								name="id" value="<%=admin.getId()%>"> <%=admin.getId()%>
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">Aname:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="aname" value="<%=admin.getAname()%>" />
							</td>
						</tr>
						<tr>
							<td valign="middle" align="right">Apwd:</td>
							<td valign="middle" align="left"><input type="password"
								class="inputgri" name="apwd" value="" /></td>
						</tr>
					</table>
					<p>
						<input type="submit" class="button" value="修改" /> <input
							type="reset" class="button" value="重置" />
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
