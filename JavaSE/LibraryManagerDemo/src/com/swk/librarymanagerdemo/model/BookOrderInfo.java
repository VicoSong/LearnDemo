package com.swk.librarymanagerdemo.model;

import java.sql.Date;

/**
 * 功能：图书订单信息类，用来封装所有书籍订单的信息。
 * @author Administrator
 * @version 20.58 20150915
 * */
/*
 * 需求:封装所有的书籍订单信息
 * 思路、步骤:
 * 1.定义需要封装的属性
 * 2.对个属性添加setter和getter方法
 */

public class BookOrderInfo {
	//定义实例变量
	private String bookISBN;		//图书编号
	private Date orderDate;			//下单时间
	private String number;			//图书数量
	private String operator;		//操作员
	private String checkAndAccept;		//是否验收
	private String discount;		//书籍折扣
	
	//setter方法和getter方法
	//为bookISBN属性添加setter方法和getter方法
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//为orderDate属性添加setter方法和getter方法
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	//为number属性添加setter方法和getter方法
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	//为operator属性添加setter方法和getter方法
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	//为checkAndAccept属性添加setter方法和getter方法
	public String getCheckAndAccept() {
		return checkAndAccept;
	}
	public void setCheckAndAccept(String checkAndAccept) {
		this.checkAndAccept = checkAndAccept;
	}
	
	//为discount属性添加setter方法和getter方法
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
}
