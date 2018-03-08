package com.swk.librarymanagerdemo.model;

import javax.management.loading.PrivateClassLoader;
/**
 * 功能：图书类别信息类，用来封装所有图书类别信息。
 * @author Administrator
 * @version 19.51 20150915
 * */
/*
 * 需求:封装所有的图书类别信息
 * 思路、步骤:
 * 1.定义需要封装的属性
 * 2.对个属性添加setter和getter方法
 */
public class BookType {
	//声明成员（实例）变量
	private String bookTypeID;		//图书类别编号
	private String typeName;		//图书类别名称	
	private String days;			//可借天数
	private String finePerDay;		//迟还一天的罚款数目
	
	//setter和getter方法
	//为bookTypeID添加setter和getter方法
	public String getBookTypeID() {
		return bookTypeID;
	}
	public void setBookTypeID(String bookTypeID) {
		this.bookTypeID = bookTypeID;
	}
	
	//为typeName添加setter和getter方法
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	//为days添加setter和getter方法
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	
	//为finePerDay添加setter和getter方法
	public String getFinePerDay() {
		return finePerDay;
	}
	public void setFinePerDay(String finePerDay) {
		this.finePerDay = finePerDay;
	}

}
