package com.swk.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class TestInout implements  Runnable {
	private Process p=null;
	public TestInout() 
	{
		try {
			p=Runtime.getRuntime().exec("java MyClass");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(this).start();
	}
	
	public static void main(String[] args) 
	{
		TestInout tio = new TestInout();
		tio.send();
		
	}

	public void send()
	{
		OutputStream ops =  p.getOutputStream();
		try{
			
			while(true)
			{
				ops.write("help\r\n".getBytes());
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		try {
			
			InputStream ips = p.getInputStream();
			BufferedReader br =new BufferedReader(new InputStreamReader(ips));
			while (true) 
			{
				System.out.println(br.readLine());
			}
			
			
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
