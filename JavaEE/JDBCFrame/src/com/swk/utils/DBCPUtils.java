package com.swk.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;



 
public class DBCPUtils {
	
	private static DataSource ds;
	static{
		//���������ļ�		
		try {
			Properties props=new Properties();
			InputStream in=DBCPUtils.class.getClassLoader().getResourceAsStream("dbcpcfg.properties");
			props.load(in);
			ds=BasicDataSourceFactory.createDataSource(props);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("��������æ");
		}
		
	}
	
	//��ȡ����
	public static Connection getConnection()
	{
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("������æ");
		}
	}
}
