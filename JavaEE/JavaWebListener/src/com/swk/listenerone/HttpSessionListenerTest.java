package com.swk.listenerone;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 用于测试HttpSessionListener监听器
 *	*实现HttpSession接口
 *	*重写接口提供的方法
 * @author Vico
 *
 */
public class HttpSessionListenerTest implements HttpSessionListener,ServletContextListener,ServletRequestListener{

	/*
	 *sessionCreated(HttpSessionEvent arg0)
	 *	*用于监听Session对象的创建
	 *	*调用时间：Session对象创建之后
	 *	*作用：可以实现必要的初始化工作
	 * */
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Session对象被创建了。。。。。。。");
		/*
		 * HttpSessionEvent事件对象
		 * 	*获取对应的Request对象
		 * 	*获取对应的ServletContext对象
		 * **/
	}

	/*
	 * sessionDestroyed(HttpSessionEvent arg0)
	 * 	*用于监听Session对象的销毁
	 * 	*调用时间：Session对象销毁之前
	 * 	*作用：可以实现的必要的资源释放工作
	 * */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("Session对象被销毁了。。。。。。。");
		
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
