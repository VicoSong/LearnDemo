package com.swk.staticproxy;

public class Proxy {
	private Principal principal;
	public Proxy(Principal principal)
	{
		this.principal=principal;
	}
	
	public void method1()
	{
		principal.method1();
		//add othercode
	}
	
	public void method2()
	{
		principal.method2();
		//add othercode
	}
}
