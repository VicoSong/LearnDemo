package com.swk.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 自定义一个过滤器实现Filter接口并重写该接口中的所有方法
 *
 * @author Vico
 *
 */
public class MyFilter implements Filter{

	/*
	 * init(FilterConfig config)方法
	 * 	*作用：用于过滤器的初始化
	 * 
	 * */
	public void init(FilterConfig config) throws ServletException {
		System.out.println("This is init method of MyFilter");
		
	}

	/*
	 * doFilter(ServletRequest request, ServletResponse response, FilterChain chain)方法
	 * 	*作用：用于执行过滤
	 * 
	 * */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("This is doFilter method of MyFilter");
		
	}

	
	
    /*
	 * destroy()方法
	 * 	*作用：用于过滤器的销毁
	 * 
	 * */
	
	public void destroy() {
		System.out.println("This is destroy method of MyFilter");
		
	}
}
