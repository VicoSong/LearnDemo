package com.swk.countonlineuser;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener{

	/*
	 *�����������ͳ�Ƶĳ�ʼ������
	 * 
	 **/
	public void contextInitialized(ServletContextEvent sce)
	{
		ServletContext context=sce.getServletContext();
		context.setAttribute("sum", 0);
		
	}
	public void contextDestroyed(ServletContextEvent sce) 
	{
			
	}

	

}
