package com.swk.classloader.test;



/**
 * Description:用于测试自定义类加载器，让自定义类加载器加载此类。
 * @author Vico
 *
 */
public class Person {
    private int id;
    private String name;
    private Person person;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
    }
    
    public void setPerson(Object object)
    {
	this.person=(Person)object;
    }
}
