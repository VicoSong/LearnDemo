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
	 * Filter的构造函数
	 * 	*执行时机：在Tomcat服务器启动时
	 * 	*在Filter的生命周期中只执行一次
	 * 		*Filter与servlet一样都是单例多线程（线程安全问题）
	 * */
	public MyFilter() {
		System.out.println("这是MyFilter的构造函数");
	}

	/*
	 * init(FilterConfig config)方法
	 * 	*作用：用于过滤器的初始化
	 * 	*执行时机：在Tomcat服务器启动时
	 * 	*在Filter的生命周期中只执行一次
	 * */
	public void init(FilterConfig config) throws ServletException {
		System.out.println("This is init method of MyFilter");
		
	}

	/*
	 * doFilter(ServletRequest request, ServletResponse response, FilterChain chain)方法
	 * 	*作用：用于执行过滤
	 * 	*执行时机:客户端访问当前Filter拦截的资源路径时
	 * 	*在Filter的生命周期中，每拦截一次执行一次  
	 * */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("This is doFilter method of MyFilter");
		
		//过滤器放行
		chain.doFilter(request,response);
		
	}

	
	
    /*
	 * destroy()方法
	 * 	*作用：用于过滤器的销 毁
	 * 	*执行时机：在Tomcat服务器关闭的时候
	 * 	**在Filter的生命周期中只执行一次
	 * */
	
	public void destroy() {
		System.out.println("This is destroy method of MyFilter");
		
	}
}
