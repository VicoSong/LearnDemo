package com.swk.four.factory.pattern.application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("********simple calculation**********");
		System.out.println("please enter the first number:");
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		String num1Str = scanner.nextLine();
		System.out.println("please enter operation:");
		String operation = scanner.nextLine();
		System.out.println("please enter the second number :");
		String num2Str =scanner.nextLine();
		
		double result =0d;
		double num1 = Double.parseDouble(num1Str);
		double num2 = Double.parseDouble(num2Str);
		
		Operation op = OperationFactory.getOperation(operation);
		op.setNum1(num1);
		op.setNum2(num2);
		result =op.getResult();
		System.out.println("num1:"+num1+",num2:"+num2+",result:"+result);
		
		
		
	}
}
