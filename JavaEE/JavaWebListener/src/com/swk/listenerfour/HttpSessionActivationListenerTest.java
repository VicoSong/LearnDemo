package com.swk.listenerfour;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class HttpSessionActivationListenerTest implements HttpSessionActivationListener {

	/*
	 * sessionDidActivate(HttpSessionEvent arg0)
	 * 	*当Session活化时被调用
	 * */
	public void sessionDidActivate(HttpSessionEvent arg0) {
			System.out.println("Session被活化");
	}

	/*
	 * sessionWillPassivate(HttpSessionEvent arg0)
	 * 	*当Session钝化时被调用
	 * */
	public void sessionWillPassivate(HttpSessionEvent arg0) {
			System.out.println("Session被钝化");
	}

}
