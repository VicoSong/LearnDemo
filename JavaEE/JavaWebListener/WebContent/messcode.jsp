<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用于测试全站中文乱码</title>
</head>
<body>
	<div>
			<form action="messycodeservlet" method="post">
				用户名：<input type="text" name="user"><br>
				密码：<input type="password" name="password"><br>
				<input type="submit" value="提交">
			</form>
			<a href="messycodeservlet?user=Java语言&password=123">Get方式发送的请求</a> 
	</div>
</body>
</html>