<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<title>管理员添加</title>
<meta charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<body>
	<div id="wrap">
		<div id="top_content">
			<div id="header">
				<div id="rightheader">
					<p id="date">
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
				<h1>管理员添加 :</h1>
				<form action="admin_insert.do " method="post">
					<table cellpadding="0" cellspacing="0" border="0"
						class="form_table">
						<tr>
							<td valign="middle" align="right">Aname:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="aname" /></td>
						</tr>
						<tr>
							<td valign="middle" align="right">Apwd:</td>
							<td valign="middle" align="left"><input type="text"
								class="inputgri" name="apwd" /></td>
						</tr>

					</table>
					<p>
						<input type="submit" class="button" value="注册" />
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
