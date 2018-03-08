package com.swk.net.object;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectServer {
	
	public static void main(String[] args)
	{
		try
		{
			ServerSocket ss = new ServerSocket(8001);
			Socket s = ss.accept();
			OutputStream ops = s.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(ops);
			Student student = new Student(1, "vico", 20);
			oos.writeObject(student);
			oos.close();
			oos.close();
			s.close();
			ss.close();
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
