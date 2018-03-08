package com.swk.net.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Servicer implements Runnable {

	private Socket s =null;
	public  Servicer(Socket s)
	{
		// TODO Auto-generated constructor stub
		this.s=s;
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		while(true)
		{
			
			try
			{
				InputStream inputStream = s.getInputStream();
				OutputStream outputStream = s.getOutputStream();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				PrintWriter pw = new PrintWriter(outputStream);
				while (true)
				{
					String readLine = bufferedReader.readLine();
					String echoStr =(new StringBuffer(readLine).reverse()).toString();
					if (readLine.equalsIgnoreCase("quit"))
					{
						break;
					}
					pw.println("orginal String:"+readLine+"--> reverse String:"+echoStr+"\n");
					pw.flush();
				}
				
				bufferedReader.close();
				pw.close();
				s.close();
				
				
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
