import java.util.*;
public class numDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Long num=sc.nextLong();
	    // String str=Long.toString(num);
	   String str=String.valueOf(num);
	    char []arry=str.toCharArray();
	    int length=arry.length;
	    System.out.println("����һ��"+length+"λ��");
	    for(int i=arry.length-1;i>=0;i--)
	    {
	    	System.out.print(arry[i]+"\t");
	    }
	   
	}
}
