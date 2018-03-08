<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>演示封装集合，封装到ArrayList中</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    	<form action="${pageContext.request.contextPath }/students.action" method ="post">
    			username:<input type ="text" name="students[0].name"><br> 
    			age:<input type ="text" name="students[0].age"><br> 
    			password:<input type ="password" name="students[0].password"><br> 
    			<hr>
    			username:<input type ="text" name="students[1].name"><br> 
    			age:<input type ="text" name="students[1].age"><br> 
    			password:<input type ="password" name="students[1].password"><br> 
    			<input type="submit" value ="submit" > 
    	</form>
  </body>
</html>
