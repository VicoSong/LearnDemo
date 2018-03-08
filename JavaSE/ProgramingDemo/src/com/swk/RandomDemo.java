package com.swk;
import java.util.*;
public class RandomDemo {
	public static void main(String args[])
	{
		int []num=new int[10];
		Random ra=new Random();
		for(int i=0;i<10;i++)
		{
			num[i]=ra.nextInt(100)+1;
		}
		int max=num[0];
		int min=num[0];
		for(int i=0;i<10;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		for(int i:num)
		{
			System.out.print(i+"\t");
		}
		StringBuffer bf;
		
		System.out.println("");
		System.out.println("最大值是："+max+"\t"+"最小值是："+min+"");
	}
}
