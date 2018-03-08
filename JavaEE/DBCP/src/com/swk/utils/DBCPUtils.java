package com.swk.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;


 
public class DBCPUtils {
	
	private static DataSource ds;
	static{
		//���������ļ�
		InputStream in=DBCPUtils.class.getResourceAsStream("dbcpcfg");
		Properties props=new Properties();
		
		try {
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
