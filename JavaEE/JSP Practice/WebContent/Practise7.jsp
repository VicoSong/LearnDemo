<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>第七章综合练习</title>
</head>
<body>
	<jsp:useBean id="person_1" scope="page" class="com.javawebpractise.Person"></jsp:useBean>
	<jsp:setProperty name="person_1" property="name" value="Tom"></jsp:setProperty>
	<jsp:setProperty name="person_1" property="sex" value="男"></jsp:setProperty>
	<jsp:setProperty name="person_1" property="age" value="18"></jsp:setProperty>
	
	<jsp:useBean id="person_2" scope="page" class="com.javawebpractise.Person"></jsp:useBean>
	<jsp:setProperty name="person_2" property="name" value="James"></jsp:setProperty>
	<jsp:setProperty name="person_2" property="sex" value="女"></jsp:setProperty>
	<jsp:setProperty name="person_2" property="age" value="20"></jsp:setProperty>
	
	<table border=2>
		<tr>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
		</tr>
		<tr>
			<td><jsp:getProperty name="Person_1" property="name"></jsp:getProperty></td>
			
	</table>
</body>
</html>