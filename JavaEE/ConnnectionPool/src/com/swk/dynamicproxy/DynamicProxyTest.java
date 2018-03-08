package com.swk.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*
 * ���ڽӿڵĶ�̬����
 * 
 * */
public class DynamicProxyTest {

	public static void main(String[] args) {
		/*
		Human human=new SpringBrother();
		human.eat();
		human.sing(100);
		human.dance(200);*/
		
		//ʹ��DynamicProxyHuman�����
		/*Human human=new DynamicProxyHuman(new SpringBrother());
		human.eat();
		human.sing(500);
		human.dance(100);*/
		
		//ʹ��java.lang.reflect.Proxy�Զ����ɴ�����,
		final SpringBrother sb=new SpringBrother();
		Human human=(Human)Proxy.newProxyInstance(sb.getClass().getClassLoader(),
				sb.getClass().getInterfaces(),new InvocationHandler() {
					
					/*
					 * proxy��������
					 * method:������
					 * args:�����Ĳ���
					 * */
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("��������");
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
