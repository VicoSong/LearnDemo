<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>使用Request对象接受参数</title>
</head>
<body>
	<%--通过request对象的getParameter接受参数 --%>
	<%
		request.setCharacterEncoding("gb2312");
		String username=request.getParameter("username");
		out.println("用户名:"+username);
	%>
</body>
</html>