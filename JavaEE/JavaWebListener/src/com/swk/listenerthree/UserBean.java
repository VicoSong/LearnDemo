package com.swk.listenerthree;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * ����һ��user��JavaBean
 * 	*����JavaBean�󶨵�Session��
 * 	*��Beanʵ��HttpSessionBindingListener
 * @author Vico
 *	*���⣺
 *		*��JavaBeanʵ����HttpSessionBindingListener����Ⱦ�˵�ǰ��JavaBean
 *			*�������ṩ�˲�����JavaBean�ķ�����JavaBean����һ��Java����JavaEE�޹أ�
 *			*һ��ʵ��HttpSessionBingdingListener����JavaEE�й�
 *		*���飺������ʹ��
 */
public class UserBean implements HttpSessionBindingListener{
	private int id;
	private String name;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/*
	 * valueBound(HttpSessionBindingEvent arg0)
	 * 	*�÷������ڼ�����ǰJavabean���󶨵�Session
	 * 	*ִ��session.setAttribute()����ʱ���ǰ�
	 */
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("This JavaBean is Binded");
	}

	/*
	 * valueBound(HttpSessionBindingEvent arg0)
	 * 	*�÷������ڼ�����ǰJavabean��Session�н��
	 * 	*ִ��session.removeAttribute()�������ǽ��
	 */
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("This JavaBean is unBinded");
		
	}
	
}
