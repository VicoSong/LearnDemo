package com.swk.jdbcutilsannotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@JDBCAnnotation(driverClass = "com.mysql.Driver", password = "123456", url = "jdbc:mysql://localhost:3306/demo", userName = "root")
public class JDBCUtils {
    public static Connection getConnection()
    {
	Connection connection=null;
	//1.读取四大参数
	Class clazz=JDBCUtils.class;
	JDBCAnnotation jdbcAnnotation=(JDBCAnnotation )clazz.getAnnotation(JDBCAnnotation.class);
	//2.注册驱动类
	try {
	    Class.forName(jdbcAnnotation.driverClass());
	} catch (ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	//3.DriverManager获取连接
	try {
	    connection=DriverManager.getConnection(jdbcAnnotation.url(), jdbcAnnotation.userName(), jdbcAnnotation.password());
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	return connection;
    }
}
