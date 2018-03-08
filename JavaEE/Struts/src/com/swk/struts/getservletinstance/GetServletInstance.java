package com.swk.struts.getservletinstance;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Description:演示servlet有关实例的获取，方式一，通过ServletActionContext.getXXX()
 * @author Vico
 *
 */
public class GetServletInstance extends ActionSupport {
    public String execute()
    {
	/*
	*获取Servlet相关类：
	*1.ServletActionContext.getPageContext()
	 *2.ServletActionContext.getRequest()
	 *3.ServletActionContext.getResponse()
	 *4.ServletActionContext.getServletContext()
	*/
	System.out.println(ServletActionContext.getPageContext());
	System.out.println(ServletActionContext.getRequest());
	System.out.println(ServletActionContext.getResponse());
	System.out.println(ServletActionContext.getServletContext());
	
	return SUCCESS;
    }
    
    
}
