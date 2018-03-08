package com.swk.four.factory.pattern.application;

public class SubtractOperation extends Operation{

	@Override
	public double getResult()
	{
		// TODO Auto-generated method stub
		return this.getNum1()-this.getNum2();
	}

}
