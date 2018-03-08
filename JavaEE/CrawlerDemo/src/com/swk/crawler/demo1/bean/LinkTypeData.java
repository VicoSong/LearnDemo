package com.swk.crawler.demo1.bean;

/** 
* @ClassName: LinkTypeData 
* @Description: 需要的数据对象
* @author:Vico 
* @date 2016-3-27 下午5:28:41 
*  
*/
public class LinkTypeData {
    //id
    private int id;
    //url
    private String linkHref;
    //linkTitle
    private String linkTitle;
    //linkContent
    private String linkContent;
    //abstract
    private String linkAbstract;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLinkHref() {
        return linkHref;
    }
    public void setLinkHref(String linkHref) {
        this.linkHref = linkHref;
    }
    public String getLinkTitle() {
        return linkTitle;
    }
    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }
    public String getLinkContent() {
        return linkContent;
    }
    public void setLinkContent(String linkContent) {
        this.linkContent = linkContent;
    }
    public String getLinkAbstract() {
        return linkAbstract;
    }
    public void setLinkAbstract(String linkAbstract) {
        this.linkAbstract = linkAbstract;
    }
}
