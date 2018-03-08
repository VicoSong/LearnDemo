package com.swk.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) 
	{
		
		ServerSocket ss;
		Socket s;
		try {
			
			ss = new ServerSocket(8001);
			s= ss.accept();
			InputStream inputStream = s.getInputStream();
			OutputStream outputStream = s.getOutputStream();
			outputStream.write("Hello i am a tcp server!".getBytes());
			/*byte[] buf=new byte[1024];
			int len = inputStream.read(buf);
			System.out.println(new String(buf,0,len));*/
			BufferedReader br =new BufferedReader(new InputStreamReader(inputStream));
			System.out.println(br.readLine());
			
		//	inputStream.close();
			br.close();
			outputStream.close();
			s.close();
			ss.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
