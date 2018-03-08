package com.swk.staticproxy;

public class StaticProxyTest {
	public static void main(String[] args) {
		//不使用代理
		/*Principal principal=new Principal();
		principal.method1();
		principal.method2();*/
		
		//使用代理
		Proxy proxy=new Proxy(new Principal());
		proxy.method1();
		proxy.method2();
	}
}
