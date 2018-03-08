<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>表单</title>
</head>
<body>
	<form action="RequestDemo5.jsp" method="post">
		用户名：<input type="text" name="username"/><br>
		密码：  <input type="password" name="userpassword"/><br>
		喜欢的运动：
		<input type="checkbox" name="sport" value="pingpang">乒乓球
		<input type="checkbox" name="sport" value="basketball">篮球
		<input type="checkbox" name="sport" value="football">足球<br>
		<input type="submit" value="提交">
	</form>
</body>
</html>