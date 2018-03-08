package com.swk.servlet.annotationreplaceconfigfile;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
/*
 * <filter>
 * 	<filter-name>name</filter-name>
 * 	<filter-class>class</filter-class>
 * 	<init-param>
 * 		<param-name>paramName</param-name>
 *		<param-value>paramValue<param-value> 
 * 	</init-param>
 * 	<load-on-startup>0-9</load-on-startup>
 * </filter>
 * <filter-mapping>
 * 	<filter-name>name</filter-name>
 * 	<url-pattern>/*</url-pattern>
 * </filter-mapping>
 * 
 * */
import javax.servlet.annotation.WebInitParam;
@WebFilter(
	urlPatterns={"/*"},
	initParams={@WebInitParam(name="swk",value="swk")},
	servletNames={"/test"},
	dispatcherTypes={DispatcherType.REQUEST,DispatcherType.FORWARD}
	)
public class FilterTest implements Filter{

    @Override
    public void destroy() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1,
	    FilterChain arg2) throws IOException, ServletException {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
	// TODO Auto-generated method stub
	
    }

}
