package com.swk.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * �Զ���һ��������ʵ��Filter�ӿڲ���д�ýӿ��е����з���
 *
 * @author Vico
 *
 */
public class MyFilter implements Filter{

	/*
	 * init(FilterConfig config)����
	 * 	*���ã����ڹ������ĳ�ʼ��
	 * 
	 * */
	public void init(FilterConfig config) throws ServletException {
		System.out.println("This is init method of MyFilter");
		
	}

	/*
	 * doFilter(ServletRequest request, ServletResponse response, FilterChain chain)����
	 * 	*���ã�����ִ�й���
	 * 
	 * */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("This is doFilter method of MyFilter");
		
	}

	
	
    /*
	 * destroy()����
	 * 	*���ã����ڹ�����������
	 * 
	 * */
	
	public void destroy() {
		System.out.println("This is destroy method of MyFilter");
		
	}
}
