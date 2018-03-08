package com.swk.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class FileManager {

	String[] words=null;
	int pos=0;
	public FileManager(String filename,char[] seperators) throws IOException
	{
		File file=new File(filename);
		StringBuffer
		FileReader reader =new FileReader(file);
		char[] buffer=new char[(int)file.length()];
		int len=reader.read(buffer);
		String results=new String(buffer, 0, len);
		String regex=null;
		if(seperators.length>1)
		{
			regex=""+seperators[0]+"|"+seperators[1];
		}else{
			regex=""+seperators[0];
			
		}
		
		words=results.split(regex);
		
	}
	
	public String  nextWord()
	{
		if (pos==words.length)
		{
			return null;
		}
		
		return words[++pos];
	}
	
	
	
}
