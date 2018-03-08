package com.swk.interfce;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "HelloWordInterface", targetNamespace = "http://interfce.swk.com/")
public interface HelloWordInterface {
	@WebMethod(operationName = "sayHello", action = "urn:SayHello")
	public String sayHello();
	@WebMethod(operationName = "sayHi", action = "urn:SayHi")
	public String sayHi(@WebParam(name = "arg0") String s);
}
