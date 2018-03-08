import java.util.Scanner;


public class phoneticizeToDigit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=new String(sc.nextLine());
		System.out.println(convert(str).toString());
	}
	static StringBuffer convert(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		StringBuffer stb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if((sb.charAt(i)=='y')&&(sb.charAt(i+1)=='i'))
			{
				stb.append("1");
			}
			if((sb.charAt(i)=='e')&&(sb.charAt(i+1)=='r'))
			{
				stb.append("2");
			}
			
			if((sb.charAt(i)=='s')&&(sb.charAt(i+1)=='a')&&(sb.charAt(i+2)=='n'))
			{
				stb.append("3");
			}
			
			if((sb.charAt(i)=='s')&&(sb.charAt(i+1)=='i'))
			{
				stb.append("4");
			}
			if((sb.charAt(i)=='w')&&(sb.charAt(i+1)=='u'))
			{
				stb.append("5");
			}
			if((sb.charAt(i)=='l')&&(sb.charAt(i+1)=='i')&&(sb.charAt(i+2)=='u'))
			{
				stb.append("6");
			}
			if((sb.charAt(i)=='q')&&(sb.charAt(i+1)=='i'))
			{
				stb.append("7");
			}
			if((sb.charAt(i)=='b')&&(sb.charAt(i+1)=='a'))
			{
				stb.append("8");
			}
			if((sb.charAt(i)=='j')&&(sb.charAt(i+1)=='i')&&(sb.charAt(i+2)=='u'))
			{
				stb.append("9");
			}
		}
		return stb;
	}
}
