package com.swk.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyClass {

	public static void main(String[] args) throws Exception
	{
		while(true)
		{
			System.out.println("Hi:"+new BufferedReader(new InputStreamReader(System.in)).readLine());
		}
	}
}
