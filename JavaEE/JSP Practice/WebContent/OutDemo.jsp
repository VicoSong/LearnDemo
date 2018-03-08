<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ê¹ÓÃout¶ÔÏóÇóµÃ»º³åÇøÊ¹ÓÃ´óÐ¡</title>
</head>
<body>
	<%
		int all=out.getBufferSize();
		int remain=out.getRemaining();
		int use=all-remain;
		out.println("Ê¹ÓÃ»º³åÇø´óÐ¡£º"+use+"<br>");
		out.print("Ê¹ÓÃ»º³åÇø´óÐ¡£º"+use);
	%>
</body>
</html>