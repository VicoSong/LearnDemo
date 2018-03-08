package countAge;

import java.util.Scanner;

public class CountAge {
	public static void main(String[] args)
	{
		int lastPhoneNumber;
		int bornYear;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入手机号的最后一位：");
		lastPhoneNumber=sc.nextInt();
		System.out.println("");
		System.out.print("请输入出生年份：");
		bornYear=sc.nextInt();
		System.out.println("");
		int m=(lastPhoneNumber*2+5)*50+1765-bornYear;
		System.out.println("您的实际年龄是："+(m%100)+"周岁！");
	}
}
