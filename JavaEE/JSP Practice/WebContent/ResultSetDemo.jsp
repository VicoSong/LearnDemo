<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ResultSet结果集</title>
</head>
<body>
	<%
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=EMIS";
		String userName="sa";
		String userPassword="101000"; 
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
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
			  stmt=conn.createStatement();
			String selectAll="SELECT * FROM ESM ";
			 rs=stmt.executeQuery(selectAll);
			while(rs.next())
			{
			    String UID=rs.getString(1);
				String UNAME=rs.getString(2);
				String UPASSWORD=rs.getString(3);
				String URIGHT=rs.getString(4);
				out.println("用户ID:"+UID+",");
				out.println("用户名:"+UNAME+",");
				out.println("用户密码:"+UPASSWORD+",");
				out.println("用户权限:"+URIGHT+","+"<br>");
			}
		}
		catch(Exception e)
		{
			out.println("操作失败"+e);
		}
	    //关闭数据库操作
	    try{
	    	if(rs!=null)
	    	{
	    		rs.close();
	    		rs=null;
	    	}
	    	if(stmt!=null)
	    	{
	    		stmt.close();
	    		stmt=null;
	    	}
	    	if(conn!=null)
	    	{
	    		conn.close();
	    		conn=null;
	    	}
	    }
	    catch(Exception e)
	    {
	    	out.println("关闭数据库失败");
	    }
	%>
</body>
</html>