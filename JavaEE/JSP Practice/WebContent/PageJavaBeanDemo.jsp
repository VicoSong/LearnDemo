<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>����page�ķ�Χ</title>
</head>
<body>
	<%--ͨ��useBean��������JavaBean --%>
	<%--<jsp:useBean id="user" scope="page" class="com.javaweb.UserBean"></jsp:useBean> --%>
	<%-- <jsp:useBean id="user" scope="request" class="com.javaweb.UserBean"></jsp:useBean>--%>
	<%-- <jsp:useBean id="user" scope="session" class="com.javaweb.UserBean"></jsp:useBean>--%>
	<jsp:useBean id="user" scope="application" class="com.javaweb.UserBean"></jsp:useBean>
	<%--����userName���ԣ�������ֵΪ����ά�� --%>
	<jsp:setProperty name="user" property="userName"  value="��ά��"></jsp:setProperty>
	<%--����userPassword���ԣ�������ֵΪ��123456 --%>
	<jsp:setProperty name="user" property="userPassword"  value="123456"></jsp:setProperty>
	 <%--��������ת��PageJavaBeanDemo2.jsp --%>
	 <jsp:forward page="PageJavaBeanDemo2.jsp"></jsp:forward>
	 
</body>
</html>