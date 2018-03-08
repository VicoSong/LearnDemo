package com.swk.five.singleton;

/**
 * @author Administrator
 * 同步方法
 *
 */
public class Person2 {
	
	private static Person2 person2=null;
	private String name;
//	构造函数私有化
	private Person2(){};
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
   //	提供一个全局的静态方法  使用同步方法
	public static synchronized Person2  getPerson()
	{
		if(person2==null)
		{
			person2=new Person2();
		}
		
		return person2;
	}

	@Override
	public String toString()
	{
		return "Person1 [name=" + name + "]";
	}
	
	
}
