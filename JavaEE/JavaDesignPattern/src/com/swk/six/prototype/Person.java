package com.swk.six.prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{

	private String name;
	private Integer age;
	private Boolean sex;
    private List<String> friends;
	public List<String> getFriends()
	{
		return friends;
	}
	public void setFriends(List<String> friends)
	{
		this.friends = friends;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public Boolean getSex()
	{
		return sex;
	}
	public void setSex(Boolean sex)
	{
		this.sex = sex;
	}
	
	/* (non-Javadoc)简单clone
	 * @see java.lang.Object#clone()
	 */
	/*@Override
	protected Person clone() 
	{
		// TODO Auto-generated method stub

		try
		{
			return (Person)super.clone();
		} catch (CloneNotSupportedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}*/
	
	@Override
	protected Person clone() 
	{
		// TODO Auto-generated method stub

		try
		{
			Person person=(Person)super.clone();
			List<String> friends=new ArrayList<String>();
			for(String friend : this.getFriends())
			{
				friends.add(friend);
			}
			
			person.setFriends(friends);
			return person;
		} catch (CloneNotSupportedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
}
