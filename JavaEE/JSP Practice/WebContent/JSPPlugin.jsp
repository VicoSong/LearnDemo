<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>执行Applet</title>
</head>
<body>
	<%--指定其Java类为Clock.class,所在目录为Applet,类型为applet--%>>
	<jsp:plugin code="Clock.class" codebase="Applet" type="applet">
	</jsp:plugin>
</body>
</html>