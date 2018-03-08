import java.util.*;
public class DigitCount {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int []arry=new int[10];
		for(int i=0;i<arry.length;i++)
		{
			
			System.out.print("请输入第"+(i+1)+"个数:");
			arry[i]=sc.nextInt();
		}
		Arrays.sort(arry);
		for(int i:arry)
		{
			System.out.print(i+"\t");
		}
		System.out.println("");
		int positiveNumber=0;
		int negativeNumber=0;
		int zero=0;
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i]>0)
			{
				positiveNumber++;
			}
			if(arry[i]<0)
			{
				negativeNumber++;
			}
			if(arry[i]<0.000001&&arry[i]>-0.000001)
			{
				zero++;
			}
		}
		System.out.print("正数有："+positiveNumber+"\t");
		System.out.print("负数有："+negativeNumber+"\t");
		System.out.print("零有："+zero+"\t");
	}
}
