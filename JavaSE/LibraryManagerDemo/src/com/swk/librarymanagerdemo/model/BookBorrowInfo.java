package com.swk.librarymanagerdemo.model;
/**
 * ���ܣ�ͼ�������Ϣ�࣬������װ�����鼮���ĵ���Ϣ��
 * @author Administrator
 * @version 20.58 20150915
 * */
/*
 * ����:��װ���е��鼮������Ϣ
 * ˼·������:
 * 1.������Ҫ��װ������
 * 2.�Ը��������setter��getter����
 */
public class BookBorrowInfo {
	//������Ա��ʵ��������
	private int id;			//���ı��
	private String bookISBN;		//�鼮���
	private String readerISBN;		//���߱��
	private String borrowNumber;			//��������
	private String borrowDate;		//��������
	private String backDate;		//�黹����
	private String bookName;		//����
	
	////setter��getter����
	//Ϊid�������setter��getter����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//ΪbookISBN�������setter��getter����
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//ΪreaderISBN�������setter��getter����
	public String getReaderISBN() {
		return readerISBN;
	}
	public void setReaderISBN(String readerISBN) {
		this.readerISBN = readerISBN;
	}
	
	//ΪborrowNumber�������setter��getter����
	public String getBorrowNumber() {
		return borrowNumber;
	}
	public void setBorrowNumber(String borrowNumber) {
		this.borrowNumber = borrowNumber;
	}
	
	//Ϊ borrowDate�������setter��getter����
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	//Ϊ backDate�������setter��getter����
	public String getBackDate() {
		return backDate;
	}
	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}
	
	//ΪbookName�������setter��getter����
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
