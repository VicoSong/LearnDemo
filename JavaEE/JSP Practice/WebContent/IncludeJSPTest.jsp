<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>IncludeJSPTest</title>
</head>
<body>
	<%--使用jsp：include 动态元素包含jsp文件 --%>
	  使用jsp：include 动态元素包含jsp文件   <br>
	<jsp:include page="Content JSP.jsp"></jsp:include>   <br>
	<%--使用jsp：include 动态元素包含txt文件 --%>
	使用jsp：include 动态元素包含txt文件   <br>
	<jsp:include page="contentTxt.txt"></jsp:include>   <br>
	<%--使用jsp：include 动态元素包含html文件 --%>
	使用jsp：include 动态元素包含html文件    <br>
	<jsp:include page="ContentHtml.html"></jsp:include>    <br>
</body>
</html>