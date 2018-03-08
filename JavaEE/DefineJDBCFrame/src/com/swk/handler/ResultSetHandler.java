package com.swk.handler;

import java.sql.ResultSet;

public interface ResultSetHandler {
	public Object handler(ResultSet rs,Class clazz);
}
