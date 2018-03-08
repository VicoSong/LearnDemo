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
	 * Filter�Ĺ��캯��
	 * 	*ִ��ʱ������Tomcat����������ʱ
	 * 	*��Filter������������ִֻ��һ��
	 * 		*Filter��servletһ�����ǵ������̣߳��̰߳�ȫ���⣩
	 * */
	public MyFilter() {
		System.out.println("����MyFilter�Ĺ��캯��");
	}

	/*
	 * init(FilterConfig config)����
	 * 	*���ã����ڹ������ĳ�ʼ��
	 * 	*ִ��ʱ������Tomcat����������ʱ
	 * 	*��Filter������������ִֻ��һ��
	 * */
	public void init(FilterConfig config) throws ServletException {
		System.out.println("This is init method of MyFilter");
		
	}

	/*
	 * doFilter(ServletRequest request, ServletResponse response, FilterChain chain)����
	 * 	*���ã�����ִ�й���
	 * 	*ִ��ʱ��:�ͻ��˷��ʵ�ǰFilter���ص���Դ·��ʱ
	 * 	*��Filter�����������У�ÿ����һ��ִ��һ��  
	 * */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("This is doFilter method of MyFilter");
		
		//����������
		chain.doFilter(request,response);
		
	}

	
	
    /*
	 * destroy()����
	 * 	*���ã����ڹ��������� ��
	 * 	*ִ��ʱ������Tomcat�������رյ�ʱ��
	 * 	**��Filter������������ִֻ��һ��
	 * */
	
	public void destroy() {
		System.out.println("This is destroy method of MyFilter");
		
	}
}
