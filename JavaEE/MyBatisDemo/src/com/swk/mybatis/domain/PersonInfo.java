package com.swk.mybatis.domain;

import java.io.Serializable;
import java.util.Date;



public class PersonInfo implements Serializable{
    /** 
    * @Fields serialVersionUID : TODO
    */ 
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String work;
    private Date intime;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public Date getIntime() {
        return intime;
    }
    public void setIntime(Date intime) {
        this.intime = intime;
    }
    @Override
    public String toString() {
	return "PersonInfo [id=" + id + ", work=" + work + ", intime=" + intime
		+ "]";
    }
  
    
   
    
}
