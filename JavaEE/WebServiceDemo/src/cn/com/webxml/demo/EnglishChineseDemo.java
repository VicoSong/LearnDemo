package cn.com.webxml.demo;

import java.util.List;

import org.junit.Test;
import cn.com.webxml.*;
/** 
* @ClassName: EnglishChineseDemo 
* @Description: 演示调用  web service
* @author:Vico 
* @date 2016-3-20 下午12:11:04 
*  
*/
public class EnglishChineseDemo {
    	@Test
    	public void EnglishChinese()
    	{
    	    EnglishChinese ws=new EnglishChinese();
    	    EnglishChineseSoap port= ws.getEnglishChineseSoap();
    	    List<String> slist=port.translatorString("rose").getString();
    	    for (String s: slist) {
		System.out.print(s);
	    }
    	}
    	
}
