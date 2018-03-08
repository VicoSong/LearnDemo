package com.swk.io;

import java.io.IOException;
import java.io.PipedInputStream;

public class PipedIoReceiver extends Thread{
	
	private PipedInputStream in = new PipedInputStream();
	
	public PipedInputStream getInStream()
	{
		return in ;
	}
	
	public void run()
	{
		
		byte[] buf =new byte[1024];
		try {
			int len =in.read(buf);
			System.out.println("revceived msg :"+new String(buf,0,len));
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
