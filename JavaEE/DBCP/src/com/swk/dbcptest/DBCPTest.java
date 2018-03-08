package com.swk.dbcptest;

import java.sql.Connection;

import com.swk.utils.DBCPUtils;

public class DBCPTest {
	public static void main(String[] args) {
			Connection conn=DBCPUtils.getConnection();
			System.out.println(conn);	
		}
}
