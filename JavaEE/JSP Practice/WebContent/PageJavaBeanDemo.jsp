<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>设置page的范围</title>
</head>
<body>
	<%--通过useBean动作调用JavaBean --%>
	<%--<jsp:useBean id="user" scope="page" class="com.javaweb.UserBean"></jsp:useBean> --%>
	<%-- <jsp:useBean id="user" scope="request" class="com.javaweb.UserBean"></jsp:useBean>--%>
	<%-- <jsp:useBean id="user" scope="session" class="com.javaweb.UserBean"></jsp:useBean>--%>
	<jsp:useBean id="user" scope="application" class="com.javaweb.UserBean"></jsp:useBean>
	<%--设置userName属性，其属性值为：宋维康 --%>
	<jsp:setProperty name="user" property="userName"  value="宋维康"></jsp:setProperty>
	<%--设置userPassword属性，其属性值为：123456 --%>
	<jsp:setProperty name="user" property="userPassword"  value="123456"></jsp:setProperty>
	 <%--服务器跳转到PageJavaBeanDemo2.jsp --%>
	 <jsp:forward page="PageJavaBeanDemo2.jsp"></jsp:forward>
	 
</body>
</html>