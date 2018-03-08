<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>被包含页</h2>
<p>接收到的参数：</p>
<%
	String strAge=request.getParameter("age");
%>
<%--输出参数内容 --%>
<%="age 参数值为"+strAge %>
</body>
</html>