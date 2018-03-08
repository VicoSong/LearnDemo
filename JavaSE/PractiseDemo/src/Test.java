import java.util.Scanner;

	public class Test
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		int arry[][] = new int[3][3];
		for(int i=0;i<arry.length;i++)
		{
			for(int j=0;j<arry[i].length;j++)
			{
				int temp=sc.nextInt();
				arry[i][j]=temp;
			}
		}
		for(int i[]:arry)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
	}
}