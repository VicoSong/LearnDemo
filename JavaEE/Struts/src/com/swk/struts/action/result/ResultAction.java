package com.swk.struts.action.result;

import com.opensymphony.xwork2.ActionSupport;



/**
 * 演示结果集
 * @author Vico
 *
 */
public class ResultAction extends ActionSupport {
    public String save()
    {
	try {
	    int result=10/0;
	    return SUCCESS;
	} catch (Exception e) {
	   return ERROR;
	}
	
    }
}
