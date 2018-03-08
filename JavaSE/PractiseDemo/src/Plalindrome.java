import java.util.*;
public class Plalindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		Long num=sc.nextLong();
		String str=String.valueOf(num);
		char[]arry=str.toCharArray();
		int length=arry.length;
		Boolean flag=false;
		for(int i=0;i<arry.length/2;i++)
		{
			if(arry[i]==arry[arry.length-i-1])
			{
				flag=true;
			}
			else
				flag=false;
		}
		if(flag==true)
		{
			System.out.println(num+"是回文数字");
		}
		else
			System.out.println(num+"不是回文数字");
	}
}
