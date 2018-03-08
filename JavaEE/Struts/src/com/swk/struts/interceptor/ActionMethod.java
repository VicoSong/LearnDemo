package com.swk.struts.interceptor;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @ClassName: ActionMethod 
* @Description: Action method
* @author:Vico 
* @date 2016-3-15 下午7:48:23 
*  
*/
public class ActionMethod extends ActionSupport{

    @Override
    public String execute() throws Exception {
	System.out.println("Action method is executed!");
	return super.execute();
    }

}
