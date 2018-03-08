package com.swk;

public class ShuiXianHuaShu{
	public void function(){
	System.out.println("100~1000之内的水仙花数有:");
	for(int i=100;i<1000;i++)
	{
		int theUnit,decade,hundreds;
		theUnit=i%10;
		decade=i/10%10;
		hundreds=i/100%10;
		if(theUnit*theUnit*theUnit+decade*decade*decade+hundreds*hundreds*hundreds==i)
		{
			System.out.println(i+"\t");
		}
	}
	}
	public static void main(String args[])
	{
		new ShuiXianHuaShu().function();
	}
}

