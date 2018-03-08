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
		FileOutputStream fos=new FileOutputStream(file); //���ļ���д������
		FileInputStream fis=new FileInputStream(file);//���ļ��ж�������\
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		 byte[]bytes="ABCDEFGHIJKLMN".getBytes();
		 byte[]by1="�㽶".getBytes();
		 bos.write(by1);
		 byte[]by2="ƻ��".getBytes();
		 bos.write(by2);
		 byte[]by3="����".getBytes();
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
