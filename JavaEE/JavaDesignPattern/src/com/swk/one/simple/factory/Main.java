package com.swk.one.simple.factory;

public class Main {
	
    public static void main(String[] args)
	{
		try
		{
			Fruit apple =FruitFactory.getFruit(Apple.class);
			apple.get();
			
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
