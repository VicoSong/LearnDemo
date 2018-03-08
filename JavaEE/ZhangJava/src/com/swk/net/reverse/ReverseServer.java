package com.swk.net.reverse;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer {
	
	public static void main(String[] args) {
		
		ServerSocket  ss =null;
		try {
			
			if (args.length<1)
			{
				ss = new ServerSocket(8001);
			}else
			{
				ss =new ServerSocket(Integer.parseInt(args[0]));
			}
			 
			boolean isRun =true;
			while(isRun)
			{
				Socket s = ss.accept();
				new Thread(new Servicer(s)).start();
			}
			ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
