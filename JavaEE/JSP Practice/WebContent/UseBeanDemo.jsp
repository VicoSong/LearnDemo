<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>µ÷ÓÃJavaBean</title>
</head>
<body>
	<%--Í¨¹ýuseBean¶¯×÷Ö¸Áîµ÷ÓÃJavaBean --%>
	<jsp:useBean id="user" scope="page" class="com.javaweb.UserBean"></jsp:useBean>
	<%
		user.setUserName("Tom");
		user.setUserPassword("123456");
		out.println("ÓÃ»§Ãû£º"+user.getUserName()+"<br>");
		out.println("ÃÜÂë£º"+user.getUserPassword()+"<br>");
		
	%>
</body>
</html>