import java.util.*;
public class WeatherConvert {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("*******��ӭʹ������ת����*******");
		while(true)
		{
			System.out.print("��������������ĵ�һ����ĸ��"+"");
			str=sc.next();
			if(str.equals("D"))
			{
				System.out.println("����");
			}
			else if(str.equals("M"))
			{
				System.out.println("��ʪ");
			}
			else if(str.equals("H"))
			{
				System.out.println("����");
			}
			else if(str.equals("R"))
			{
				System.out.println("����");
			}
			else
				System.out.println("��������");
			
			System.out.print("����������𣿣�y/n��");
			String flag=sc.next();
			if(flag.equals("y"))
			{
				continue;
			}
			if(flag.equals("n"))	
			{
				System.out.println("�˳�ϵͳ!");
				System.exit(0);
			}
		}
	}
}
