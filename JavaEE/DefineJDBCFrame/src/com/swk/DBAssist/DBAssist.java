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

//自定义框架
public class DBAssist {
	//定义执行增、改、删动作的方法
	public boolean update(String sql,Object... params)
	{
		//拿到连接对象
		Connection conn=DBCPUtils.getConnection();
		int result=0;
		try {
			//创建预处理对象
			PreparedStatement pstmt=conn.prepareStatement(sql);
			//对？进行赋值
			//获取ParameterMetaData
			ParameterMetaData pmd=pstmt.getParameterMetaData();
			//获取？的个数
			int n=pmd.getParameterCount();
			if(n>0)
			{
				if(params==null||params.length!=n)
				{
					throw new RuntimeException("参数个数不匹配");
				}
				
				//依次给 ？赋值
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
				//将连接还回到池中
				conn.close(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//返回结果
		return result>0?true:false; 
	}
	
	//定义查询方法
		public Object query(String sql,Class clazz,Object... params)
		{
			//拿到连接对象
			Connection conn=DBCPUtils.getConnection();
			
			try {
				//创建预处理对象
				PreparedStatement pstmt=conn.prepareStatement(sql);
				//对？进行赋值
				//获取ParameterMetaData
				ParameterMetaData pmd=pstmt.getParameterMetaData();
				//获取？的个数
				int n=pmd.getParameterCount();
				if(n>0)
				{
					if(params==null||params.length!=n)
					{
						throw new RuntimeException("参数个数不匹配");
					}
					
					//依次给 ？赋值
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
					//将连接还回到池中
					conn.close(); 
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
}
