package com.swk.classloader.test;

import java.net.URL;

import org.jboss.weld.exceptions.ForbiddenArgumentException;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;



public class BootstrapTest {
    public static void main(String[] args)
    {
	//获取根类加载器加载的全部URL
	    URL[] urls=sun.misc.Launcher.getBootstrapClassPath().getURLs();
	    //遍历输出根类加载器加载的全部URL
	    for(int i=0;i<urls.length;i++)
	    {
		System.out.println(urls[i].toExternalForm());
	    }
    }
    
}
