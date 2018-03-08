package com.swk.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import com.swk.utils.DBCPUtils;

public class MetadataTest {
	//演示获取DatabaseMetaData
	@Test
	public void testDatabaseMetaData() throws Exception
	{
		//获取连接对象
		Connection conn=DBCPUtils.getConnection();
		//获取DataBaseMetaData对象
		DatabaseMetaData dmt=conn.getMetaData();
		//获取数据库的名称
		String dataBaseName=dmt.getDatabaseProductName();
		System.out.println(dataBaseName);
	}
	
		//演示获取ParameterMetaData
		@Test
		public void testParameterMetaData() throws Exception
		{
			//获取连接对象
			Connection conn=DBCPUtils.getConnection();
			//创建预处理对象
			PreparedStatement pstmt=conn.prepareStatement("select * from user where user=? and password=?");
			//获取ParameterMetaData对象
			ParameterMetaData pmd=pstmt.getParameterMetaData();
			//获取参数个数
			int n=pmd.getParameterCount();
			System.out.println("共有"+n+"个参数");
		}
		
				//演示获取ResultSetMetaData
				@Test
				public void testResultSetMetaData() throws Exception
				{
					//获取连接对象
					Connection conn=DBCPUtils.getConnection();
					//创建预处理对象
					PreparedStatement pstmt=conn.prepareStatement("select * from user");
					//执行SQL语句
					ResultSet rs=pstmt.executeQuery();
					//获取ResultSetMetaData对象
					ResultSetMetaData rsmd=rs.getMetaData();
					//获取列数
					int n=rsmd.getColumnCount();
					System.out.println("共有"+n+"列");
					//获取各列名称
					for(int i=0;i<n;i++)
					{
						System.out.println(rsmd.getColumnName(i+1));
					}
				}
	
}
