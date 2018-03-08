<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>使用request对象获得所有参数值的Map</title>
</head>
<body>
	<%--通过request对象的getParameterMap封装所有参数值得Map --%>
	<%
		Map mapParameter=request.getParameterMap();
		String[] strUsername=(String[])mapParameter.get("username");
		out.println("用户名"+strUsername[0]+"<br>");
		
		String[] strPassword=(String[])mapParameter.get("userpassword");
		out.println("用户密码"+strPassword[0]+"<br>");
		
		String[] strSport=(String[])mapParameter.get("sport");
		out.println("喜欢的运动");
		for(String sport:strSport)
		{
			out.println(sport);
		}

	%>
</body>
</html>