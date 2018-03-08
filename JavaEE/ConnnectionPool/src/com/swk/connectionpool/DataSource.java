package com.swk.connectionpool;

import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

import com.swk.utils.JDBCUtils;

public class DataSource implements javax.sql.DataSource{
	
private static LinkedList<Connection> connPool=new LinkedList<Connection>();
	
	static{
		for(int i=0;i<10;i++)
		{
			Connection conn=JDBCUtils.getConnection();
			connPool.add(conn);
		}	
	}
	
	
	@Override
	public Connection getConnection() throws SQLException {
		if(connPool.size()>0)
		{
			final Connection conn=connPool.removeFirst();
			//采用包装类
			//MyConnection mconn=new MyConnection(conn, connPool);
			
			//适配器
			//WrapExtendsAdapter mconn=new WrapExtendsAdapter(conn, connPool);
			
			//采用动态代理
			Connection proxyConn=(Connection)Proxy.newProxyInstance(conn.getClass().getClassLoader(),conn.getClass().getInterfaces(),new InvocationHandler() {
				
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					if(method.getName().equals("close"))
					{
						connPool.addLast(conn);
						return null;
					}else
					{
						Object retValue=method.invoke(conn, args);
						return retValue;
					}				
				}
			});
			
			return proxyConn;
		}else
		{
			throw new RuntimeException("服务器忙！");
		}
		
	}


	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
