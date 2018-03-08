package com.swk.struts.interceptor;

import org.omg.PortableInterceptor.SUCCESSFUL;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/** 
* @ClassName: InterceptorDemo 
* @Description: demo user-defined interceptor 
* @author:Vico 
* @date 2016-3-15 下午7:17:19 
*  
*/
public class InterceptorDemo extends AbstractInterceptor{
    //应用加载时就完成了初始化
    @Override
    public void init() {
	System.out.println("This is inital method!");
	
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
	//gain current action class
	Object object=invocation.getAction();
	String actionName=object.getClass().getName();
	System.out.println("current action name is :"+actionName);
	
	System.out.println("before execute intercept action!");
	String rtValue=invocation.invoke(); //放行
	System.out.println("after execute intercept action!");
	return rtValue; 
    }

}
