<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" scope="page" class="com.javaweb.UserBean"></jsp:useBean>
	<jsp:setProperty name="user" property="userName" value="宋维康"></jsp:setProperty>
	<jsp:setProperty name="user" property="userPassword" value="123456"></jsp:setProperty>
	<%
		pageContext.removeAttribute("user");
	%>
	<jsp:getProperty name="user" property="userName"/>
	<jsp:getProperty name="user" property="userPassword"></jsp:getProperty>
</body>
</html>