package com.swk;

public class PrintStar {
	public void function()
	{
		for(int i=1;i<=14;i+=2)
		{
			for(int j=1;j<=i&&i+j<=14;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		new PrintStar().function();
	}
}
