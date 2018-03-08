package com.swk.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import sun.util.BuddhistCalendar;

/**
 * Description: 客户端
 * @author Vico
 *
 */
public class ClientPoint {
	public static void main(String[] args) {
		try {
			Socket s=new Socket("172.0.0.1", 8998);
			OutputStreamWriter osw=new OutputStreamWriter(s.getOutputStream());
			BufferedWriter bw=new BufferedWriter(osw);
			
			PrintWriter pw=new PrintWriter(bw);
			pw.flush();
			pw.println("hello  world");
			//读取从服务器端返回的消息
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			String responseMsg=br.readLine();
			System.out.println("server return message is :"+responseMsg);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
