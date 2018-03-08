package com.swk.classloader.test;

public class SystemClassLoaderTest {
    public static void main(String[] args)
    {
	ClassLoader classLoader=SystemClassLoaderTest.class.getClassLoader();
	System.out.println(classLoader+"\t:"+classLoader.toString());
    }
}
