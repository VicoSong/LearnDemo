package com.swk.librarymanagerdemo.model;
/**
 * 功能：操作员信息类，用来封装与操作员相关的信息。
 * @author Administrator
 * @version 18.51 20150915
 * */

/*
 * 需求:封装操作员的相关信息
 * 思路、步骤:
 * 1.定义需要封装的属性
 * 2.对个属性添加setter和getter方法
 */
public class Operator {
	private String operatorID; 			//操作员编号
	private String userName;			//操作员用户名
	private String operatorGrade;		//操作员等级
	private String userPassword;		//操作员密码
	
	//为operatorID属性添加setter和getter方法
	public void setOperatorID(String operatorID)
	{
		this.operatorID=operatorID;
	}
	
	public String getOperatorID()
	{
		return operatorID;
	}
	
	//为userName属性添加setter和getter方法
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//为operatorGrade属性添加setter和getter方法
	public String getOperatorGrade() {
		return operatorGrade;
	}

	public void setOperatorGrade(String operatorGrade) {
		this.operatorGrade = operatorGrade;
	}

	//为userPassword属性添加setter和getter方法
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
