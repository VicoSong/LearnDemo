package com.swk.crawler.demo1.exception;

/** 
* @ClassName: RuleException 
* @Description: 异常类
* @author:Vico 
* @date 2016-3-27 下午6:07:46 
*  
*/
public class RuleException extends RuntimeException{

    public RuleException() {
	super();
	// TODO Auto-generated constructor stub
    }

    public RuleException(String message, Throwable cause,
	    boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
	// TODO Auto-generated constructor stub
    }

    public RuleException(String message, Throwable cause) {
	super(message, cause);
	// TODO Auto-generated constructor stub
    }

    public RuleException(String message) {
	super(message);
	// TODO Auto-generated constructor stub
    }

    public RuleException(Throwable cause) {
	super(cause);
	// TODO Auto-generated constructor stub
    }
    
}
