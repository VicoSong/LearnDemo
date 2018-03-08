import java.util.Scanner;


public class digitDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		String digit=sc.nextLine();
		System.out.println(digit);
		String str=String.valueOf(digit);
		
		System.out.println(deal(str).toString());
	}
	 static StringBuffer deal(String str)
	{
		//去除重复数字
		 int i,j;
		StringBuffer stb=new StringBuffer(str);
		for(i=0;i<str.length()-1;i++)
		{
			for(j=str.length()-1;j>i;j--)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					stb.deleteCharAt(j);
				}
			}
		}
		
		//删除连续数据
		int k=0;
		char temp=stb.charAt(0);
			for( k=1;k<stb.length()-1;k++)
			{
				if((stb.charAt(k)==(stb.charAt(k-1)+1))||(stb.charAt(k)==(stb.charAt(k-1)-1)))
				{
					stb.deleteCharAt(k-1);
				}
				if((stb.charAt(k)==(stb.charAt(k+1)+1))||((stb.charAt(k))==(stb.charAt(k+1)-1)))
				{
					stb.deleteCharAt(k+1);
				}
				
			}
				
		
		
		
		return stb;
	}
	 
}
