package com.swk.net.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetResources {
	public static void main(String[] args)
	{
		System.out.println("Japanese page:\n");
		getContentByContry("ja");
		System.out.println("zh-ch");
	}
	
	public static void getContentByContry(String contry)
	{
		URL url = null;
		HttpURLConnection conn = null;
		try
		{
			url = new URL("https://www.baidu.com/");
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestProperty("Accept-language",contry);
			
			
			Map<String, List<String>> rpMap = conn.getRequestProperties();
			Set<String> rpSet = rpMap.keySet();
			Iterator<String> iterator = rpSet.iterator();
			while (iterator.hasNext())
			{
				String field = iterator.next();
				System.out.println("field : "+field+",\t value :"+conn.getRequestProperty(field));
			}
			
			conn.connect();
			
			Map<String, List<String>> respMap = conn.getHeaderFields();
			Set<String> respSet = respMap.keySet();
			Iterator<String> it = respSet.iterator();
			while (it.hasNext())
			{
				String field = iterator.next();
				System.out.println("field : "+field+",\t value :"+conn.getHeaderField(field));
			}
			
			
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String readLine = null;
			while ((readLine=br.readLine())!=null)
			{
				System.out.println(readLine);
			}
			
			br.close();
			conn.disconnect();
			
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
