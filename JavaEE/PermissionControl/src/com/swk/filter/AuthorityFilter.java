package com.swk.filter;

import java.io.IOException;
import java.net.URL;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swk.bean.User;

/**
 * Servlet Filter implementation class AuthorityFilter
 */

public class AuthorityFilter implements Filter {

    
    public AuthorityFilter() {
        
    }
    
    public void init(FilterConfig fConfig) throws ServletException {
		
	}
	
	

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)resp;
		//1.获取用户信息
		User user=(User)request.getSession().getAttribute("user");	
		String userRole=user.getRole(); 
		//2.获取请求地址连接信息
		String url=request.getParameter("url");
		String path=request.getContextPath();
		url=url.substring(0,url.lastIndexOf("/"));
		if(url.contains(path))
		{
			url=url.substring(url.indexOf(path));
		}
		
		//3.进行匹配
		if(userRole.equals("普通用户"))
		{
			if(!url.equals("user"))
			{
				request.setAttribute("error_msg","Sorry don't hava the right");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
				/*response.sendRedirect("/PermissionControl/error.jsp");*/
				
			}
			
		}
		
		chain.doFilter(request, response);
	}

	public void destroy() {
		
	}

}
