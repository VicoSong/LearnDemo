package com.swk.basesubclassdynamicproxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/*
 * ��������Ķ�̬����
 * */
public class BaseSubclassDynamicProxyTest {

	public static void main(String[] args) 
	{
		/*
		 * Enhancer.create(type, callback)
		 * type:�Ǳ�������������
		 * callback:�൱��Proxy���е�invocationHandler
		 * 
		 * */
		final SpringBrother sb=new SpringBrother();
		SpringBrother psb=(SpringBrother)Enhancer.create(SpringBrother.class,new MethodInterceptor() {
			public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
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
		psb.eat();
		psb.sing(800);
		psb.dance(400);
		
	}
		
}
