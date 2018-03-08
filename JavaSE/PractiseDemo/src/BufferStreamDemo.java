import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class BufferStreamDemo {
	public static void main(String args[])
	{
		try{
		File file=new File("D://BufferedStreamTest.txt");
		while(!file.exists())
		{
			file.createNewFile();
		}
		FileOutputStream fos=new FileOutputStream(file); //向文件中写入数据
		FileInputStream fis=new FileInputStream(file);//从文件中读入数据\
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		 byte[]bytes="ABCDEFGHIJKLMN".getBytes();
		 byte[]by1="香蕉".getBytes();
		 bos.write(by1);
		 byte[]by2="苹果".getBytes();
		 bos.write(by2);
		 byte[]by3="橘子".getBytes();
		 bos.write(by3);
		 fos.write(bytes);
		 bos.flush();
		
		 while(fis.read(bytes)!=-1)
		 {
			 String str=new String(bytes);
			 System.out.println(str);
		 } 
		 bis.close();
		 bos.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
