import java.util.*;
public class WeatherConvert {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("*******欢迎使用迷你转换器*******");
		while(true)
		{
			System.out.print("请输入天气情况的第一个字母："+"");
			str=sc.next();
			if(str.equals("D"))
			{
				System.out.println("干燥");
			}
			else if(str.equals("M"))
			{
				System.out.println("潮湿");
			}
			else if(str.equals("H"))
			{
				System.out.println("炎热");
			}
			else if(str.equals("R"))
			{
				System.out.println("下雨");
			}
			else
				System.out.println("输入有误！");
			
			System.out.print("你想继续玩吗？（y/n）");
			String flag=sc.next();
			if(flag.equals("y"))
			{
				continue;
			}
			if(flag.equals("n"))	
			{
				System.out.println("退出系统!");
				System.exit(0);
			}
		}
	}
}
