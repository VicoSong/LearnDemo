package com.swk.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayTest {

	public static void main(String[] args)
	{
		String testStr = "adsfhzxfdfjdty";
		ByteArrayInputStream in = new ByteArrayInputStream(testStr.getBytes());
		ByteArrayOutputStream out =new ByteArrayOutputStream();
		//transform(in, out);
		transform(System.in, System.out);
		byte[] result = out.toByteArray();
		System.out.println(new String(result));
	}
	
	public static void transform(InputStream in,OutputStream out) 
	{
		try {
			
			int ch = 0;
			while( (ch =in.read())!= -1)
			{
				int upChar = Character.toUpperCase((char)ch);
				out.write(upChar);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
