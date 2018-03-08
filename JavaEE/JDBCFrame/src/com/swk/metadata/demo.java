package com.swk.metadata;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import com.swk.utils.DBCPUtils;
import com.swk.utils.JDBCUtils;

public class demo {
	
	public static void main(String[] args)throws Exception
	{
		
			Properties props=new Properties();
			InputStream in=JDBCUtils.class.getClassLoader().getResourceAsStream("dbcpcfg.properties");
			props.load(in);
			String driverClassName=props.getProperty("driverClassName");
			/*String url=props.getProperty("url");
			System.out.println("�û����ǣ�"+url+";�����ǣ�"+driverClassName);*/
			DataSource ds=BasicDataSourceFactory.createDataSource(props);
			System.out.println(ds.toString()+"�����ɹ�");
		
		
	}
	
}
