package com.swk.librarymanagerdemo.model;

/**
 * ���ܣ�ͼ��黹��Ϣ�࣬������װ�����鼮�黹����Ϣ��
 * @author Administrator
 * @version 20.58 20150915
 * */
/*
 * ����:��װ���е��鼮�黹��Ϣ
 * ˼·������:
 * 1.������Ҫ��װ������
 * 2.�Ը��������setter��getter����
 */

public class BookReturn {
	//����ʵ������
	private String bookISBN;		//ͼ����
	private String bookName;		//ͼ����
	private String operatorId;		//����Ա���
	private String borrowDate;		//ͼ�����ʱ��
	private String backDate;		//ͼ��黹ʱ��
	private String readerName;		//��������
	private String readerISBN;		//���߱��
	private int id;
	
	//setter��getter����
	//ΪbookISBN���setter��getter����
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//Ϊbookname���setter��getter����
	public String getBookName() {
		return bookName;
	}
	public void setBookname(String bookName) {
		this.bookName = bookName;
	}
	
	//ΪoperatorId���setter��getter����
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	//ΪborrowDate���setter��getter����
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	//ΪbackDate���setter��getter����
	public String getBackDate() {
		return backDate;
	}
	public void setBackDate(String backDate) {
		this.backDate = backDate;
	}
	
	//ΪreaderName���setter��getter����
	public String getReaderName() {
		return readerName;
	}
	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}
	
	//ΪreaderISBN���setter��getter����
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
