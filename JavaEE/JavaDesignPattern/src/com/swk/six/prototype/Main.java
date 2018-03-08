package com.swk.six.prototype;

public class Main {

	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("vico");
		p1.setSex(true);
		System.out.println(p1.toString());
		Person p2 = p1.clone();
		p2.setName("swk");
		System.out.println(p2.toString());
		
	}
}
