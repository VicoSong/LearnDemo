package com.swk.staticproxy;

public class StaticProxyTest {
	public static void main(String[] args) {
		//��ʹ�ô���
		/*Principal principal=new Principal();
		principal.method1();
		principal.method2();*/
		
		//ʹ�ô���
		Proxy proxy=new Proxy(new Principal());
		proxy.method1();
		proxy.method2();
	}
}
