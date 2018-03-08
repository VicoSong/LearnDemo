package com.swk.dynamicproxy;

public class SpringBrother implements Human{

	@Override
	public void eat() {
		System.out.println("吃饭中......");
		
	}

	@Override
	public void sing(float money) {
		System.out.println("拿到钱"+money+"开始唱歌");
	}

	@Override
	public void dance(float money) {
		System.out.println("拿到钱"+money+"开始跳舞");
	}

	

}
