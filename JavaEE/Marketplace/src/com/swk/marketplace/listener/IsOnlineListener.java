package com.swk.marketplace.listener;

import java.util.Vector;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;



/** 
* @ClassName: IsOnlineListener 
* @Description: 监听用户上线下线
* @author:Vico 
* @date 2016-4-4 下午11:10:06 
*  
*/
public class IsOnlineListener implements HttpSessionBindingListener {
    
    private String id;
    private Vector<String> vector=new Vector<String>();
   
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public Vector<String> getVector() {
        return vector;
    }


    public void setVector(Vector<String> vector) {
        this.vector = vector;
    }


    public IsOnlineListener()
    {
	id="";
    }
    
    
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
	HttpSession session=event.getSession();
	ServletContext servletContext=session.getServletContext();
	vector=(Vector<String>)servletContext.getAttribute("userList");
	if(vector==null||vector.size()==0)
	{
	    vector=new Vector<String>();
	    vector.add(id);
	}else {
	    if (!vector.contains(id)) {
		vector.add(id);
	    }
	}
	servletContext.setAttribute("userList", vector);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
	 HttpSession session=event.getSession();
	 ServletContext servletContext=session.getServletContext();
	 vector=(Vector<String>)servletContext.getAttribute("userList");
	if(!(id==null&&id==""))
	{
	   vector.removeElement(id);
	   servletContext.setAttribute("userList", vector);
	}
	
    }

}
