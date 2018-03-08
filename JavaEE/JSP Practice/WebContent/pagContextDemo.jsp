<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Í¨¹ýpageContext¶ÔÏóÈ¡µÃ²»Í¬·¶Î§µÄÊôÐÔ</title>
</head>
<body>
	<%
		pageContext.setAttribute("name","page_James");
		request.setAttribute("name","page_Tom");
		session.setAttribute("name","page_Jason");
		application.setAttribute("name","page_Kangkang");
	%>
	<%
		String pageStr=(String)pageContext.getAttribute("name",pageContext.PAGE_SCOPE);
		String requestStr=(String)pageContext.getAttribute("name",pageContext.REQUEST_SCOPE);
		String sessionStr=(String)pageContext.getAttribute("name",pageContext.SESSION_SCOPE);
		String applicationStr=(String)pageContext.getAttribute("name",pageContext.APPLICATION_SCOPE);	    
	%>
	<%="page·¶Î§£ºnameÊôÐÔÖµ"+pageStr %><br>
	<%="request·¶Î§£ºnameÊôÐÔÖµ"+requestStr %><br>
	<%="session·¶Î§£ºnameÊôÐÔÖµ"+sessionStr %><br>
	<%="application·¶Î§£ºnameÊôÐÔÖµ"+applicationStr %><br>
</body>
</html>