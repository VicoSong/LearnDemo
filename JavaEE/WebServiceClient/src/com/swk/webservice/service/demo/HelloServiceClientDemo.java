package com.swk.webservice.service.demo;

import org.junit.Test;

import com.swk.webservice.service.HelloService;
import com.swk.webservice.service.HelloServiceService;

/** 
* @ClassName: HelloServiceClientDemo 
* @Description: web Service 客户端测试
* @author:Vico 
* @date 2016-3-20 下午4:40:25 
*  
*/
public class HelloServiceClientDemo {
    @Test
    public void helloServiceDemo()
    {
	HelloServiceService hs= new HelloServiceService();
	HelloService port=hs.getHelloServicePort();
	String returnString=port.sayHello("vico");
	System.out.print(returnString);
    }
}
