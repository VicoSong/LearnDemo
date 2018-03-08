package com.swk.net.object;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectClient {
	
	public static void main(String[] args)
	{
		try
		{
			Socket s =new Socket("127.0.0.1", 8001);
			InputStream ips = s.getInputStream();
			ObjectInputStream ois =new ObjectInputStream(ips);
			Student stu =(Student)ois.readObject();
			System.out.println(stu.toString());
			ois.close();
			s.close();
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
