
public class SysConvert {
	//十进制转二进制  负数无法进行转换
	public static void toBinary(int num)
	{
		StringBuffer sb=new StringBuffer();
		while(num>0)
		{
			sb.append(num%2);
			num=num>>1;
		}
		System.out.println(sb.reverse().toString());
	}
	//十进制转十六进制
	public  static void toHex(int num)
	{
		StringBuffer sb=new  StringBuffer();
		for(int i=0;i<8;i++)
		{
			int temp=num&15;
		//	sb.append(temp>9?((char)(temp-10+'A')):temp);
			if(temp>9)
			{
				  // System.out.println((char)(temp-10+'A'));
				sb.append((char)(temp-10+'A'));
			}
			else
				// System.out.println(temp);
				sb.append(temp);
			num=num>>>4;
			
		}
		System.out.println(sb.reverse().toString());
	}
	//查表法 十进制转十六进制
	public  static void toHex_ByTable(int num)
	{
		char[]  chs={'0','1','2','3',
				     '4','5','6','7',
				     '8', '9','A','B',
				     'C','D','E','F'};
		char[] arr=new  char[8];
		int pos=arr.length;
		while(num!=0)
		{
			int temp=num&15;
			arr[--pos]=chs[temp];
			
			num=num>>>4;
		}
		for(int i=pos-1;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	//查表法 十进制转二进制 负数可以进行转换
	public static void toBinary_ByTable(int num)
	{
		char[] chs={'0','1'};
		char[] arr=new char[32];
		int pos=arr.length;
		while(num!=0)
		{
			int temp=num&1;
			arr[--pos]=chs[temp];
			num=num>>>1;
		}
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}
	//优化
	public static void convert(int num,int base,int offset)
	{
		if(num==0)
		{
			System.out.println(0);
			return ;
		}
		char[] chs={'0','1','2','3',
			     '4','5','6','7',
			     '8', '9','A','B',
			     'C','D','E','F'};
		char[] arr=new char[32];
		int pos=arr.length;
		while(num!=0)
		{
			int temp=num&base;
			arr[--pos]=chs[temp];
			num=num>>>offset;
		}
		for(int i=pos;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	//主函数
	public static void main(String[] args)
	{
		 convert(60,15,4);
	}
}
