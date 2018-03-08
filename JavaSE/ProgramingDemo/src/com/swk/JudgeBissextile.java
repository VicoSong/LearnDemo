package com.swk;
/**
 * 输入一个年份判断是否是闰年
 * @author 宋维康
 *
 */
import java.util.Scanner;
public class JudgeBissextile {
	/**
	 * @param year
	 */
	public void isBissextile(int year)
	{
		if((year%4==0)&&year%100!=0)
			System.out.println(year+" is bissextile");
		else if(year%400==0)
			System.out.println(year+" is bissextile");
		else
			System.out.println(year+" is  not bissextile");
		
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		JudgeBissextile judgebissextile=new JudgeBissextile();
		judgebissextile.isBissextile(scanner.nextInt());
	}
}
