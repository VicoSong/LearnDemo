import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ExceptionInfo {
	public static void main(String[] args) 
	{
		//��ȡ�쳣��Ϣ
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
				throw new RuntimeException("�����쳣��־�ļ�ʧ��");
			}
			e.printStackTrace(System.out);
		}*/
	
	
		//��ȡϵͳ��Ϣ
		try{
			Properties p=System.getProperties();
		//	p.list(System.out);//��������Ƶ�
			p.list(new PrintStream("systeminfo.txt"));
		}catch(Exception e)
		{
			
		}
			
		
		}
}
