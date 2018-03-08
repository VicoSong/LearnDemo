package com.swk;
import java.util.*;
public class Fibonaci {
	public static void main(String args[])
	{
		/*
		int f1=1;
		int f2=1;
		int f;
		System.out.print(f1+"\t");
		System.out.print(f2+"\t");
		for(int i=3;i<12;i++)
		{
			f=f2;
			f2=f1+f2;
			f1=f;
			System.out.print(f2+"\t");
			if(i%4==0)
			{
				System.out.println();
			}
		}
		*/
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.print(fibonaci(i)+"\t");	
			if(i%5==0)
			{
				System.out.println();
			}
		}
	}
	public static int fibonaci(int num)
	{
		
		if(num==2||num==1)
		{
			return 1;
		}
		else 
			return fibonaci(num-1)+fibonaci(num-2);
	}
}
