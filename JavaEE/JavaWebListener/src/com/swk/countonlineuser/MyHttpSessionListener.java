package com.swk.countonlineuser;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	/*
	 * ����Session��ʾ��������һ��
	 * 	*�ڸ÷����л�ȡServletContext����
	 * 	*�޸�ServletContext�����sum������ֵ��+1��
	 * 	*���޸ĺ��sum����ֵ�����·Ż�
	 * */
	public void sessionCreated(HttpSessionEvent hce) {
		HttpSession session=hce.getSession();
		ServletContext context=session.getServletContext();
		int sum=(int)context.getAttribute("sum");
		sum=sum+1;
		context.setAttribute("sum", sum);

	}

	/*
	 * ����Session��ʾ��������һ��
	 * 	*�ڸ÷����л�ȡServletContext����
	 * 	*�޸�ServletContext�����sum������ֵ��-1��
	 * 	*���޸ĺ��sum����ֵ�����·Ż�
	 * */
	public void sessionDestroyed(HttpSessionEvent se) 
	{
		HttpSession session=se.getSession();
		ServletContext context=session.getServletContext();
		int sum=(Integer)context.getAttribute("sum");
		sum=sum-1;
		 context.setAttribute("sum", sum);
	}

}
