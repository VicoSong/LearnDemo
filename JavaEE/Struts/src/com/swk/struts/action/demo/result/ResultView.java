package com.swk.struts.action.demo.result;

import com.opensymphony.xwork2.ActionSupport;

public class ResultView extends ActionSupport{
    
    public String save()
    {
	try{
	    
	    return SUCCESS;
	}catch (Exception e) {
	    e.printStackTrace();
	    return ERROR;
	}
    }
}
