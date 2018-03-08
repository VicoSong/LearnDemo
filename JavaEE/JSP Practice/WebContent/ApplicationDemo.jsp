<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>application¶ÔÏó²âÊÔ</title>
</head>
<body>
	<%
		int majorVersion=application.getMajorVersion();
		out.println("Ö÷ÒªµÄServlet API°æ±¾"+majorVersion+"<br>");
		
		int minorVersion=application.getMinorVersion();
		out.println("´ÎÒªµÄServlet API°æ±¾"+minorVersion+"<br>");
		
		String serviceInfo=application.getServerInfo();
		out.println("·þÎñÆ÷°æ±¾"+serviceInfo+"<br>");
		
		String mimeType=application.getMimeType("Hello.jsp");
		out.println("ÎÄ¼þµÄMIMEÀàÐÍ"+mimeType+"<br>");
		
		ServletContext context=application.getContext("Hello.jsp");
		out.println("Ö¸¶¨localµÄapplicationcontext"+context+"<br>");
		
		String realPath=application.getRealPath("Hello.jsp");
		out.println("pathµÄ¾ø¶ÔÂ·¾¶"+realPath+"<br>");
	%>
</body>
</html>