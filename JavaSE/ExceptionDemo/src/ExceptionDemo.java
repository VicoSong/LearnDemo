
public class ExceptionDemo {
	public static void main(String args[])
	{
		try{
		int array[]=new int[5];
		array[10]=7;
		}
		catch(Exception e)
		{
			System.err.println("�쳣����"+e);
		}
		finally{
			System.out.println("�����쳣���Գ���");
		}
		System.out.println("����һ��java�쳣����");
	}
}
