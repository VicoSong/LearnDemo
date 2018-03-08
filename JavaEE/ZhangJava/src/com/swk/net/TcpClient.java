package com.swk.net;

import java.awt.Scrollbar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.print.DocFlavor.READER;

public class TcpClient {
	public static void main(String[] args)
	{
		if (args.length<2)
		{
			System.out.println("Usage : java TcpClient ServerIP ServerPort\n");
			return ;
		}
		
		try
		{
			Socket s =new Socket(args[0],Integer.parseInt(args[1]));
			InputStream ips = s.getInputStream();
			OutputStream ops = s.getOutputStream();
			BufferedReader br =new BufferedReader(new InputStreamReader(ips));
			PrintWriter pw =new PrintWriter(ops,true);
			BufferedReader keyBoardBr = new BufferedReader(new InputStreamReader(System.in));
			while (true)
			{
				String readStr = keyBoardBr.readLine();
				pw.println(readStr);
				if (readStr.equalsIgnoreCase("quit"))
				{
					break;
				}
				System.out.println(br.readLine());
				
			}
			
			br.close();
			pw.close();
			keyBoardBr.close();
			s.close();
			
			
			
		} catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
