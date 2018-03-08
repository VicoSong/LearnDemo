package com.swk.connectionpool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * �ð�װ��̳���������
 * ֻ��Ҫ��д��Ҫ��д�ķ�������
 * ����
 * 	a.дһ����̳���������(ʹ���Ǿ��е���ͬ����Ϊ)
 * 	b.����һ��ʵ�����������ñ���װ��������������������޹أ�
 * 	c.��дһ�����캯�������뱻��װ�����
 * 	d.����Ҫ��д�ķ�����д���뼴�ɡ�
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
