package com.swk.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 通过JDBC建立数据库连接
 * @version 20.06 2015.08.23
 * @author 宋维康
 */
public class DBConnection {
	private String dbDriver;
	private String dbURL;
	private String userName;
	private String password;
	private Connection conn;
	public DBConnection()
	{
		dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		dbURL="jdbc:sqlserver://localhost:1433; DatabaseName=EMIS";
		userName="sa";
		password="123456";
		try {
			//加载数据库驱动
			Class.forName(dbDriver); 
			//建立数据库连接
			conn=DriverManager.getConnection(dbURL, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("数据库驱动加载失败");
		}catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
		//关闭数据库
	
		finally{
			try{
				if(conn!=null)
			{
				conn.close();
			}
			}catch(SQLException e)
			{
				
			}
		}
		
	}
	public static void main(String[] args) 
	{
		new DBConnection();
	}
}
