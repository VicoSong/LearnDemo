package com.swk.servlet.annotationreplaceconfigfile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;


/*
 * <servlet>
 * 	<servlet-name>name</servlet-name>
 * 	<servlet-class>class</servlet-class>
 * 	<init-param>
 * 		<param-name>paramName</param-name>
 *		<param-value>paramValue<param-value> 
 * 	</init-param>
 * 	<load-on-startup>0-9</load-on-startup>
 * </servlet>
 * <servlet-mapping>
 * 	<servlet-name>name</servlet-name>
 * 	<url-pattern>/*</url-pattern>
 * </servlet-mapping>
 * 
 * */
@WebServlet(
	name="AnnotationReplaceConfigFile",
	urlPatterns={"/test","/atest"},
	initParams={@WebInitParam(name="vico",value="swk")},
	loadOnStartup=0
	)
public class ServletTest extends HttpServlet {

    public ServletTest() 
    {
	super();
    }
    
   
   public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
   {
      PrintWriter printWriter=response.getWriter();
      printWriter.print("这是在测试注解代替配置文件");
	    
   }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {

	doPost(request, response);
    }
    
    public void destroy() 
    {
   	super.destroy(); 
     }
}
