package com.swk.librarymanagerdemo.model;

import java.sql.Date;

/**
 * ���ܣ�ͼ�鶩����Ϣ�࣬������װ�����鼮��������Ϣ��
 * @author Administrator
 * @version 20.58 20150915
 * */
/*
 * ����:��װ���е��鼮������Ϣ
 * ˼·������:
 * 1.������Ҫ��װ������
 * 2.�Ը��������setter��getter����
 */

public class BookOrderInfo {
	//����ʵ������
	private String bookISBN;		//ͼ����
	private Date orderDate;			//�µ�ʱ��
	private String number;			//ͼ������
	private String operator;		//����Ա
	private String checkAndAccept;		//�Ƿ�����
	private String discount;		//�鼮�ۿ�
	
	//setter������getter����
	//ΪbookISBN�������setter������getter����
	public String getBookISBN() {
		return bookISBN;
	}
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	//ΪorderDate�������setter������getter����
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	//Ϊnumber�������setter������getter����
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	//Ϊoperator�������setter������getter����
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	//ΪcheckAndAccept�������setter������getter����
	public String getCheckAndAccept() {
		return checkAndAccept;
	}
	public void setCheckAndAccept(String checkAndAccept) {
		this.checkAndAccept = checkAndAccept;
	}
	
	//Ϊdiscount�������setter������getter����
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
}
