package com.swk;
import java.util.*;
public class DisposeNum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入需要分解的数："+"");
		int num=sc.nextInt();
		int k=2;
		System.out.print(num+"=");
		while(k<=num)
		{
			if(k==num)
			{
				System.out.print(num);
				  break;
			}
			else if(num%k==0)
			{
				System.out.print(k+"*");
				num=num/k;
			}
			else
				k++;
		}
		
		
	}
}
