package countAge;

import java.util.Scanner;

public class CountAge {
	public static void main(String[] args)
	{
		int lastPhoneNumber;
		int bornYear;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�������ֻ��ŵ����һλ��");
		lastPhoneNumber=sc.nextInt();
		System.out.println("");
		System.out.print("�����������ݣ�");
		bornYear=sc.nextInt();
		System.out.println("");
		int m=(lastPhoneNumber*2+5)*50+1765-bornYear;
		System.out.println("����ʵ�������ǣ�"+(m%100)+"���꣡");
	}
}
