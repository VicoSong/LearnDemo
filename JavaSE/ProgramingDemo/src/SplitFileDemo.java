import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SplitFileDemo {
	public static void main(String[] args) throws IOException 
	{
		//splitFile();
		  montage();
	}
	
	//�ָ��ļ�
	public static void splitFile() throws IOException
	{
		FileInputStream fis=new FileInputStream("f:\\1\\DOSsetpath.wmv");
		FileOutputStream fos=null;
		int count=1;
		int len=0;
		byte[] b=new byte[1024*512];
		while((len=fis.read(b))!=-1)
		{
			fos=new FileOutputStream("f:\\1\\2"+(count++)+".part");
			fos.write(b,0,len);
			fos.close();
		}
		fis.close();
	}
	//ƴ���ļ�
	public static void montage()
	{
		ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();
		for(int i=21;i<26;i++)
		{
			al.add(new FileInputStream("f:\\1\\2"+i+".part"));
		}
	    final Iterator<FileInputStream> it=al.iterator();
		Enumeration<FileInputStream> en=new Enumeration<FileInputStream>(){
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
		};
		SequenceInputStream sis=new SequenceInputStream(en);
	}
}
