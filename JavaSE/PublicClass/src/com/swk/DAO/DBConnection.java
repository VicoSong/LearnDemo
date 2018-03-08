package com.swk.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * ͨ��JDBC�������ݿ�����
 * @version 20.06 2015.08.23
 * @author ��ά��
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
			//�������ݿ�����
			Class.forName(dbDriver); 
			//�������ݿ�����
			conn=DriverManager.getConnection(dbURL, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("���ݿ���������ʧ��");
		}catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		//�ر����ݿ�
	
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
