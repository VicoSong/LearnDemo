package com.swk.librarymanagerdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ���ܣ����ݷ��ʲ㣨�ֱ���ΪDAO�㣩����װ�����е����ݷ��ʷ���
 *@author Administrator
 *@version 18.46 20150916
 * */
public class Dao {
	/**
	 * DRIVER ���ݿ�����
	 * URL ���ݿ��ַ
	 * USER_NAME ���ݿ��û���
	 * PASSWORD ���ݿ��¼����
	 */
	private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL="jdbc:sqlserver://localhost:1433;DatabaseName=LibraryManagement";
	private static final String USER_NAME="sa";
	private static final String PASSWORD="123456";
	private static Connection conn;
	private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	
	//ͨ����̬��������JDBC����
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
	 * ���ܣ����������ݿ������
	 * @return Connection��ʵ��
	 *@throws ClassNotFound,SQLException
	  */
	public static Connection getConnection()
	{
		//���߳��л�����ݿ�����
		conn=threadLocal.get();
		if(conn==null)
		{
			try{
				conn=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
				//�����ݿ����ӱ��浽�߳���
				threadLocal.set(conn);
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	//�����ѯ����
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
	
	//������·���
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
	
	//����رշ���
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
