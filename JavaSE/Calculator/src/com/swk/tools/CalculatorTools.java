package com.swk.tools;

import java.math.BigDecimal;

/**
 * CalculatorTools�ࣺ���ڴ���������ֵļӡ������ˡ�����
 * @author Administrator
 * @version 20151019
 * */
/*
 * ���ܣ�ʵ�ִ������ݵļӡ������ˡ������㡣
 * ˼·���裺
 * 1.���getBigDecimal��������������ת��ΪBigDecimal���͡�--����ʱeclipse����
 * 2.��ƴ������ݵļӷ����㡣
 * 3.��ƴ������ݵļ������㡣
 * 4.��ƴ������ݵĳ˷����㡣
 * 5.��ƴ������ݵĳ������㡣
 * */
public class CalculatorTools {
  	public static final int DEFAULT_SCALE=20; //Ĭ�ϱ���С����λ��
	
  	/**
	 * getBigDecimal:�����������ת��ΪDecimal����
	 * @param number Double����
	 * @return BigDecimal����
	 * */
  	public static BigDecimal getBigDecimal(double number)
  	{
  		return new BigDecimal(number);
  	}
  	
  	/**
	 * add:ʵ�ִ����ݵļӷ�����
	 * @param number1  double����,��һ��������
	 * @param number2    double����,�ڶ���������
	 * @return double��������,��������֮�͡�
	 * */
  	public static double add(double number1,double number2)
  	{
  		BigDecimal firstNum=getBigDecimal(number1);
  		BigDecimal secondNum=getBigDecimal(number2);
  		return firstNum.add(secondNum).doubleValue();
  	}
  	
  	/**
	 * subtract:ʵ�ִ����ݵļ�������
	 * @param number1  double����,��һ��������
	 * @param number2    double����,�ڶ���������
	 * @return double��������,��������֮��
	 * */
  	public static double subtract(double number1,double number2)
  	{
  		BigDecimal firstNum=getBigDecimal(number1);
  		BigDecimal secondNum=getBigDecimal(number2);
  		return firstNum.subtract(secondNum).doubleValue();
  	}
  	
	/**
	 * multiply:ʵ�ִ����ݵĳ˷�����
	 * @param number1  double����,��һ��������
	 * @param number2    double����,�ڶ���������
	 * @return double��������,���������ĳ˻�
	 * */
  	public static double multiply(double number1,double number2)
  	{
  		BigDecimal firstNum=getBigDecimal(number1);
  		BigDecimal secondNum=getBigDecimal(number2);
  		return firstNum.multiply(secondNum).doubleValue();
  	}
  	
  	/**
	 * divide:ʵ�ִ����ݵĳ�������
	 * @param number1   double����,��һ��������
	 * @param number2    double����,�ڶ���������
	 * @return double��������,������������
	 * */
  	public static double divide(double number1,double number2)
  	{
  		BigDecimal firstNum=getBigDecimal(number1);
  		BigDecimal secondNum=getBigDecimal(number2);
  		return firstNum.divide(secondNum,DEFAULT_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
  	}
  	
}
