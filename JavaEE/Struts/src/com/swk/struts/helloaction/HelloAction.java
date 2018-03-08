package com.swk.struts.helloaction;

public class HelloAction {
    public String sayHello()
    {
	System.out.println("Hello Action 的sayHello()方法被执行了！");
	return "success";
    }
}
