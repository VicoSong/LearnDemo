package com.swk.listenerthree;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 定义一个user的JavaBean
 * 	*将该JavaBean绑定到Session中
 * 	*该Bean实现HttpSessionBindingListener
 * @author Vico
 *	*问题：
 *		*当JavaBean实现了HttpSessionBindingListener会污染了当前的JavaBean
 *			*监听器提供了不属于JavaBean的方法，JavaBean就是一个Java类与JavaEE无关，
 *			*一旦实现HttpSessionBingdingListener就与JavaEE有关
 *		*建议：不建议使用
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
	 * 	*该方法用于监听当前Javabean被绑定到Session
	 * 	*执行session.setAttribute()方法时就是绑定
	 */
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("This JavaBean is Binded");
	}

	/*
	 * valueBound(HttpSessionBindingEvent arg0)
	 * 	*该方法用于监听当前Javabean从Session中解绑
	 * 	*执行session.removeAttribute()方法就是解绑
	 */
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("This JavaBean is unBinded");
		
	}
	
}
