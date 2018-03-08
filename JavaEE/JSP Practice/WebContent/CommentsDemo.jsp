<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CommentsDemo</title>
</head>
<body>
<!-- HTML 注释！ -->
<%--  HTML 注释！--%>
<%! int a=1; %>
<!-- 在网页上打印出变量a的值 -->
<%--在网页上打印出变量a的值 --%>
<% out.println("a="+a);
	a++;
%>
<%--用JSP表达式输出a的值 --%>
<%=a %>
</body>
</html>