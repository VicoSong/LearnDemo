package com.swk.listenertwo;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * ���ڲ���ServletRequestAttributeListener������
 * @author Vico
 *
 */
public class ServletRequestAttributeTest implements ServletRequestAttributeListener {

	/*
	 * attributeAdded()
	 * 	*�÷������ڼ���Request�����������
	 * */
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("Request���������һ�����ԡ�������");

	}


	/*
	 * attributeRemoved()
	 * 	*�÷������ڼ���Request�����Ƴ�����
	 * */
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("Request�����Ƴ���һ�����ԡ�������");


	}


	/*
	 * attributeReplaced()
	 * 	*�÷������ڼ���Request�����޸� ����
	 * */
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("Request�����޸���һ�����ԡ�������");

	}

}
