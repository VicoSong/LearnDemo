package com.swk.listenerfour;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class HttpSessionActivationListenerTest implements HttpSessionActivationListener {

	/*
	 * sessionDidActivate(HttpSessionEvent arg0)
	 * 	*��Session�ʱ������
	 * */
	public void sessionDidActivate(HttpSessionEvent arg0) {
			System.out.println("Session���");
	}

	/*
	 * sessionWillPassivate(HttpSessionEvent arg0)
	 * 	*��Session�ۻ�ʱ������
	 * */
	public void sessionWillPassivate(HttpSessionEvent arg0) {
			System.out.println("Session���ۻ�");
	}

}
