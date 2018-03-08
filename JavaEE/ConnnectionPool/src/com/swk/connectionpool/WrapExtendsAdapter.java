package com.swk.connectionpool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * 让包装类继承适配器类
 * 只需要重写需要改写的方法即可
 * 步骤
 * 	a.写一个类继承适配器类(使它们具有的相同的行为)
 * 	b.创建一个实例变量，引用被包装类对象（最好做到与具体类无关）
 * 	c.编写一个构造函数，传入被包装类对象
 * 	d.对需要改写的方法重写代码即可。
 * 
 * @author Vico
 *
 */
public class WrapExtendsAdapter extends ConnectionAdapter{
	private Connection conn;
	private LinkedList<Connection> connPool;
	public WrapExtendsAdapter(Connection conn,LinkedList<Connection> connPool)
	{
		super(conn);
		this.connPool=connPool;
	}
	
	@Override
	public void close() throws SQLException 
	{
		connPool.addLast(conn);
	}
}
