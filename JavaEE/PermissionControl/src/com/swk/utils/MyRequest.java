package com.swk.utils;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
/**
 * 自定义的Request对象
 * @author SWK
 */
public class MyRequest extends HttpServletRequestWrapper {

	public MyRequest(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		if(super.getMethod().equalsIgnoreCase("GET")){
			try {
				value = new String(value.getBytes("ISO-8859-1"),"utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return value;
	}

}
