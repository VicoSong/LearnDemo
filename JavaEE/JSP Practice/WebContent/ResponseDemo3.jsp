<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>����ҳ���Զ���ת</title>
</head>
<body>
	<%--ʹ��response�����setIntHeaderʵ��ҳ����ת --%>
	<%
		response.setHeader("Refresh","10;URL=http://www.baidu.com");
	%>
</body>
</html>