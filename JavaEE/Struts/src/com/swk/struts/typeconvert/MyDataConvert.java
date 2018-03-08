package com.swk.struts.typeconvert;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;
import org.omg.CORBA.PRIVATE_MEMBER;

import com.sun.org.apache.bcel.internal.generic.NEW;

/** 
* @ClassName: MyDataConvert 
* @Description: 自定义类型转换器
* 		String--->>java.util.Date  MM/dd/yyyy
* 		java.util.Date--->>String MM/dd/yyyy
* @author:Vico 
* @date 2016-3-14 下午9:04:31 
*  
*/
public class MyDataConvert extends StrutsTypeConverter{

    private DateFormat df=new SimpleDateFormat("MM/dd/yyyy");
    @Override
    public Object convertFromString(Map map, String[] values, Class toClass) {
	if(toClass==Date.class)
	{
	    
	    if(values!=null&&values.length>0)
	    {
		String valueString=values[0];
		try {
		    return df.parse(valueString);
		} catch (ParseException e) {
		    
		    e.printStackTrace();
		    throw new RuntimeException();
		}
	    }
	}
	return null;
    }

    @Override
    public String convertToString(Map map, Object obj) {
	if(obj instanceof Date)
	{
	    Date date=(Date)obj;
	    return df.format(date);
	}
	return null;
    }

}
