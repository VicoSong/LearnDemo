package com.swk.librarymanagerdemo.model;

import java.util.Date;

/**
 * 功能：图书信息类，用来封装所有图书的信息。
 * @author Administrator
 * @version 20.38 20150915
 * */
/*
 * 需求:封装所有的图书信息
 * 思路、步骤:
 * 1.定义需要封装的属性
 * 2.对个属性添加setter和getter方法
 */
public class BookInfo {
	//声明成员（实例）变量
	private String bookISBN;		//图书编号
	private String typeId;		//类别编号
	private String writer;		//作者
	private String translator;		//译者
	private String publisher;		//出版社
	private Date date;			//出版日期
	private Double price;		//图书价格
	private String bookName;	//图书名称
	
	//setter和getter方法
	//为ISBN属性添加setter和getter方法
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//为typeid属性添加setter和getter方法
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	
	//为writer属性添加setter和getter方法
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	//为translator属性添加setter和getter方法
	public String getTranslator() {
		return translator;
	}
	public void setTranslator(String translator) {
		this.translator = translator;
	}
	
	//为publisher属性添加setter和getter方法
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//为date属性添加setter和getter方法
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	//为price属性添加setter和getter方法
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//为bookName属性添加setter和getter方法
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
