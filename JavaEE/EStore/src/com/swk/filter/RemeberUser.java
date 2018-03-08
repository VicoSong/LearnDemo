package com.swk.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swk.bean.User;
import com.swk.utils.CookieUtils;

/**
 * Description:该Filter主要用于过滤登录界面，从cookie中取出用户信息
 * @author Vico
 *
 */
public class RemeberUser implements Filter{

    @Override
    public void destroy() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
	    FilterChain chain) throws IOException, ServletException {
	// 1.类型转换
	HttpServletRequest request=(HttpServletRequest) req;
	HttpServletResponse response=(HttpServletResponse) resp;
	
	//2.读取cookie值
	Cookie[]  cookies=request.getCookies();
	Cookie cookie=CookieUtils.getCookie(cookies, "user");
	if(cookie!=null)
	{
	    String value=cookie.getValue();
	    String nickName=value.split("#")[0];
	    String password=value.split("#")[1];
	    
	    User user=new User();
	    user.setNickname(nickName);
	    user.setPassword(password);
	    request.setAttribute("user", user);
	}
	    
	 doFilter(request, response, chain);
	
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
	
	
    }

}
