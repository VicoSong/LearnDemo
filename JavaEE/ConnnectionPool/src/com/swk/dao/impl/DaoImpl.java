package com.swk.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.swk.connectionpool.ConnectionPool;
import com.swk.utils.JDBCUtils;

public class DaoImpl {
	private DataSource ds=null;
	public DaoImpl(DataSource ds)
	{
		this.ds=ds;
	}
	
	public void add()
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			//conn=ConnectionPool.getConnection();
			conn=ds.getConnection();//通过数据源拿去连接
			pstmt=conn.prepareStatement("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.release(null, pstmt, null);
			ConnectionPool.close(conn);
		}
		
		
	}
}
