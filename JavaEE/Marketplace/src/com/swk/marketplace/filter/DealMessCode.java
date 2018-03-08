package com.swk.marketplace.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swk.marketplace.utils.MyRequest;


/**
 * Description:此filter用于解决全站中文乱码
 * @author Vico
 *
 */
public class DealMessCode implements Filter{

	
	public void init(FilterConfig arg0) throws ServletException {
		
	}

	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		//1.进行Request与Response对象的类型强转
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		//2.解决中文乱码问题:1)请求的中文乱码(GET\POST);2)响应的中文乱码.
		request.setCharacterEncoding("UTF-8");//解决post()请求方式的中文乱码
		response.setContentType("text/html;charset=utf-8");
		//3.创建自定义的Request对象
		MyRequest myRequest=new MyRequest(request);
		
		//4.放行
		chain.doFilter(myRequest,response);
	}

	
	
	public void destroy() {
		
		
	}
	
}
