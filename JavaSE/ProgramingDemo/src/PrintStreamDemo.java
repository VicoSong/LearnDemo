import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintStreamDemo {
	public static void main(String[] args) throws IOException
	{
		BufferedReader bis=new BufferedReader(new InputStreamReader(System.in) );
		PrintWriter pw=new PrintWriter(System.out,true);
		String line=null;
		while((line=bis.readLine())!=null)
		{
			if("end".equals(line))
			{
				break;
			}
			pw.println(line.toUpperCase());
		}
		pw.close();
		bis.close();
	}
}
