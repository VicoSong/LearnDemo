package com.swk.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args)
    {
	/*
	 * 通过Proxy类的ewProxyInstance(ClassLoader,Class[] interfaces, InvoacationHandler)
	 *	*ClassLoader类加载器 ：指定委托类的类加载器。 
	 *	*Class[]指定对应委托类的Class.
	 *	*InvoacationHandler的实例（重写invoke）
	 *
	 *	*通过该方法可以获取到对应委托类的代理对象。
	 *
	 *	*动态代理的作用：
	 *		*不需要得到对应委托类的代理对象
	 *		*通过代理类对象，对委托类的方法进行过滤(修改)等。
	 * */
	final PersonImpl personImpl=new PersonImpl();
	Person personProxy=(Person)Proxy.newProxyInstance(personImpl.getClass().getClassLoader(),personImpl.getClass().getInterfaces(), new InvocationHandler() {
	    
	    /*
	     * invoke(Object proxy, Method method, Object[] args)
	     * 	*调用对应的委托类的方法
	     * 	*参数一：返回的是代理类对象
	     * 	*参数二：返回的是对应委托类方法的Method类型对象
	     * 	*返回的是对应委托类方法接受的实参
	     * 
	     * */
	    @Override
	    public Object invoke(Object proxy, Method method, Object[] args)
		    throws Throwable {
		/*//1.可以获取到对应委托类方法的参数
		String str=(String)args[0];
		if(str.equals("admin"))
		{
		    method.invoke(personImpl, "user");
		}*/
		
		//2.阻止调用对应委托类的方法
		/*String methodName=method.getName();
		if(methodName.equals("say"))
		{
		    System.out.println("People can say!");
		}*/
		
		//3.修改对应委托类方法的返回值
		String methodName=method.getName();
		if(methodName.equals("sing")){
		    return "人们喜欢唱歌！";
		}
			
		return null;
	    }
	});
	
	//personProxy.walk("admin");
	//personProxy.say();
	String str=personProxy.sing();
	System.out.println(str);
    }
}
