<%@page import="com.swk.tomcatdatasource.TomcatDatasourceTest"%>
<%@page import="java.sql.*"%>
<%@page import="javax.sql.*"%>
<%@ page import="java.util.*"%>
<%@ page import="javax.naming.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>
	<%--方式一 --%>
	<%
 		Context initContext=new InitialContext();
 		//Context envContext=(Context)initContext.lookup("java:/comp/env");
 		//DataSource ds=(DataSource)envContext.lookup("jdbc/demo");
 		DataSource ds=(DataSource)initContext.lookup("java:/comp/env/jdbc/demo");
		Connection conn=ds.getConnection();
 		out.write(conn.toString());
	%>
	
	<%--方式二：通过Java类实现打印出连接信息 --%>
	<%-- <% 
		TomcatDatasourceTest tdst=new TomcatDatasourceTest();
		tdst.add();
	%> --%>
	
</body>
</html>