package com.swk.utils;

import javax.servlet.http.Cookie;

/**
 * Description:主要用于判断给定的信息在cookie中是否存在
 * @author Vico
 *
 */
public class CookieUtils {
    public static Cookie getCookie(Cookie[] cookies,String name)
    {
	if(cookies!= null)
	{
	   for (Cookie cookie : cookies) 
	   {
	       if(cookie!=null)
	       {
		  String cookieName=cookie.getName();
		  if(cookieName.equals(name))
		  {
		      return cookie;
		  }else{
		      return null;
		  }
	       }else {
		return null;
	    }
	   }
	}
	
	return null;
    }
}
