package com.swk.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {

	public static void main(String[] args) throws IOException 
	{
		PipedIoSender sender = new PipedIoSender();
		PipedIoReceiver receiver = new PipedIoReceiver();
		PipedOutputStream out = sender.getOutStream();
		PipedInputStream in =receiver.getInStream();
		out.connect(in);
		sender.start();
		receiver.start();
		
	}
	
}
