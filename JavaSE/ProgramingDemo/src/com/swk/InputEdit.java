package com.swk;
import java.util.*;
public class InputEdit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++)
		{
				if(sb.charAt(i)=='$')
				{
				  sb.delete(i-1,i+1);
				  i=i-2;
				}
			
			if(sb.charAt(i)=='%')
				{
					sb.delete(0, i+1);
				}
		}
	
		System.out.println(sb.toString());
		
	}
}
