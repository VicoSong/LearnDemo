<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>����û���Ϣ</title>
</head>
<body>
	<%
		request.setCharacterEncoding("gb2312");
	    String reuserName=request.getParameter("username");
	    String reuserPassword=request.getParameter("userpassword");
	    
	%>
	<%
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=EMIS";
		String userName="sa";
		String userPassword="101000";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			Class.forName(driverName);
			 conn=DriverManager.getConnection(dbURL,userName,userPassword);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("��������ʧ��"+e);
			
		}
		catch(SQLException e)
		{
			out.println("�������ݿ�ʧ��"+e);
		} 
		try{
			String addUser="INSERT INTO ESM(UID,UNAME,UPASSWORD,URIGHT) VALUES('С��',?,?,'����Ա')";
			pstmt=conn.prepareStatement(addUser);
			pstmt.setString(1,reuserName);
			pstmt.setString(2,reuserPassword);
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			out.println("����ʧ��"+e);
			
		}
		try{
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
			out.println("�ر����ݿ�ʧ��"+e);
		}
	%>
</body>
</html>