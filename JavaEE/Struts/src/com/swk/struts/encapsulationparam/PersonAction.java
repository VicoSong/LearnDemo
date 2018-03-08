package com.swk.struts.encapsulationparam;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @ClassName: Person 
* @Description: demo encapsulation request param,Action class as model object
* 		directly encapsulate request param
* @author:Vico 
* @date 2016-3-30 下午8:19:11 
*  
*/
public class PersonAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
	System.out.print("name："+name +"age:"+age+"password:"+password);
	return NONE;
    }
    private String name;
    private int age;
    private String password;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
	this.password=password;
    }
    
}
