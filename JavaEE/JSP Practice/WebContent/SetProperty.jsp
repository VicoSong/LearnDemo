<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    <%request.setCharacterEncoding("gb2312"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>����JavaBean����</title>
</head>
<body>
	<jsp:useBean id="user" scope="page" class="com.javaweb.UserBean"></jsp:useBean>
	
	<%-- <jsp:setProperty name="user" property="*"></jsp:setProperty>--%>
	<%-- <jsp:setProperty name="user" property="userName"></jsp:setProperty>--%>
	<%-- <jsp:setProperty name="user" property="userName" param="userName"></jsp:setProperty>--%>
	<jsp:setProperty name="user" property="userName" value="��ά��"></jsp:setProperty>
	<jsp:setProperty name="user" property="userPassword" value="123456"></jsp:setProperty>
	<%
		
		out.println("�û�����"+user.getUserName()+"<br>");
		out.println("���룺"+user.getUserPassword()+"<br>");
	%>
</body>
</html>