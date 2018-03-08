class TestDemo implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"run方法在运行！");
		}
		
	}
}
public class ThreadDemo {
	public static void main(String args[])
	{
		 TestDemo t=new TestDemo();
		new Thread(t).start();
		for(int i=5;i<10;i++)
		{
			System.out.println(i+"main方法在运行！");
		}
	}
}
