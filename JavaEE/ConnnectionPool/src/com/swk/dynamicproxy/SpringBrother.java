package com.swk.dynamicproxy;

public class SpringBrother implements Human{

	@Override
	public void eat() {
		System.out.println("�Է���......");
		
	}

	@Override
	public void sing(float money) {
		System.out.println("�õ�Ǯ"+money+"��ʼ����");
	}

	@Override
	public void dance(float money) {
		System.out.println("�õ�Ǯ"+money+"��ʼ����");
	}

	

}
