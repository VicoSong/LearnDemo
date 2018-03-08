package com.swk.handler.impl;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.swk.handler.ResultSetHandler;
//ֻ�����ڽ����ֻ��һ����¼�����
//������������ͱ��е��ֶ���Ӧ��һ��
public class ResultSetListenerHandlerImple implements ResultSetHandler{

	public Object handler(ResultSet rs, Class clazz) {
		try {
				if(rs.next())
				{
					//�õ�������ĵ�Ԫ���ݶ���
					ResultSetMetaData rsmd=rs.getMetaData();
					//��ȡ�ж�����
					int colunCount=rsmd.getColumnCount();
					Object objs=clazz.newInstance();
					for (int i = 0; i < colunCount; i++) 
					{
						//�õ�����
						String columnName=rsmd.getColumnName(i+1);
						//�õ������Ӧ������
						Field field=clazz.getDeclaredField(columnName);
						//����˽�����Կ��Է���
						field.setAccessible(true);
						//��ȡ��ֵ
						Object objectValue=rs.getObject(i+1);
						//�����Ը�ֵ
						field.set(objs,objectValue);
				}
					return objs;
			}
			
		} catch (Exception e) {
			new RuntimeException();
		}

		return null;
	}

}
