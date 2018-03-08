package com.swk.listenerfour;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;


public class UserBean implements HttpSessionActivationListener,Serializable{
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
	 * sessionDidActivate(HttpSessionEvent arg0)
	 * 	*当Session被活化时调用
	 * */
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("Seesion被活化");
		
	}

	/*
	 * sessionWillPassivate(HttpSessionEvent arg0)
	 * 	*当Session被钝化时调用
	 * **/
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("Session被钝化");
		
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
