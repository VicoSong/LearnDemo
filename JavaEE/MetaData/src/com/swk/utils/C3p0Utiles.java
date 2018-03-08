package com.swk.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utiles {
	private static DataSource ds;
	static{
		ds=new ComboPooledDataSource();
	}
	
	//提供获取连接的方法 
	public static Connection getConnection()
	{
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException("服务器正忙");
		}
	}
	
}
