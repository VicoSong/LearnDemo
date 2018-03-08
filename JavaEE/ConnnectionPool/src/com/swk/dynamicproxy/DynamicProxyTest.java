package com.swk.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*
 * 基于接口的动态代理
 * 
 * */
public class DynamicProxyTest {

	public static void main(String[] args) {
		/*
		Human human=new SpringBrother();
		human.eat();
		human.sing(100);
		human.dance(200);*/
		
		//使用DynamicProxyHuman类代理
		/*Human human=new DynamicProxyHuman(new SpringBrother());
		human.eat();
		human.sing(500);
		human.dance(100);*/
		
		//使用java.lang.reflect.Proxy自动生成代理类,
		final SpringBrother sb=new SpringBrother();
		Human human=(Human)Proxy.newProxyInstance(sb.getClass().getClassLoader(),
				sb.getClass().getInterfaces(),new InvocationHandler() {
					
					/*
					 * proxy：代理人
					 * method:代理方法
					 * args:方法的参数
					 * */
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("被代理了");
						if(method.getName().equals("sing"))
						{
							float money=(Float)args[0];
							if(money>300)
							{
								Object retValue=method.invoke(sb, money/2);
								return retValue;
							}else
							{
								return null;
							}
						}
						
						if(method.getName().equals("dance"))
						{
							float money=(Float)args[0];
							if(money>500)
							{
								Object retValue=method.invoke(sb, money/2);
								return retValue;
							}
							else
							{
								return null;
							}
						}
						Object ret=method.invoke(sb, args);
						return ret;
					}
				});
		human.eat();
		human.sing(100);
		human.dance(600);
	}
}
