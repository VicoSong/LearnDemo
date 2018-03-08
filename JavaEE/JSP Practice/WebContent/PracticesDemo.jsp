<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PractiseDemo1</title>
</head>
<body>
<!-- 声明变量  -->
<%--声明变量 --%>
<%! int a=1,b=2,c=3; %>
<!-- 对操作数进行四则运算！ -->
<%-- 对操作数进行四则运算！--%>
<%  out.println(a+"+"+b+"="+(a+b)+"<br>"); 
	out.println(a+"-"+b+"="+(a-b)+"<br>");
	out.println(a+"*"+b+"="+(a*b)+"<br>");
	 out.println(a+"/"+b+"="+(a/b)+"<br>");
	 c++;
%>
<%=c %>
</body>
</html>