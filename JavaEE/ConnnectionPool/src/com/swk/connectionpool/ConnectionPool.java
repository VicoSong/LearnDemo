package com.swk.connectionpool;

import java.sql.Connection;
import java.util.LinkedList;

import com.swk.utils.JDBCUtils;

public class ConnectionPool {
	private static LinkedList<Connection> connPool=new LinkedList<Connection>();
	
	static{
		for(int i=0;i<10;i++)
		{
			Connection conn=JDBCUtils.getConnection();
			connPool.add(conn);
		}	
	}
	
	public synchronized static Connection  getConnection()
	{
		if(connPool.size()>0)
		{
			return connPool.removeFirst();
		}else
		{
			throw new RuntimeException("服务器正忙，请稍等");
		}
	}
	
	public static void close(Connection conn)
	{
		if(conn!=null)
		{
			connPool.addLast(conn);
		}
	}
	
}
