package com.swk.librarymanagerdemo.model;

import java.util.Date;

/**
 * 功能：读者信息类，用来封装所有读者的信息。
 * @author Administrator
 * @version 20.58 20150915
 * */
/*
 * 需求:封装所有的读者信息
 * 思路、步骤:
 * 1.定义需要封装的属性
 * 2.对个属性添加setter和getter方法
 */

public class ReaderInfo {
	//声明成员（实例）变量
	private String name;		//读者姓名
	private String sex;			//读者性别
	private String age;			//读者年龄
	private String identityCard;		//证件号码
	private Date validityDate;			//证件有效期
	private String maxNum;			//最大借书量
	private String phoneNumber;		//电话号码				
	private Double pledgeCash;		//押金
	private String certificateType;		//证件类型
	private String occupation;			//职业
	private String readerISBN;			//读者编号
	private Date certificationHandlingDate;			//办证日期
	
	//setter和getter方法
	//为age属性添加setter和getter方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//为sex属性添加setter和getter方法
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//为age属性添加setter和getter方法
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	//为identityCard属性添加setter和getter方法
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	
	//为validityDate属性添加setter和getter方法
	public Date getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}
	
	//为maxNum属性添加setter和getter方法
	public String getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(String maxNum) {
		this.maxNum = maxNum;
	}
	
	//为phoneNumber属性添加setter和getter方法
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//为pledgeCash属性添加setter和getter方法
	public Double getPledgeCash() {
		return pledgeCash;
	}
	public void setPledgeCash(Double pledgeCash) {
		this.pledgeCash = pledgeCash;
	}
	
	//为certificateType属性添加setter和getter方法
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	
	//为occupation属性添加setter和getter方法
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	//为readerISBN属性添加setter和getter方法
	public String getReaderISBN() {
		return readerISBN;
	}
	public void setReaderISBN(String readerISBN) {
		this.readerISBN = readerISBN;
	}
	
	//为certificationHandlingDate属性添加setter和getter方法
	public Date getCertificationHandlingDate() {
		return certificationHandlingDate;
	}
	public void setCertificationHandlingDate(Date certificationHandlingDate) {
		this.certificationHandlingDate = certificationHandlingDate;
	}
	
}
