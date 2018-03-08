package com.swk.dbcptest;

import java.sql.Connection;

import com.swk.utils.C3p0Utiles;

public class C3p0Test {
	public static void main(String[] args) {
			Connection conn=C3p0Utiles.getConnection();
			System.out.println(conn);	
		}
}
