import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;


public class ReaderWriterDemo {
	public static void main(String args[])
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		try{
			Writer out=new PrintWriter(System.out);
			
			char[]cs=new char[100];
			isr.read(cs);
			//String str=new String(cs);
			//System.out.println("ÊäÈëµÄ×Ö·û´®ÄÚÈİ£º\n"+str.trim());
			out.write(cs);
			isr.close();
			out.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
