package com.swk.io;

import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedIoSender  extends Thread{

	private PipedOutputStream out = new PipedOutputStream();
	
	public PipedOutputStream getOutStream()
	{
		return out ;
	}
	
	public void run()
	{
		String info =new String("hello receiver!");
		try {
			out.write(info.getBytes());
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
