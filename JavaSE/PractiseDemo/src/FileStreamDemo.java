import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileStreamDemo {
	public static void main(String args[])
	{
		try{
		File file=new File("D://FileStreamDemo.tex");
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileOutputStream fos=new FileOutputStream(file);
		FileInputStream fis=new FileInputStream(file);
		byte[]by="这是一个文件输入输出测试！".getBytes();
		fos.write(by);
		while(fis.read(by)!=-1)
		{
			String str=new String(by);
			System.out.println("从文件中读出的数据是:"+str);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
