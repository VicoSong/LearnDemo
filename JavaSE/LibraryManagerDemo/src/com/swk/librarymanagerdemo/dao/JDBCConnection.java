package com.swk.librarymanagerdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *功能：通过JDBC建立与数据库的连接
 *@version 18.08 2015.08.29
 *@author 宋维康
 */
/*
 * 需求:通过JDBC连接SQL Server 2005数据库
 */
/*
 * 思路、步骤:
 * 1.通过class.forName()加载数据库驱动
 * 2.通过getConnection建立连接
 * 3.关闭数据库连接
 */
public class JDBCConnection {
	/**
	 * DRIVER 数据库驱动
	 * URL 数据库地址
	 * USER_NAME 数据库用户名
	 * PASSWORD 数据库登录密码
	 */
	
	private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL="jdbc:sqlserver://localhost:1433;DatabaseName=LibraryManagement";
	private static final String USER_NAME="sa";
	private static final String PASSWORD="123456";
	private static Connection conn;
	private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	//通过静态代码块加载JDBC驱动
	
	static
	{
		try{
			Class.forName(DRIVER).newInstance();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * 功能：建立与数据库的连接
	 * @return Connection的实例
	 *@throws ClassNotFound,SQLException
	  */
	public static Connection getConnection()
	{
		//从线程中获得数据库连接
		conn=threadLocal.get();
		if(conn==null)
		{
			try{
				conn=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
				//将数据库连接保存到线程中
				threadLocal.set(conn);
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return conn;
	}
	/**
	 *功能：关闭数据库连接
	 *@return 布尔类型，true表示关闭成功，false表示关闭失败。
	 **/
	public static boolean closeConnection()
	{
		boolean flag=true;
		//从线程中获得数据库连接
		conn=threadLocal.get();
		threadLocal.set(null); //清空线程中的数据库连接
		if(conn!=null)
		{
			try{
				conn.close();
			}catch(SQLException e)
			{
				flag=false;
				e.printStackTrace();
			}
		}
		return flag;
	}
}
