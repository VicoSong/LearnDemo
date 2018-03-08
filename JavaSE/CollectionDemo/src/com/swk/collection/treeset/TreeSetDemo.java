package com.swk.collection.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Description:演示TreeSet的用法
 * @author Vico
 *
 */
/**
 * @author Vico
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Person> personSet=new TreeSet<Person>(new myComparator());
		personSet.add(new Person("zhangsan",20));
		personSet.add(new Person("lisi",10));
		personSet.add(new Person("wanger",30));
		personSet.add(new Person("mazi",20));
		
		Iterator it=personSet.iterator();
		while(it.hasNext())
		{
			Person p=(Person)it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}
	
}

/*
 * 方法一：使元素具备可比较性
 * **/
class Person implements Comparable<Object>{
	
	private String name;
	private int age;
	 Person() {}
	 Person(String name,int age){
		 this.name=name;
		 this.age=age;
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		@Override
	public int compareTo(Object obj) {
		if(!(obj instanceof Person))
		{
			throw new RuntimeException("object convert failed ");
		}
		
		Person p=(Person)obj;
		if(this.age>p.age)
		{
			return 1;
		}else if(this.age==p.age){
			
			return this.name.compareTo(p.name);
		}else{
			return -1;
		}
		
	}
}
/*
 * 方法二:自定义比较器
 * */
class myComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Person p1=(Person)o1;
		Person p2=(Person)o2;
		if(p1.getAge()>p2.getAge())
		{
			return 1;
		}else if (p1.getAge()==p2.getAge()) {
			return p1.getName().compareTo(p2.getName());
			
		}else {
			return -1;
		}
		
	}
	
}
