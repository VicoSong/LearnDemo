package com.swk.librarymanagerdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *���ܣ�ͨ��JDBC���������ݿ������
 *@version 18.08 2015.08.29
 *@author ��ά��
 */
/*
 * ����:ͨ��JDBC����SQL Server 2005���ݿ�
 */
/*
 * ˼·������:
 * 1.ͨ��class.forName()�������ݿ�����
 * 2.ͨ��getConnection��������
 * 3.�ر����ݿ�����
 */
public class JDBCConnection {
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
	/**
	 *���ܣ��ر����ݿ�����
	 *@return �������ͣ�true��ʾ�رճɹ���false��ʾ�ر�ʧ�ܡ�
	 **/
	public static boolean closeConnection()
	{
		boolean flag=true;
		//���߳��л�����ݿ�����
		conn=threadLocal.get();
		threadLocal.set(null); //����߳��е����ݿ�����
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
