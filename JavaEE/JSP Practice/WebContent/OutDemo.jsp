<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ʹ��out������û�����ʹ�ô�С</title>
</head>
<body>
	<%
		int all=out.getBufferSize();
		int remain=out.getRemaining();
		int use=all-remain;
		out.println("ʹ�û�������С��"+use+"<br>");
		out.print("ʹ�û�������С��"+use);
	%>
</body>
</html>