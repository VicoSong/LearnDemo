package com.swk.handler.impl;


import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.swk.handler.ResultSetHandler;
//适用于结果集有多条记录的情况
//对象的属性名和表中的字段名应当一致
public class ResultSetHandlerImple implements ResultSetHandler{

	public Object handler(ResultSet rs, Class clazz) {
		List<Object> list=new ArrayList<Object>();
		try {
				
				while(rs.next())
				{
					//拿到结果集的的元数据对象
					ResultSetMetaData rsmd=rs.getMetaData();
					//获取有多少列
					int colunCount=rsmd.getColumnCount();
					Object objs=clazz.newInstance();
					for (int i = 0; i < colunCount; i++) 
					{
						//拿到列名
						String columnName=rsmd.getColumnName(i+1);
						//拿到对象对应的属性
						Field field=clazz.getDeclaredField(columnName);
						//设置私有属性可以访问
						field.setAccessible(true);
						//获取列值
						Object objectValue=rs.getObject(i+1);
						//给属性赋值
						field.set(objs,objectValue);
				}
				list.add(objs);	
			}
				
		} catch (Exception e) {
			return null;
		}
		return list;	
	}

}
