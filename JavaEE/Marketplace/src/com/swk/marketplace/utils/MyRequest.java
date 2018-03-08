package com.swk.marketplace.utils;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * 自定义request方法
 * @author Vico
 *
 */
public class MyRequest extends HttpServletRequestWrapper{

	public MyRequest(HttpServletRequest request) {
		super(request);	
	}

	@Override
	public String getParameter(String name) {
		String value=super.getParameter(name);
		if(super.getMethod().equals("GET"))
		{
			try {
				value=new String(value.getBytes("utf-8"),"utf-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return value;
	}
	
	
	

}
