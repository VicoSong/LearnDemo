package com.swk.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class SecondFilter
 */

public class SecondFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SecondFilter() {
        System.out.println("第二个过滤器被初始化。。。");
    }

    /**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		System.out.println("这是第二个过滤器的初始化方法。。。");
		Enumeration<String> eum=config.getInitParameterNames();
		while(eum.hasMoreElements())
		{
			String name=eum.nextElement();
			String value=config.getInitParameter(name);
			System.out.println(name+":"+value);
		}
		
		
	}
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("这是过滤方法。。。");
		chain.doFilter(request, response);
	}

	
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("这是第二个过滤器的销毁方法。。。。");
	}


}
