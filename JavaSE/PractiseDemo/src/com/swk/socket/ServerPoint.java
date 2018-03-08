package com.swk.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



/**
 * description:服务器端 socket
 * @author Vico
 *
 */
public class ServerPoint {
	
	public static void main(String[] args) {
		try{
			ServerSocket ss=new ServerSocket(8998);
			Socket s=ss.accept();
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			String msg=br.readLine();
			System.out.println("client send:"+msg);
			
			//回复客户端消息
			OutputStreamWriter osw=new OutputStreamWriter(s.getOutputStream() );
			BufferedWriter bw=new BufferedWriter(osw);
			PrintWriter pw=new PrintWriter(bw);
			pw.flush();
			pw.println("I'am  server  i got your message"+msg);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
