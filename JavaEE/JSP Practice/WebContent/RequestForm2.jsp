<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>使用request对象获得所有参数名</title>
</head>
<body>
	<%--通过Request对象的getParameterNames --%>
	<%
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements())
		{
			String str=(String)e.nextElement();
			out.println(str);
		}
		
	%>
</body>
</html>