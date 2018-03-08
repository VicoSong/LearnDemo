<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>application对象测试</title>
</head>
<body>
	<%
		int majorVersion=application.getMajorVersion();
		out.println("主要的Servlet API版本"+majorVersion+"<br>");
		
		int minorVersion=application.getMinorVersion();
		out.println("次要的Servlet API版本"+minorVersion+"<br>");
		
		String serviceInfo=application.getServerInfo();
		out.println("服务器版本"+serviceInfo+"<br>");
		
		String mimeType=application.getMimeType("Hello.jsp");
		out.println("文件的MIME类型"+mimeType+"<br>");
		
		ServletContext context=application.getContext("Hello.jsp");
		out.println("指定local的applicationcontext"+context+"<br>");
		
		String realPath=application.getRealPath("Hello.jsp");
		out.println("path的绝对路径"+realPath+"<br>");
	%>
</body>
</html>