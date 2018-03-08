package com.swk.annotation;

import java.lang.reflect.Method;


/**
 * ���ڲ���ͨ�����ȡ�����ע������
 * @author Vico
 *
 */
public class AnnotationTest {
	
	public static void main(String[] args) throws NoSuchMethodException
	{
		//1.获取对应类的Class对象
		Class<Person>  clazz=Person.class;
		//2.根据Class对象获取Method或Field
		
		Method method=clazz.getDeclaredMethod("say");
		//3.ͨ通过Class对象、Method对象、Field对象获取对应的注解信息
		MyAnnotation myAnnotation=method.getAnnotation(MyAnnotation.class);
		//4.测试
		System.out.print(myAnnotation.age());
	}
}
