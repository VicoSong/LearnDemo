<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>移除属性</title>
</head>
<body>
	<%--在page范围内设置属性 --%>
	<%
		pageContext.setAttribute("name","Tom");
		pageContext.setAttribute("age","12");
		pageContext.setAttribute("sex","man");
	%>
	<%--移除属性 --%>
	<% 
		pageContext.removeAttribute("sex");
	%>
	<%--取得page属性 --%>
	<% 
		String strName=(String)pageContext.getAttribute("name"); 
		String strAge=(String)pageContext.getAttribute("age");
		String strSex=(String)pageContext.getAttribute("sex");
		out.println("name:"+strName+","+"age:"+strAge+","+"sex:"+strSex);
	%>
</body>
</html>