package com.swk.DBAssist;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.swk.handler.impl.ResultSetHandlerImple;
import com.swk.handler.impl.ResultSetListenerHandlerImple;
import com.swk.utils.DBCPUtils;

//�Զ�����
public class DBAssist {
	//����ִ�������ġ�ɾ�����ķ���
	public boolean update(String sql,Object... params)
	{
		//�õ����Ӷ���
		Connection conn=DBCPUtils.getConnection();
		int result=0;
		try {
			//����Ԥ�������
			PreparedStatement pstmt=conn.prepareStatement(sql);
			//�ԣ����и�ֵ
			//��ȡParameterMetaData
			ParameterMetaData pmd=pstmt.getParameterMetaData();
			//��ȡ���ĸ���
			int n=pmd.getParameterCount();
			if(n>0)
			{
				if(params==null||params.length!=n)
				{
					throw new RuntimeException("����������ƥ��");
				}
				
				//���θ� ����ֵ
				for (int i = 0; i < params.length; i++) 
				{
					pstmt.setObject((i+1), params[i]);
				}
				
			}
			
			result=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//�����ӻ��ص�����
				conn.close(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//���ؽ��
		return result>0?true:false; 
	}
	
	//�����ѯ����
		public Object query(String sql,Class clazz,Object... params)
		{
			//�õ����Ӷ���
			Connection conn=DBCPUtils.getConnection();
			
			try {
				//����Ԥ�������
				PreparedStatement pstmt=conn.prepareStatement(sql);
				//�ԣ����и�ֵ
				//��ȡParameterMetaData
				ParameterMetaData pmd=pstmt.getParameterMetaData();
				//��ȡ���ĸ���
				int n=pmd.getParameterCount();
				if(n>0)
				{
					if(params==null||params.length!=n)
					{
						throw new RuntimeException("����������ƥ��");
					}
					
					//���θ� ����ֵ
					for (int i = 0; i < params.length; i++) 
					{
						pstmt.setObject((i+1), params[i]);
					}
					
				}
				
				ResultSet rs=pstmt.executeQuery();
				return new ResultSetHandlerImple().handler(rs, clazz);
				
			} catch (SQLException e) {
				return null;
			}finally {
				try {
					//�����ӻ��ص�����
					conn.close(); 
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
}
