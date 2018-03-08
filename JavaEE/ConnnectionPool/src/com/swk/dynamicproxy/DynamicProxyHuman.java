package com.swk.dynamicproxy;



//模拟动态代理
public class DynamicProxyHuman implements Human{

	private Human human;
	
	 public DynamicProxyHuman(Human human) {
		this.human=human;
	}
	@Override
	public void eat() {
		human.eat();
		
	}

	@Override
	public void sing(float money) {
		if(money>100)
		{
			human.sing(money/2);
		}
	}

	@Override
	public void dance(float money) {
		if(money>200)
		{
			human.dance(money/2);
		}
	}

}
