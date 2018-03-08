package com.swk.classloader.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义类加载器
 * 	*继承与ClassLoader类
 * 	*重写findClass()方法
 * @author Vico
 *
 */

public class MyClassLoader extends ClassLoader {
    private String rootDir;
    
    
    /**
     * MyClassLoader的构造函数接收绝对路径
     * @param rootDir
     */
    public MyClassLoader(String rootDir)
    {
	this.rootDir=rootDir;
    }
    
    
    /* 
     * 重写ClassLoader的findClass()方法
     */
    protected Class<?> findClass(String name) throws ClassNotFoundException
    {
	byte[] classData=getClassData(name);
	if(classData==null)
	{
		throw new ClassNotFoundException();
	    
	}else {
	    return defineClass(name, classData, 0,classData.length);
	}
    }
    
    /**
     * getClassData()方法
     * 	*通过Class的类名，读取指定Class的文件内容
     * @param className
     * @return
     */
    private byte[] getClassData(String className)
    {
	//通过Class类名，查找对应Class文件的路径
	String path=classNameToPath(className);
	try {
		InputStream ins=new FileInputStream(path);
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		int bufferSize=4096;
		byte[] buffer=new byte[bufferSize];
		int bytesNumRead=0;
	    while((bytesNumRead=ins.read(buffer))!=-1)
	    {
	        baos.write(buffer,0,bytesNumRead);
	    }
	    return baos.toByteArray();
	} catch (IOException e) {
	   
	    e.printStackTrace();
	}
	return null;
    }
    
    private String classNameToPath(String className)
    {
	return rootDir+File.separatorChar+className.replace('.', File.separatorChar)+".class";
    }
}
