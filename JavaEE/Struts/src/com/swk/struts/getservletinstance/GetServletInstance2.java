package com.swk.struts.getservletinstance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Description:通过注入方式获取Servlet相关实例
 * @author Vico
 *
 */
public class GetServletInstance2 extends ActionSupport implements ServletRequestAware,ServletResponseAware{
    private HttpServletRequest request;
    private HttpServletResponse response;
    public String execute()
    {
	System.out.println(request.toString());
	System.out.println(response.toString());
	return SUCCESS;
    }
    
    @Override
    public void setServletRequest(HttpServletRequest request) {
	
	this.request=request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
	this.response=response;
	
    }

}
