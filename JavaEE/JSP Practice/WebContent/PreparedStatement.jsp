<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>PreparedStatement测试</title>
</head>
<body>
	<%
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=EMIS";
		String userName="sa";
		String userPassword="101000";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			Class.forName(driverName);
			 conn=DriverManager.getConnection(dbURL,userName,userPassword);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("驱动加载失败");
			
		}
		catch(SQLException e)
		{
			out.println("连接数据库失败");
		}
		try{
			//添加用户信息
			/*
			String strAdd="INSERT INTO ESM(UID,UNAME,UPASSWORD,URIGHT) VALUES(?,?,?,?)";
			pstmt=conn.prepareStatement(strAdd);
			pstmt.setString(1,"小陈");
			pstmt.setString(2,"陈晓晓");
			pstmt.setString(3,"666666");
			pstmt.setString(4,"管理员");
			pstmt.executeUpdate();
			*/
			
			//更新记录
			/*
			String strUpdate="UPDATE ESM SET UNAME=? WHERE UPASSWORD=?";
			pstmt=conn.prepareStatement(strUpdate);
			pstmt.setString(1,"陈丽丽");
			pstmt.setString(2,"666666");
			pstmt.executeUpdate();
			*/
			
			//删除记录
			/*
			String strDelete="DELETE FROM ESM WHERE UID=?";
			pstmt=conn.prepareStatement(strDelete);
			pstmt.setString(1,"小孙");
			pstmt.executeUpdate();
			*/
			
			//获得指定记录
			String selectAll="SELECT * FROM ESM WHERE URIGHT=?";
			pstmt=conn.prepareStatement(selectAll);
			pstmt.setString(1,"普通用户");
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				String uname=rs.getString(2);
				String upassword=rs.getString(3);
				out.println("用户名："+uname+",");
				out.println("密码："+upassword+"<br>");
			}
			
			
		}
		catch(Exception e)
		{
			out.println("操作失败"+e);
			
		}
		try{
			if(rs!=null)
			{
				rs.close();
				rs=null;
			}
			if(pstmt!=null)
			{
				pstmt.close();
				pstmt=null;
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