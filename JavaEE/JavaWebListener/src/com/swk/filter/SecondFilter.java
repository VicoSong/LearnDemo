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
        System.out.println("�ڶ�������������ʼ��������");
    }

    /**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		System.out.println("���ǵڶ����������ĳ�ʼ������������");
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
		System.out.println("���ǹ��˷���������");
		chain.doFilter(request, response);
	}

	
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("���ǵڶ��������������ٷ�����������");
	}


}
