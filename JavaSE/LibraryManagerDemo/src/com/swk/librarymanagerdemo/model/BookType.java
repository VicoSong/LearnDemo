package com.swk.librarymanagerdemo.model;

import javax.management.loading.PrivateClassLoader;
/**
 * ���ܣ�ͼ�������Ϣ�࣬������װ����ͼ�������Ϣ��
 * @author Administrator
 * @version 19.51 20150915
 * */
/*
 * ����:��װ���е�ͼ�������Ϣ
 * ˼·������:
 * 1.������Ҫ��װ������
 * 2.�Ը��������setter��getter����
 */
public class BookType {
	//������Ա��ʵ��������
	private String bookTypeID;		//ͼ�������
	private String typeName;		//ͼ���������	
	private String days;			//�ɽ�����
	private String finePerDay;		//�ٻ�һ��ķ�����Ŀ
	
	//setter��getter����
	//ΪbookTypeID���setter��getter����
	public String getBookTypeID() {
		return bookTypeID;
	}
	public void setBookTypeID(String bookTypeID) {
		this.bookTypeID = bookTypeID;
	}
	
	//ΪtypeName���setter��getter����
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	//Ϊdays���setter��getter����
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	
	//ΪfinePerDay���setter��getter����
	public String getFinePerDay() {
		return finePerDay;
	}
	public void setFinePerDay(String finePerDay) {
		this.finePerDay = finePerDay;
	}

}
