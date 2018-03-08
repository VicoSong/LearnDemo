package com.swk.classloader.test;

import java.lang.reflect.Method;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Description:测试MyClassLoader类加载器
 * @author Vico
 *
 */
public class FileSystemTest {
    public static void main(String[] args) {
	String webRootPath="WEBROOT\\WEB-INF\\classes";
	MyClassLoader myClassLoader1=new MyClassLoader(webRootPath);
	MyClassLoader myClassLoader2=new MyClassLoader(webRootPath);
	String className="com.swk.classloader.test.Person";
	
	try {
	    Class clazz1=myClassLoader1.findClass(className);
	    Object object1=clazz1.newInstance();
	    Class clazz2=myClassLoader2.findClass(className);
	    Object object2=clazz2.newInstance();
	    
	    Method method=clazz2.getDeclaredMethod("setPerson", Object.class);
	    method.invoke(object2, object1);
	    
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
