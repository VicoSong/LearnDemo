package com.swk.listenerone;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * ���ڲ���HttpSessionListener������
 *	*ʵ��HttpSession�ӿ�
 *	*��д�ӿ��ṩ�ķ���
 * @author Vico
 *
 */
public class HttpSessionListenerTest implements HttpSessionListener,ServletContextListener,ServletRequestListener{

	/*
	 *sessionCreated(HttpSessionEvent arg0)
	 *	*���ڼ���Session����Ĵ���
	 *	*����ʱ�䣺Session���󴴽�֮��
	 *	*���ã�����ʵ�ֱ�Ҫ�ĳ�ʼ������
	 * */
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Session���󱻴����ˡ�������������");
		/*
		 * HttpSessionEvent�¼�����
		 * 	*��ȡ��Ӧ��Request����
		 * 	*��ȡ��Ӧ��ServletContext����
		 * **/
	}

	/*
	 * sessionDestroyed(HttpSessionEvent arg0)
	 * 	*���ڼ���Session���������
	 * 	*����ʱ�䣺Session��������֮ǰ
	 * 	*���ã�����ʵ�ֵı�Ҫ����Դ�ͷŹ���
	 * */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("Session���������ˡ�������������");
		
	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
