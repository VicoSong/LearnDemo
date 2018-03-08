package com.swk.librarymanagerdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 功能：数据访问层（又被称为DAO层），封装了所有的数据访问方法
 *@author Administrator
 *@version 18.46 20150916
 * */
public class Dao {
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
	
	//定义查询方法
	public static ResultSet executeQuery(String sql)
	{
		if(conn==null)
		{
			getConnection();
		}
			
		try {
				return conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE).executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
		
	}
	
	//定义更新方法
	public static int executeUpdate(String sql)
	{
		if(conn==null)
		{
			getConnection();
		}
		try {
			return conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
	}
	
	//定义关闭方法
	public static void close()
	{
		try {
			conn.close();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			conn=null;
		}
	}
	
	
}
