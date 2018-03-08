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
	//��ʾ��ȡDatabaseMetaData
	@Test
	public void testDatabaseMetaData() throws Exception
	{
		//��ȡ���Ӷ���
		Connection conn=DBCPUtils.getConnection();
		//��ȡDataBaseMetaData����
		DatabaseMetaData dmt=conn.getMetaData();
		//��ȡ���ݿ������
		String dataBaseName=dmt.getDatabaseProductName();
		System.out.println(dataBaseName);
	}
	
		//��ʾ��ȡParameterMetaData
		@Test
		public void testParameterMetaData() throws Exception
		{
			//��ȡ���Ӷ���
			Connection conn=DBCPUtils.getConnection();
			//����Ԥ�������
			PreparedStatement pstmt=conn.prepareStatement("select * from user where user=? and password=?");
			//��ȡParameterMetaData����
			ParameterMetaData pmd=pstmt.getParameterMetaData();
			//��ȡ��������
			int n=pmd.getParameterCount();
			System.out.println("����"+n+"������");
		}
		
				//��ʾ��ȡResultSetMetaData
				@Test
				public void testResultSetMetaData() throws Exception
				{
					//��ȡ���Ӷ���
					Connection conn=DBCPUtils.getConnection();
					//����Ԥ�������
					PreparedStatement pstmt=conn.prepareStatement("select * from user");
					//ִ��SQL���
					ResultSet rs=pstmt.executeQuery();
					//��ȡResultSetMetaData����
					ResultSetMetaData rsmd=rs.getMetaData();
					//��ȡ����
					int n=rsmd.getColumnCount();
					System.out.println("����"+n+"��");
					//��ȡ��������
					for(int i=0;i<n;i++)
					{
						System.out.println(rsmd.getColumnName(i+1));
					}
				}
	
}
