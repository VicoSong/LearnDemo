
public class ExceptionDemo {
	public static void main(String args[])
	{
		try{
		int array[]=new int[5];
		array[10]=7;
		}
		catch(Exception e)
		{
			System.err.println("异常内容"+e);
		}
		finally{
			System.out.println("这是异常测试程序");
		}
		System.out.println("这是一个java异常程序");
	}
}
