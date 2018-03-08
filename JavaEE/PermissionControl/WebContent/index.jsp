<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index Page</title>
</head>
<body>
	<c:if test="${empty user }">
		<h1><a href="${pageContext.request.contextPath}/JSP/login.jsp">请先登录</a></h1>
	</c:if>
	<p>This is index page</p>
	<c:if test="${not empty user}">
		<h1>欢迎你，${user.username}</h1>
		<h1>以下是功能列表</h1>
		<h3><a href="FunctionJump?url=user/searchproduct.jsp">查询商品</a></h3>
		<h3><a href="FunctionJump?url=user/buyproduct.jsp">购买商品</a></h3>
		<h3><a href="FunctionJump?url=user/cart.jsp">查看购物车</a></h3>
		<h3><a href="FunctionJump?url=user/order.jsp">提交订单</a></h3>
		<h3><a href="FunctionJump?url=admin/addproduct.jsp">添加商品</a></h3>
		<h3><a href="FunctionJump?url=admin/deleteproduct.jsp">删除商品</a></h3>
	</c:if>
	
</body>
</html>