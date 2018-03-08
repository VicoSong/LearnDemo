package com.swk;

import java.util.ArrayList;
import java.util.Scanner;

public class EndDemo {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		 ArrayList  ns = new ArrayList();
		 String str;
		do {
		     str= scanner.nextLine();
		     ns.add(str);
			if (str.equals("")) {
				break;
			}
			
		} while (true);

		System.out.println(ns);
	}
}
