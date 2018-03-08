package com.swk.crawler.demo1.rule;

/** 
* @ClassName: Rule 
* @Description: 用于指定查询的url、method、params
* @author:Vico 
* @date 2016-3-27 下午5:15:27 
*  
*/
public class Rule {
    
    private String urlString;
    private String[] paramsArray;
    private String[] valuesArray;
    private String resultTagName;
    private int type=ID;
    private int requestMethod=GET;
    
    public final static int GET=0;
    public final static int POST=1;
    
    public final static int CLASS=0;
    public final static int ID=1;
    public final static int SELECTION=2;
    
    public Rule(){};
     
    public Rule(String urlString, String[] paramsArray, String[] valuesArray,
	    String resultTagName, int type, int requestMethod) {
	super();
	this.urlString = urlString;
	this.paramsArray = paramsArray;
	this.valuesArray = valuesArray;
	this.resultTagName = resultTagName;
	this.type = type;
	this.requestMethod = requestMethod;
    }
    public String getUrlString() {
        return urlString;
    }
    public void setUrlString(String urlString) {
        this.urlString = urlString;
    }
    public String[] getParamsArray() {
        return paramsArray;
    }
    public void setParamsArray(String[] paramsArray) {
        this.paramsArray = paramsArray;
    }
    public String[] getValuesArray() {
        return valuesArray;
    }
    public void setValuesArray(String[] valuesArray) {
        this.valuesArray = valuesArray;
    }
    public String getResultTagName() {
        return resultTagName;
    }
    public void setResultTagName(String resultTagName) {
        this.resultTagName = resultTagName;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getRequestMethod() {
        return requestMethod;
    }
    public void setRequestMethod(int requestMethod) {
        this.requestMethod = requestMethod;
    }
   
}
