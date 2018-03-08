<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Á¬½ÓSQL Server2005²âÊÔ </title>
</head>
<body>
	<%
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=EMIS";
		String userName="sa";
		String userPassword="101000";
		try{
			Class.forName(driverName);
			Connection conn=DriverManager.getConnection(dbURL,userName,userPassword);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Çý¶¯¼ÓÔØÊ§°Ü");
			
		}
		catch(SQLException e)
		{
			out.println("Á¬½ÓÊý¾Ý¿âÊ§°Ü");
		}
	   
	%>
</body>
</html>