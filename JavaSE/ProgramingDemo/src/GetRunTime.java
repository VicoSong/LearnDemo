/*
 ����:��ȡһ�γ��������ʱ�䡣
 ˼·����ȡ�������еĿ�ʼ�ͽ���ʱ�䣬�������
 ��ȡʱ�䣺System.currentTimeMillis();
 */
abstract class  GetTime{
	private long start;
	private long end;
	public final void getTime()
	{
		start=System.currentTimeMillis();
		runCode();
		end=System.currentTimeMillis();
		System.out.println("��������ʱ��Ϊ��"+(end-start)+"ms");
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
