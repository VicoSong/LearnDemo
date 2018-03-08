import java.util.Scanner;

public class StackTraceTest {

	public static int factorial(int n)
	{
		int r;
		Throwable t=new Throwable();
		StackTraceElement[] frame=t.getStackTrace();
		for(StackTraceElement f:frame)
		{
			System.out.println(f);
		}
		if(n==1)
		{
			return r=n;
		}
		else {
			r=n*factorial(n-1);
		}
		return r;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}
}
