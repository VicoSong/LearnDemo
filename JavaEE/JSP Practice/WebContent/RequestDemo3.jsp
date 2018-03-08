<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>使用request对象获得所有参数值</title>
</head>
<body>
	<%--通过request对象的getParameterNames --%>
	<%
	    Enumeration e=request.getParameterNames();
	    while(e.hasMoreElements())
	    {
	    	String str=(String)e.nextElement();
	    	String strRequest=request.getParameter(str);
	    	out.println(str+"参数值为："+strRequest+"<br>");
	    }
	%>
</body>
</html>