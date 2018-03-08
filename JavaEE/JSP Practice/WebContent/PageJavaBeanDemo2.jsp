<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>获得page范围的JavaBean属性值</title>
</head>
<body>
	<%--<jsp:useBean id="user" scope="page" class="com.javaweb.UserBean"></jsp:useBean> --%>
	<%--<jsp:useBean id="user" scope="request" class="com.javaweb.UserBean"></jsp:useBean> --%>
	<%-- <jsp:useBean id="user" scope="session" class="com.javaweb.UserBean"></jsp:useBean>--%>
	<jsp:useBean id="user" scope="application" class="com.javaweb.UserBean"></jsp:useBean>
	<%--获得userName属性 --%>
	用户名：<jsp:getProperty name="user" property="userName"></jsp:getProperty>
	<%--获得userPassword属性 --%>
	密码：<jsp:getProperty name="user" property="userPassword"></jsp:getProperty>
</body>
</html>