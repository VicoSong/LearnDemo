package com.swk.two.factory.method;

public  class Main {

	public static void main(String[] args)
	{
		FruitFactory appleFactory = new AppleFactory();
		appleFactory.getFruit().get();
		new BananaFactory().getFruit().get();
	}
}
