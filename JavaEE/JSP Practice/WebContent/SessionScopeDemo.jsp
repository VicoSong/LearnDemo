<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session范围</title>
</head>
<body>
	<%--在session范围设置属性 --%>
	<%session.setAttribute("name", "Tom"); %>
	<a href="SessionScopeDemo2.jsp">SessionScopeDemo2.jsp</a>
</body>
</html>