import java.io.InputStream;
public class InputStreamDemo {
	public static void main(String args[])
	{
		InputStream is=System.in;
		try{
			byte[]bs=new byte[1024];
		     int len=is.read(bs);
			System.out.println("ÊäÈëµÄÄÚÈİ£º"+new String(bs).trim());
			is.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
