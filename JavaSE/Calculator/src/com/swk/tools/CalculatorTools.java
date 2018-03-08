package com.swk.tools;

import java.math.BigDecimal;

/**
 * CalculatorTools类：用于处理大型数字的加、减、乘、除。
 * @author Administrator
 * @version 20151019
 * */
/*
 * 功能：实现大型数据的加、减、乘、除运算。
 * 思路步骤：
 * 1.设计getBigDecimal方法将输入数据转化为BigDecimal类型。--定义时eclipse出错
 * 2.设计大型数据的加法运算。
 * 3.设计大型数据的减法运算。
 * 4.设计大型数据的乘法运算。
 * 5.设计大型数据的除法运算。
 * */
public class CalculatorTools {
  	public static final int DEFAULT_SCALE=20; //默认保留小数点位数
	
  	/**
	 * getBigDecimal:将输入的数据转化为Decimal类型
	 * @param number Double类型
	 * @return BigDecimal类型
	 * */
  	public static BigDecimal getBigDecimal(double number)
  	{
  		return new BigDecimal(number);
  	}
  	
  	/**
	 * add:实现大数据的加法运算
	 * @param number1  double类型,第一个操作数
	 * @param number2    double类型,第二个操作数
	 * @return double类型数据,返回两数之和。
	 * */
  	public static double add(double number1,double number2)
  	{
  		BigDecimal firstNum=getBigDecimal(number1);
  		BigDecimal secondNum=getBigDecimal(number2);
  		return firstNum.add(secondNum).doubleValue();
  	}
  	
  	/**
	 * subtract:实现大数据的减法运算
	 * @param number1  double类型,第一个操作数
	 * @param number2    double类型,第二个操作数
	 * @return double类型数据,返回两数之差
	 * */
  	public static double subtract(double number1,double number2)
  	{
  		BigDecimal firstNum=getBigDecimal(number1);
  		BigDecimal secondNum=getBigDecimal(number2);
  		return firstNum.subtract(secondNum).doubleValue();
  	}
  	
	/**
	 * multiply:实现大数据的乘法运算
	 * @param number1  double类型,第一个操作数
	 * @param number2    double类型,第二个操作数
	 * @return double类型数据,返回两数的乘积
	 * */
  	public static double multiply(double number1,double number2)
  	{
  		BigDecimal firstNum=getBigDecimal(number1);
  		BigDecimal secondNum=getBigDecimal(number2);
  		return firstNum.multiply(secondNum).doubleValue();
  	}
  	
  	/**
	 * divide:实现大数据的除法运算
	 * @param number1   double类型,第一个操作数
	 * @param number2    double类型,第二个操作数
	 * @return double类型数据,返回两数的商
	 * */
  	public static double divide(double number1,double number2)
  	{
  		BigDecimal firstNum=getBigDecimal(number1);
  		BigDecimal secondNum=getBigDecimal(number2);
  		return firstNum.divide(secondNum,DEFAULT_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
  	}
  	
}
