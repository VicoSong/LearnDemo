package com.swk.function;

import com.swk.tools.CalculatorTools;

/**
 * CalculatorFunction类：主要完成计算器中的逻辑功能
 * @author Administrator
 * @version 20151019
 * 
 * */
public class CalculatorFunction {
	private double store=0;
	private String firstNumber;
	private String lastOperation;
	private String secondNumber;
	private boolean isSecondNumber=false;
	private String numberString="0123456789.";
	private String operationString="+-*/";
	/**
	 * 默认构造器
	 * 
	 * */
	public CalculatorFunction()
	{
		super();
	}
	
	/**
	 * callMethod:调用方法
	 * @param cmd String类型
	 * @param text String类型
	 * @throws Exception
	 * @return String类型
	 * 
	 * */
	public String callMethod(String cmd,String text) throws Exception
	{
		if(cmd.equals("C"))
		{
			return clearAll();
		}else if(cmd.equals("CE"))
		{
			return clear(text);
		}else if(cmd.equals("←"))
		{
			return backSpace(text);
		}else if(numberString.indexOf(cmd)!=(-1))
		{
			return catNumber(cmd,text);
		}else if(operationString.indexOf(cmd)!=(-1))
		{
			return setOperation(cmd,text);
		}else if(cmd.equals("="))
		{
			return cal(text,false);
		}else if(cmd.equals("+/-"))
		{
			return setNegative(text);
		}else if(cmd.equals("1/x"))
		{
			return setReciprocal(text);
		}else if(cmd.equals("x²"))
		{
			return sqrt(text);
		}else if(cmd.equals("%"))
		{
			return cal(text, true);
		}else {
			return mCmd(cmd,text);
		}
	}
	
	/**
	 * cal:计算表达式结果
	 *@param isPercent boolean 是否有“%”运算
	 *@throws Exception
	 *@return String 封闭成字符串的计算结果
	 *
	 * */
	public String cal(String text,boolean isPercent) throws Exception
	{
		double secondResult=secondNumber==null?Double.valueOf(text).doubleValue():Double.valueOf(secondNumber).doubleValue();
		if(secondResult==0&&this.lastOperation.equals("/"))
		{
			return "0";
		}
		if(isPercent)
		{
			secondResult=CalculatorTools.multiply(Double.valueOf(firstNumber), CalculatorTools.divide(Double.valueOf(secondNumber), 100));
		}
		if(this.lastOperation.equals("+"))
		{
			firstNumber=String.valueOf(CalculatorTools.add(Double.valueOf(firstNumber),secondResult));
			
		}else if(this.lastOperation.equals("-"))
		{
			firstNumber=String.valueOf(CalculatorTools.subtract(Double.valueOf(firstNumber), secondResult));
		}else if(this.lastOperation.equals("*"))
		{
			firstNumber=String.valueOf(CalculatorTools.multiply(Double.valueOf(firstNumber), secondResult));
		}else if(this.lastOperation.equals("/"))
		{
			firstNumber=String.valueOf(CalculatorTools.divide(Double.valueOf(firstNumber), secondResult));
		}
		secondNumber=secondNumber==null?text:secondNumber;
		this.isSecondNumber=true;
		return firstNumber;
	}
	
	
	
	
	/**
	 * clearAll:
	 * return String类型
	 * 
	 * */
	public String clearAll()
	{
		this.firstNumber="0";
		this.secondNumber=null;
		return this.firstNumber;
	}
	
	/**
	 * clear:清除上次计算结果
	 * @param text String类型
	 * @return String类型
	 * 
	 * */
	public String clear(String text)
	{
		return "0";
	}
	
	/**
	 * backSpace:实现backSpace功能
	 * @param text String类型
	 * @return String类型
	 * 
	 * */
	public String backSpace(String text)
	{
		return text.equals("0")||text.equals("")?"0":text.substring(0,text.length()-1);
		
	}
	
	/**
	 * catNumber:连接输入的数字
	 * @param cmd String类型代表操作符
	 * @param text String类型代表输入框中的值
	 * @return String类型，封闭成字符串的结果
	 * 
	 * */
	public String catNumber(String cmd,String text)
	{
		String result=cmd;
		if(!text.equals("0"))
		{
			if(isSecondNumber)
			{
				isSecondNumber=false;
			}else{
				result=text+cmd;
			}
		}
		if(result.indexOf(".")==0)
		{
			result="0"+cmd;
		}
		return result;
	}
	
	
	/**
	 * setOperation:设置操作符
	 * @param cmd String类型 操作符号
	 * @param text String类型输入框中的值
	 * @return String 封闭成字符串的结果
	 * 
	 * */
	public String setOperation(String cmd,String text)
	{
		this.lastOperation=cmd;
		this.firstNumber=text;
		this.secondNumber=null;
		this.isSecondNumber=true;
		return null;
	}
	
	/**
	 * setNegative:设置正负数
	 * @param text String 输入框中的值
	 * @return String 封闭成字符串的结果
	 * 
	 * */
	public String setNegative(String text )
	{
		if(text.indexOf("-")==0)
		{
			return text.substring(1,text.length());
		}
		return text.equals("0")?text:"-"+text;
	}
	
	/**
	 * setReciprocal:计算倒数
	 *@param text String 
	 *@return String
	 *
	 * */
	public String setReciprocal(String text)
	{
		if(text.equals("0"))
		{
			return text;
		}else{
			this.isSecondNumber=true;
			return String.valueOf(CalculatorTools.divide(1, Double.valueOf(text)));
		}
	}
	
	/**
	 * sqrt:计算开方
	 * @param text String
	 * @return String
	 * 
	 * */
	public String sqrt(String text)
	{
		this.isSecondNumber=true;
		return String.valueOf(Math.sqrt(Double.valueOf(text)));
	}
	
	/**
	 * mCmd:实现存储操作命令
	 * @param cmd String 操作符号
	 * @param text String 文本框中的结果
	 * @return String
	 * */
	public String mCmd(String cmd,String text)
	{
		if(cmd.equals("M+"))
		{
			store=CalculatorTools.add(store, Double.valueOf(text));
		}else if(cmd.equals("MC"))
		{
			store=0;
		}else if(cmd.equals("MR"))
		{
			isSecondNumber=true;
			return String.valueOf(store);
		}else if(cmd.equals("MS"))
		{
			store=Double.valueOf(text).doubleValue();
		}
		return null;
	}
	
	/**
	 * getScore:返回存储器的结果
	 * return double
	 * 
	 * */
	public double getScore()
	{
		return this.getScore();
	}
	
}
