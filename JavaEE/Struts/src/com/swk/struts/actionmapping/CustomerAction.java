package com.swk.struts.actionmapping;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @ClassName: CustomerAction 
* @Description: 用户动作类
* @author:Vico 
* @date 2016-3-26 下午11:32:31 
*  
*/
public class CustomerAction extends ActionSupport {
    public String addCustomer() {
	//调用对应的Service类
	System.out.print("This is addCustomer!");
	return SUCCESS;
    }
    
    public String updateCustomer() {
   	//调用对应的Service类
	System.out.print("This is updateCustomer!");
   	return SUCCESS;
       }
    
    public String delCustomer() {
   	//调用对应的Service类
	System.out.print("This is delCustomer!");
   	return SUCCESS;
       }
    public String findCustomer() {
   	//调用对应的Service类
	System.out.print("This is findCustomer!");
   	return SUCCESS;
       }
}
