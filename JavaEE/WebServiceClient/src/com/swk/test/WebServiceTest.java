package com.swk.test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.junit.Test;

import com.swk.interfce.HelloWordImplService;
import com.swk.interfce.HelloWordImplServiceLocator;
import com.swk.interfce.HelloWordInterface;

public class WebServiceTest {

	@Test
	public void test1() throws ServiceException, RemoteException {
		
		HelloWordImplService his=new HelloWordImplServiceLocator();
		HelloWordInterface hw=his.getHelloWordImplPort();
		System.out.println(hw.sayHello());
		String str=hw.sayHi("Java client");
		System.out.println(str);
	}
	
	@Test
	public void test2() throws ServiceException, RemoteException {
		
		HelloWordImplService his=new HelloWordImplServiceLocator();
		HelloWordInterface hw=his.getHelloWordImplPort();
		System.out.println(hw.sayHello());
		
	}

}
