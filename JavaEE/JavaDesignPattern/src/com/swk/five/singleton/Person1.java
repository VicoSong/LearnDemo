package com.swk.five.singleton;

/**
 * @author Administrator
 * 懒汉式
 *
 */
public class Person1 {
	
	private static Person1 person1=null;
	private String name;
//	构造函数私有化
	private Person1(){};
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
//	提供一个全局的静态方法
	public static  Person1  getPerson()
	{
		if(person1==null)
		{
			person1=new Person1();
		}
		
		return person1;
	}

	@Override
	public String toString()
	{
		return "Person1 [name=" + name + "]";
	}
	
	
}
