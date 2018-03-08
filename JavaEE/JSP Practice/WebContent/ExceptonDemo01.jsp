<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<%@ page isErrorPage="true"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>´¦Àí´íÎóÒì³£</title>
</head>
<body>
	<%=exception %><br>
	<%=exception.getMessage() %><br>
	<%=exception.getLocalizedMessage()%><br>
	<%
		exception.printStackTrace(new java.io.PrintWriter(out));
	%>
</body>
</html>