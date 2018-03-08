package com.swk.crawler.demo1.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import com.swk.crawler.demo1.rule.Rule;
import com.swk.crawler.demo1.utils.TextUtils;
import com.swk.crawler.demo1.bean.LinkTypeData;
import com.swk.crawler.demo1.exception.RuleException;
/** 
* @ClassName: ExtractService 
* @Description: core query class
* @author:Vico 
* @date 2016-3-27 下午5:35:49 
*  
*/
public class ExtractService {
    
    /** 
    * @Title: extract 
    * @Description: TODO
    * @param @param rule
    * @param @return   
    * @return List<LinkTypeData>  
    * @throws @param rule
    * @throws @return
    */
    public static List<LinkTypeData> extract(Rule rule)
    {
	//validate rule
	 validateRule(rule);
	 
	 List<LinkTypeData> datas=new ArrayList<LinkTypeData>();
	 LinkTypeData data=null;
	 
	 //prase rule
	 String urlString=rule.getUrlString();
	 String[] paramsArray=rule.getParamsArray();
	 String[] valusArray=rule.getValuesArray();
	 String resultTagName=rule.getResultTagName();
	 int type=rule.getType();
	 int resultType=rule.getRequestMethod();
	try{ 
        	 Connection conn=Jsoup.connect(urlString);
        	 if (paramsArray!=null) 
        	 {
        	     for (int i = 0; i < paramsArray.length; i++) {
        		conn.data(paramsArray[i],valusArray[i]);
        	    }
        	}
        	 
        	 //set request type
        	 Document document=null;
        	 switch(resultType)
        	 {
        	 	case Rule.GET:
        	 	    document=conn.timeout(10000).get();
        	 	    break;
        	 	case Rule.POST:
        	 	    document=conn.timeout(10000).post();
        	 	    break;
        	 }
        	 
        	 //deal return data
        	 Elements results = new Elements();
        	 switch(type)
        	 {
        	 	case Rule.CLASS:
        	 	    results=document.getElementsByClass(resultTagName);
        	 	    break;
        	 	case Rule.ID:
        	 	    Element result=document.getElementById(resultTagName);
        	 	    break;
        	 	case Rule.SELECTION:
        	 	    results=document.select(resultTagName);
        	 	    break;
        	 	default:
        	 	    //if resultTagName is null ,exclude include tag
        	 	    if(TextUtils.isEmpty(resultTagName))
        	 	    {
        	 		results=document.getElementsByTag("body");
        	 	    }
        	 	}
        	 	
        	 	for(Element result:results)
        	 	{
        	 	    Elements links=result.getElementsByTag("a");
        	 	    
        	 	    for (Element link:links) {
        			String linkHref=link.attr("href");
        			String linkHead=link.text();
        			
        			data=new LinkTypeData();
        			data.setLinkHref(linkHref);
        			data.setLinkTitle(linkHead);
        			
        			datas.add(data);
        	 	    }
        	 	}
        	 	
		}catch(Exception e)
		{
		    e.printStackTrace();
		}
	 	return datas;    
	 }
	 
    
    private static void  validateRule(Rule rule)
    {
	String url=rule.getUrlString();
	if (TextUtils.isEmpty(url)) {
	    throw new RuleException("URL cann't be null");
	}
	if (!url.startsWith("http://")) {
	    throw new RuleException("URL format uncorrrect,which must start with http/https: ");
	}
	if(rule.getParamsArray()!=null&&rule.getValuesArray()!=null)
	{
	    if (rule.getParamsArray().length!=rule.getValuesArray().length) {
		throw new RuleException("param key and value is not match!");
	    }
	}
    }
    
    
   
}
