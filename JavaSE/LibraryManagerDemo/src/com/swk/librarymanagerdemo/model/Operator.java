package com.swk.librarymanagerdemo.model;
/**
 * ���ܣ�����Ա��Ϣ�࣬������װ�����Ա��ص���Ϣ��
 * @author Administrator
 * @version 18.51 20150915
 * */

/*
 * ����:��װ����Ա�������Ϣ
 * ˼·������:
 * 1.������Ҫ��װ������
 * 2.�Ը��������setter��getter����
 */
public class Operator {
	private String operatorID; 			//����Ա���
	private String userName;			//����Ա�û���
	private String operatorGrade;		//����Ա�ȼ�
	private String userPassword;		//����Ա����
	
	//ΪoperatorID�������setter��getter����
	public void setOperatorID(String operatorID)
	{
		this.operatorID=operatorID;
	}
	
	public String getOperatorID()
	{
		return operatorID;
	}
	
	//ΪuserName�������setter��getter����
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//ΪoperatorGrade�������setter��getter����
	public String getOperatorGrade() {
		return operatorGrade;
	}

	public void setOperatorGrade(String operatorGrade) {
		this.operatorGrade = operatorGrade;
	}

	//ΪuserPassword�������setter��getter����
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
