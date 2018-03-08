<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>使用SQL语句添加、修改、删除记录</title>
</head>
<body>
	<%
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=EMIS";
		String userName="sa";
		String userPassword="101000"; 
		Connection conn=null;
		try{
			Class.forName(driverName);
			 conn=DriverManager.getConnection(dbURL,userName,userPassword);
		}
		catch(ClassNotFoundException e)
		{
			out.println("驱动加载失败");
			
		}
		catch(SQLException e)
		{
			out.println("连接数据库失败");
		}
		try{
			Statement stmt=conn.createStatement();
			//添加记录
			//String strAdd="INSERT INTO ESM(UID,UNAME,UPASSWORD,URIGHT)VALUES('小旺','旺旺','121212','普通用户')";
			//修改记录
			//String strUpdate="UPDATE ESM SET URIGHT='普通用户' WHERE UID='小王'";
			//删除记录
			String strDelete="Delete from ESM where UID='小陈'";
			stmt.executeUpdate(strDelete);
		}
		catch(Exception e)
		{
			out.println("操作失败"+e);
		}
		
		
	%>
</body>
</html>