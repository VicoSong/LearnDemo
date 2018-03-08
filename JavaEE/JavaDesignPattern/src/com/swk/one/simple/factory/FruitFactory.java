package com.swk.one.simple.factory;

public class FruitFactory {
	
	public static Fruit getFruit(Class<? extends Fruit> clazz) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		return (Fruit) clazz.newInstance();
	}
}

