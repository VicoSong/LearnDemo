<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<%@ page info="this is the page object practice" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>page¶ÔÏó</title>
</head>
<body>
	<%--Í¨¹ýpage¶ÔÏóµ÷ÓÃServletÖÐµÄgetServletInfo()·½·¨ --%>
	<%
		String info=((javax.servlet.jsp.HttpJspPage)page).getServletInfo();
	%>
	<%=info %>>
</body>
</html>