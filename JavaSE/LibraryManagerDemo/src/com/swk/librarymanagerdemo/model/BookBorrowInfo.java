package com.swk.librarymanagerdemo.model;
/**
 * 功能：图书借阅信息类，用来封装所有书籍借阅的信息。
 * @author Administrator
 * @version 20.58 20150915
 * */
/*
 * 需求:封装所有的书籍借阅信息
 * 思路、步骤:
 * 1.定义需要封装的属性
 * 2.对个属性添加setter和getter方法
 */
public class BookBorrowInfo {
	//声明成员（实例）变量
	private int id;			//借阅编号
	private String bookISBN;		//书籍编号
	private String readerISBN;		//读者编号
	private String borrowNumber;			//借阅数量
	private String borrowDate;		//借阅日期
	private String backDate;		//归还日期
	private String bookName;		//书名
	
	////setter和getter方法
	//为id属性添加setter和getter方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//为bookISBN属性添加setter和getter方法
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//为readerISBN属性添加setter和getter方法
	public String getReaderISBN() {
		return readerISBN;
	}
	public void setReaderISBN(String readerISBN) {
		this.readerISBN = readerISBN;
	}
	
	//为borrowNumber属性添加setter和getter方法
	public String getBorrowNumber() {
		return borrowNumber;
	}
	public void setBorrowNumber(String borrowNumber) {
		this.borrowNumber = borrowNumber;
	}
	
	//为 borrowDate属性添加setter和getter方法
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	//为 backDate属性添加setter和getter方法
	public String getBackDate() {
		return backDate;
	}
	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}
	
	//为bookName属性添加setter和getter方法
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
