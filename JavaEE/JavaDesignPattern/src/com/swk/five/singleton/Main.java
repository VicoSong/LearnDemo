package com.swk.five.singleton;

public class Main {
	public static void main(String[] args)
	{
		Person1 p1= Person1.getPerson();
		p1.setName("zhangsan");
		
		Person1 p2=Person1.getPerson();
		p2.setName("lisi");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
