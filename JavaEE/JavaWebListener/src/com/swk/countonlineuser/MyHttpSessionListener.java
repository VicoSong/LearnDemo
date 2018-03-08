package com.swk.countonlineuser;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	/*
	 * 创建Session表示人数增加一个
	 * 	*在该方法中获取ServletContext对象
	 * 	*修改ServletContext对象的sum的属性值（+1）
	 * 	*将修改后的sum属性值，重新放回
	 * */
	public void sessionCreated(HttpSessionEvent hce) {
		HttpSession session=hce.getSession();
		ServletContext context=session.getServletContext();
		int sum=(int)context.getAttribute("sum");
		sum=sum+1;
		context.setAttribute("sum", sum);

	}

	/*
	 * 销毁Session表示人数减少一个
	 * 	*在该方法中获取ServletContext对象
	 * 	*修改ServletContext对象的sum的属性值（-1）
	 * 	*将修改后的sum属性值，重新放回
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
