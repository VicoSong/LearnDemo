package com.swk.interfce;

import javax.jws.WebService;

@WebService(targetNamespace = "http://interfce.swk.com/", endpointInterface = "com.swk.interfce.HelloWordInterface", portName = "HelloWordImplPort", serviceName = "HelloWordImplService")
public class HelloWordImpl implements HelloWordInterface {

	
	public String sayHello() {
		System.out.println("Hello word");
		return "Hello Word";
	}

	
	public String sayHi(String s) {
		System.out.println("Hi word"+s);
		return "Hi word"+s;
	}

}
