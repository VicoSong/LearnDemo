import java.util.Scanner;

public class Demo1
{
	public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
       int num=sc.nextInt();
       System.out.print(num+"="+"");
     int temp=2;
     while(temp<=num)
     {
    	 if(temp==num)
    	 {
    		 System.out.println(temp);
    		 break;
    	 }
    	 else if(num%temp==0)
    	 {
    		 System.out.print(temp+"*");
    		 num=num/temp;
    	 }
    	 else
    		 temp++;
    	 }
    }
}
