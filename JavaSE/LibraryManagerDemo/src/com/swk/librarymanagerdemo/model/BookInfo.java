package com.swk.librarymanagerdemo.model;

import java.util.Date;

/**
 * ���ܣ�ͼ����Ϣ�࣬������װ����ͼ�����Ϣ��
 * @author Administrator
 * @version 20.38 20150915
 * */
/*
 * ����:��װ���е�ͼ����Ϣ
 * ˼·������:
 * 1.������Ҫ��װ������
 * 2.�Ը��������setter��getter����
 */
public class BookInfo {
	//������Ա��ʵ��������
	private String bookISBN;		//ͼ����
	private String typeId;		//�����
	private String writer;		//����
	private String translator;		//����
	private String publisher;		//������
	private Date date;			//��������
	private Double price;		//ͼ��۸�
	private String bookName;	//ͼ������
	
	//setter��getter����
	//ΪISBN�������setter��getter����
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//Ϊtypeid�������setter��getter����
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	
	//Ϊwriter�������setter��getter����
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	//Ϊtranslator�������setter��getter����
	public String getTranslator() {
		return translator;
	}
	public void setTranslator(String translator) {
		this.translator = translator;
	}
	
	//Ϊpublisher�������setter��getter����
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//Ϊdate�������setter��getter����
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	//Ϊprice�������setter��getter����
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//ΪbookName�������setter��getter����
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
