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
<p>接受的参数：</p>
<%
	String strName= request.getParameter("name");
	String strAge= request.getParameter("age");
	String strSex= request.getParameter("sex");
%>
<%--输出参数内容为： --%>
<%="name参数值为"+strName %>
<%=",age参数值为"+strAge %>
<%=",sex参数值为"+strSex %>
</body>
</html>