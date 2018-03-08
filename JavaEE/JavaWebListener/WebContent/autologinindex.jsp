<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>自动登录登录成功界面</title>
</head>
<body>
	<c:if test="${empty username}">
		<h1><a href="autologin.jsp">Go to login</a></h1>
	</c:if>
	<c:if test="${not empty username}">
		<p>${username}欢迎你登录</p>
	</c:if>
	
	<p>This is the index page of this website</p>
</body>
</html>