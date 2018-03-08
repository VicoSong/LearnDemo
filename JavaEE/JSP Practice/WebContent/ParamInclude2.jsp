<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>包含JSP文件并传递多个参数</title>
</head>
<body>
	使用include动作元素包含一个JSP文件，并传递多个参数。<br>
	<jsp:forward page="contentDemo2.jsp">
		<jsp:param name="name"  value="Tom"/>
		<jsp:param name="age"    value="19"/>
		<jsp:param  name="sex"  value="man"/>
	 </jsp:forward>
</body>
</html>