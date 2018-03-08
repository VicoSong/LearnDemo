<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>demo model driven</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
    	<form action="${pageContext.request.contextPath }/customer.action" method ="post">
    			username:<input type ="text" name="name"><br> 
    			age:<input type ="text" name="age"><br> 
    			password:<input type ="password" name="password"><br> 
    			<input type="submit" value ="submit" > 
    	</form>
  </body>
</html>
