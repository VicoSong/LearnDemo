package com.swk.mybatis.domain;

import java.io.Serializable;

public class Person implements Serializable {
    @Override
    public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age
		+ ", remark=" + remark + "]";
    }
    /** 
    * @Fields serialVersionUID : TODO
    */ 
    private static final long serialVersionUID = 1L;
    
    private PersonInfo personInfo;//一对一映射关系
    private Integer id;
    private String name;
    private Integer age;
    private String remark;
    public PersonInfo getPersonInfo() {
        return personInfo;
    }
    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}
