package com.swk.three.abstracts.factory;

public class Main {
	public static void main(String[] args)
	{
		FruitFactory sf =new SouthFruitFactory();
		sf.getApple().get();
		sf.getBanana().get();
		FruitFactory nf =new NorthFruitFactory();
		nf.getApple().get();
		nf.getBanana().get();
	}
}
