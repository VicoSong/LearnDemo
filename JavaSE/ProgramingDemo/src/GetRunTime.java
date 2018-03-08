/*
 需求:获取一段程序的运行时间。
 思路：获取程序运行的开始和结束时间，相减即可
 获取时间：System.currentTimeMillis();
 */
abstract class  GetTime{
	private long start;
	private long end;
	public final void getTime()
	{
		start=System.currentTimeMillis();
		runCode();
		end=System.currentTimeMillis();
		System.out.println("程序运行时间为："+(end-start)+"ms");
	}
	public abstract void runCode();
}
class subTime extends GetTime{
	public void runCode()
	{
		for(int i=1;i<1000;i++)
		{
			/*
			System.out.print(i);
			if(i%50==0)
			{
				System.out.println();
			}
			*/
		}
		System.out.println();
	}
}
public class GetRunTime {
	public static void main(String args[])
	{
		new subTime().getTime();
	}
}
