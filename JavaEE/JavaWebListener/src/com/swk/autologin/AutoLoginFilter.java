package com.swk.autologin;

import java.io.IOException;
import java.net.CookieStore;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutoLoginFilter implements Filter{

	
	public void destroy() {// TODO Auto-generated method stub
		
	}

	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)resp;
		
		Cookie[] cookies=request.getCookies();
		if(cookies!=null)
		{
			for(Cookie cookie:cookies)
			{
				if(cookie != null)
				{
					String name=cookie.getName();
					if("user".equals(name))
					{
						String value=cookie.getValue();
						String username=value.split("#")[0];
						String password=value.split("#")[1];
						request.getSession().setAttribute("username", username);
						chain.doFilter(request,response);
					}
				}
			}
		}else{
			//cookies is null indicate user hasn't login then jump to login interface
		}
		
	}

	
	public void init(FilterConfig arg0) throws ServletException {
	
		
	}

}
