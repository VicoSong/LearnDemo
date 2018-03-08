package com.swk.librarymanagerdemo.model;

/**
 * 功能：图书归还信息类，用来封装所有书籍归还的信息。
 * @author Administrator
 * @version 20.58 20150915
 * */
/*
 * 需求:封装所有的书籍归还信息
 * 思路、步骤:
 * 1.定义需要封装的属性
 * 2.对个属性添加setter和getter方法
 */

public class BookReturn {
	//定义实例变量
	private String bookISBN;		//图书编号
	private String bookName;		//图书名
	private String operatorId;		//操作员编号
	private String borrowDate;		//图书借阅时间
	private String backDate;		//图书归还时间
	private String readerName;		//读者姓名
	private String readerISBN;		//读者编号
	private int id;
	
	//setter和getter方法
	//为bookISBN添加setter和getter方法
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//为bookname添加setter和getter方法
	public String getBookName() {
		return bookName;
	}
	public void setBookname(String bookName) {
		this.bookName = bookName;
	}
	
	//为operatorId添加setter和getter方法
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	//为borrowDate添加setter和getter方法
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	//为backDate添加setter和getter方法
	public String getBackDate() {
		return backDate;
	}
	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}
	
	//为readerName添加setter和getter方法
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}
	
	//为readerISBN添加setter和getter方法
	public String getReaderISBN() {
		return readerISBN;
	}
	public void setReaderISBN(String readerISBN) {
		this.readerISBN = readerISBN;
	}
	public String getTypeId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
