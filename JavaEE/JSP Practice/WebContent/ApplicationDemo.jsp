<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>application�������</title>
</head>
<body>
	<%
		int majorVersion=application.getMajorVersion();
		out.println("��Ҫ��Servlet API�汾"+majorVersion+"<br>");
		
		int minorVersion=application.getMinorVersion();
		out.println("��Ҫ��Servlet API�汾"+minorVersion+"<br>");
		
		String serviceInfo=application.getServerInfo();
		out.println("�������汾"+serviceInfo+"<br>");
		
		String mimeType=application.getMimeType("Hello.jsp");
		out.println("�ļ���MIME����"+mimeType+"<br>");
		
		ServletContext context=application.getContext("Hello.jsp");
		out.println("ָ��local��applicationcontext"+context+"<br>");
		
		String realPath=application.getRealPath("Hello.jsp");
		out.println("path�ľ���·��"+realPath+"<br>");
	%>
</body>
</html>