package com.swk.marketplace.services;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.swk.marketplace.listener.IsOnlineListener;

public class CheckUser {
    private static IsOnlineListener isOnlineListener=new IsOnlineListener();
    public static boolean check(String id,HttpServletRequest request)
    {
	boolean flag=true;
	isOnlineListener.setId(id);
	Vector<String> vector=isOnlineListener.getVector();
	 HttpSession session=request.getSession();
	if(vector.contains(id))
	{
	    session.removeAttribute("addLogoutUser");
	    flag=false;
	}else {
	   session.setAttribute("addLogoutUser", isOnlineListener); 
	   flag=true;
	}
	return flag;
    }
}
