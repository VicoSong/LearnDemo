package com.swk.librarymanagerdemo.model;

import java.util.Date;

/**
 * ���ܣ�������Ϣ�࣬������װ���ж��ߵ���Ϣ��
 * @author Administrator
 * @version 20.58 20150915
 * */
/*
 * ����:��װ���еĶ�����Ϣ
 * ˼·������:
 * 1.������Ҫ��װ������
 * 2.�Ը��������setter��getter����
 */

public class ReaderInfo {
	//������Ա��ʵ��������
	private String name;		//��������
	private String sex;			//�����Ա�
	private String age;			//��������
	private String identityCard;		//֤������
	private Date validityDate;			//֤����Ч��
	private String maxNum;			//��������
	private String phoneNumber;		//�绰����				
	private Double pledgeCash;		//Ѻ��
	private String certificateType;		//֤������
	private String occupation;			//ְҵ
	private String readerISBN;			//���߱��
	private Date certificationHandlingDate;			//��֤����
	
	//setter��getter����
	//Ϊage�������setter��getter����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Ϊsex�������setter��getter����
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//Ϊage�������setter��getter����
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	//ΪidentityCard�������setter��getter����
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	
	//ΪvalidityDate�������setter��getter����
	public Date getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}
	
	//ΪmaxNum�������setter��getter����
	public String getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(String maxNum) {
		this.maxNum = maxNum;
	}
	
	//ΪphoneNumber�������setter��getter����
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//ΪpledgeCash�������setter��getter����
	public Double getPledgeCash() {
		return pledgeCash;
	}
	public void setPledgeCash(Double pledgeCash) {
		this.pledgeCash = pledgeCash;
	}
	
	//ΪcertificateType�������setter��getter����
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	
	//Ϊoccupation�������setter��getter����
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	//ΪreaderISBN�������setter��getter����
	public String getReaderISBN() {
		return readerISBN;
	}
	public void setReaderISBN(String readerISBN) {
		this.readerISBN = readerISBN;
	}
	
	//ΪcertificationHandlingDate�������setter��getter����
	public Date getCertificationHandlingDate() {
		return certificationHandlingDate;
	}
	public void setCertificationHandlingDate(Date certificationHandlingDate) {
		this.certificationHandlingDate = certificationHandlingDate;
	}
	
}
