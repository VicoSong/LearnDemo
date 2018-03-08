package com.swk.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;


public class User implements Serializable{
	/**
	 * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name ;
	private Integer age ;
	private Boolean isMarried;
	
	private Date birthday;
	private byte[] photo;
	private String description;
	public Integer getId()
	{
		return id;
	}
	@Override
	public String toString()
	{
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", birthday=" + birthday + ", photo="
				+ Arrays.toString(photo) + ", description=" + description + "]";
	}
	public void setId(Integer id)
	{
		this.id = id;
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
	public Date getBirthday()
	{
		return birthday;
	}
	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}
	public byte[] getPhoto()
	{
		return photo;
	}
	public void setPhoto(byte[] photo)
	{
		this.photo = photo;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public Boolean getIsMarried()
	{
		return isMarried;
	}
	public void setIsMarried(Boolean isMarried)
	{
		this.isMarried = isMarried;
	}
}
