import java.lang.reflect.Array;
import java.util.Scanner;
public class reverseDemo {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		System.out.println(reverse(str));
	}
	static StringBuffer reverse(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		return sb;
	}
}
