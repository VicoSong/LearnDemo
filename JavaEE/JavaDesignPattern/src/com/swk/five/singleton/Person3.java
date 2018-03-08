package com.swk.five.singleton;

/**
 * @author Administrator
 * 双重检查
 *
 */
public class Person3 {
	
	private static Person3 person3=null;
	private String name;
//	构造函数私有化
	private Person3(){};
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	  
   //	提供一个全局的静态方法  使用双重检查  
	public static  Person3  getPerson()
	{
		if(person3==null)
		{
			synchronized (Person3.class)
			{
				if(person3==null)
				{
					person3=new Person3();
				}
				
			} 
			
		}
		
		return person3;
	}

	@Override
	public String toString()
	{
		return "Person1 [name=" + name + "]";
	}
	
	
}
