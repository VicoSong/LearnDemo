package com.swk.annotation;

/**
 * 
 * @author Vico
 *
 */
public class Person {
	
	private String name;
	
	private int age;
	@MyAnnotation(age = 23, name = "Brownswk")
	public void say()
	{
		System.out.print("姓名是"+name+",\t年龄:"+age);
		System.out.print("Hello Word");
	}
}
