package com.swk.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)
	{
		int num=0;
		int order=-1;
		Map<String, Integer> infos= new HashMap<String, Integer>();
		System.out.println("请输入人数:");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("请输排序方式（0:降序,1:升序）:");
		order=sc.nextInt();
		String info=null;
		String[] arry=null;
		System.out.println("名字和成绩:");
		info=sc.nextLine();
		for(int i=0;i<num;i++ )
		{
			info=sc.nextLine();
			arry=info.split(" ");
			infos.put(arry[0], Integer.valueOf(arry[1]));
		}
		System.out.println(infos);
	}
	
}
