package com.swk.crawler.demo1.test;

import java.util.List;

import org.junit.Test;

import com.swk.crawler.demo1.bean.LinkTypeData;
import com.swk.crawler.demo1.core.ExtractService;
import com.swk.crawler.demo1.rule.Rule;

public class crawlerTest {
    @Test
    public void getDatasByClass()
    {
	Rule rule=new Rule();
	rule.setUrlString("https://kyfw.12306.cn/otn/leftTicket/init");
	String[] params={"title","target"};
	String[] values={"菜鸟","_blank"};
	rule.setParamsArray(params);
	rule.setValuesArray(values);
	rule.setResultTagName("row");
	rule.setType(Rule.CLASS);
	rule.setRequestMethod(Rule.POST);
	List<LinkTypeData> extracts=ExtractService.extract(rule);
	writeToFile(extracts);
	
    }
    @Test
    public void getDatasByCssQuery()
    {
	
    }
    @Test
    public void getDatasByCssQueryBaiduNews()
    {
	
    }
    
    public void writeToFile(List<LinkTypeData> linkTypeDatas)
    {
	for (LinkTypeData linkTypeData: linkTypeDatas) 
	{
	    System.out.println(linkTypeData.getLinkTitle());
	    System.out.println(linkTypeData.getLinkHref());
	    System.out.println("****************************");
	}
    }
}
