<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>����JavaBean</title>
</head>
<body>
	<%--ͨ��useBean����ָ�����JavaBean --%>
	<jsp:useBean id="user" scope="page" class="com.javaweb.UserBean"></jsp:useBean>
	<%
		user.setUserName("Tom");
		user.setUserPassword("123456");
		out.println("�û�����"+user.getUserName()+"<br>");
		out.println("���룺"+user.getUserPassword()+"<br>");
		
	%>
</body>
</html>