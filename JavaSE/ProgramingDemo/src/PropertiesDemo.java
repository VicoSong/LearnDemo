import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args)
	{
		//propertiesDemo();
		 try{
			 runCount();
		 }catch(Exception e)
		 {
			 
		 }
		
	}
	
	/*
	public static void propertiesDemo()
	{
		Properties p=new Properties();
		p.setProperty("张三", "19");
		p.setProperty("李四", "17");
		p.setProperty("王二", "20");
		
		
		Set<String> names=p.stringPropertyNames();
		for(String s:names)
		{
			System.out.println(s+p.getProperty(s));
		}
		
	}
	*/
	
	/*
	  需求：建立一个配置文件，记录软件运行次数
	  
	 */
	public static void runCount() throws IOException
	{
		Properties prop=new Properties();
		File file=new File("F:\\count.ini");
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		int count=0;
		String value=prop.getProperty("times");
		if(value!=null)
		{
			count=Integer.parseInt(value);
			if(count>3)
			{
				System.out.println("试用次数已到，请注册！");
				return ;
			}
		}
		count++;
		prop.setProperty("times", count+"");
		FileOutputStream fos=new FileOutputStream(file);
		prop.store(fos, "");
		fos.close();
		fis.close();
		
	}
}
