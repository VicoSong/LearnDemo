package com.swk.crawler.demo1.utils;

/** 
* @ClassName: TextUtils 
* @Description: 文本工具类
* @author:Vico 
* @date 2016-3-27 下午5:42:09 
*  
*/
public class TextUtils {
    public static boolean isEmpty(String str)
    {
	if (null!=str&&str.trim().length()>0) {
	    return false;
	}else {
	    return true;
	}
    }
}
