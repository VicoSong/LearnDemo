package com.swk.dynamicproxy;

/**
 * 真正的业务类
 * @author Vico
 *
 */
public class PersonImpl implements Person{

    @Override
    public void say() {
	System.out.println("人会说话。");
	
    }

   

    @Override
    public void walk(String str) {
	System.out.println(str+",是传进来的参数");
	
    }

    @Override
    public String sing() {
	
	return "People like singing!";
    }

}
