package com.swk.filecontentscombine;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Description: 将 a.txt文件中的单词与 b.txt文件中的单词交替合并到 c.txt 文件中, 
*              	a.txt文件中的单词用回车符分隔， b.txt用回车或空格进行分割。
 * @author Vico
 *
 */
public class MainClass {
	
	public static void main(String[] args) throws Exception {
		FileManager a=new FileManager("a.txt",new char[]{'\n'});
		FileManager b=new FileManager("b.txt",new char[]{'\n',' '});
		FileWriter c=new FileWriter("c.txt");
		String aWord=null;
		String bWord=null;
		while((aWord=a.nextWord())!=null)
		{
			c.write(aWord+"\n");
			bWord=b.nextWord();
			if (bWord!=null) {
				c.write(bWord+"\n");
			}
		}
		
		while((bWord=b.nextWord())!=null)
		{
			c.write(bWord+"\n");
		}
		
		c.close();
		
	}
	
	
	
	
	
}

class FileManager{
	String[] words=null;
	int pos=0;
	String results="";
	String regex="";
	public FileManager(String filename,char[] seperator) {
		try {
			File file=new File("F://"+filename);
			String path=file.getAbsolutePath();
			System.out.println(path);
			FileReader reader=new FileReader(file);
			char[] buf=new char[(int)file.length()];
			int len=reader.read(buf);
			 results=new String(buf, 0, len);
			if(seperator.length>1)
			{
				regex=""+seperator[0]+"|"+seperator[1];
			}else {
				regex=""+seperator[0];
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		words=results.split(regex);
	}
	
	public String nextWord()
	{
		if(pos==words.length)
		{
			return null;
		}
		
		return words[pos++];
	}
	
}