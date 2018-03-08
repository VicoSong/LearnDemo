package com.swk.servlet.annotationreplaceconfigfile;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/*
 * <listern>
 * 	<listern-class></listern-class>
 * </listern>
 */
@WebListener
public class ListernTest implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
	// TODO Auto-generated method stub

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
	// TODO Auto-generated method stub

    }

}
