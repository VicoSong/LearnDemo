<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>¼òµ¥¼ÆËãÆ÷</title>
</head>
<body>
	<center>
		<h1>¼òµ¥¼ÆËãÆ÷</h1>
		<hr>
		<c:if test="${param.operation=='add' }">
			${param.number1}+${param.number2}=${param.number1+param.number2} 
		</c:if>
		
		<c:if test="${param.operation=='minus' }">
			${param.number1}-${param.number2}=${param.number1-param.number2} 
		</c:if>
		<c:if test="${param.operation=='multiply' }">
			${param.number1}*${param.number2}=${param.number1*param.number2} 
		</c:if>
		<c:if test="${param.operation=='divide' }">
			${param.number1}/${param.number2}=${param.number1/param.number2} 
		</c:if>
	</center>
</body>
</html>