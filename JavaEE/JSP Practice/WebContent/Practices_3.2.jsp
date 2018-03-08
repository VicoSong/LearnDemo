<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>导入包</title>
</head>
<body>
	<% ArrayList<String> arr=new ArrayList<String>();    //构造一个ArrayList实例对象
		arr.add("C语言");                          //添加元素
		arr.add("JAVA语言");                       //添加元素
		arr.add("C#语言");                         //添加元素
    %>
    <%--取出第一个元素并输出 --%> 
    <%=arr.get(0) %>  <br>
    <%--取出第二个元素并输出 --%>
    <%=arr.get(1) %>   <br>
    <%--取出第三个元素并输出 --%>
    <%=arr.get(2) %>   <br>
</body>
</html>