package com.swk.webservice.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/** 
* @ClassName: HelloService 
* @Description: 演示Hello Service
* @author:Vico 
* @date 2016-3-20 下午4:20:47 
*  
*/
@WebService //标识这个类是一个web service
public class HelloService {
    public String sayHello(String str)
    {
	return "Hello" +str;
    }
    
    public String SayHi()
    {
	return "Hi,vico!";
    }
    
    /*
     * 调用静态方法Endpoint.publish创建一个系统服务
     * 参数：
     * 	  address访问地址
     * 	 implementor 实现者
     * 	
     **/
    public static void main(String[] args) {
	String servicePath="http://127.0.0.1:9090/hello";
	Endpoint.publish(servicePath, new HelloService());
	
	System.out.print("Service is ready!");
    }
}
