import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ExceptionInfo {
	public static void main(String[] args) 
	{
		//获取异常信息
		/*
		int[] arry=new int[2];
		try{
			System.out.println(arry[3]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			try{
				Date d=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
				String s=sdf.format(d);
				PrintStream ps=new PrintStream("exception.log");
				ps.println(s);
				System.setOut(ps);
				
			}catch(Exception ex)
			{
				throw new RuntimeException("创建异常日志文件失败");
			}
			e.printStackTrace(System.out);
		}*/
	
	
		//获取系统信息
		try{
			Properties p=System.getProperties();
		//	p.list(System.out);//输出到控制到
			p.list(new PrintStream("systeminfo.txt"));
		}catch(Exception e)
		{
			
		}
			
		
		}
}
