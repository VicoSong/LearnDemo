package com.swk.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
 
	public static void main(String[] args)
	{
		LinkedList<Integer> ints= new LinkedList<Integer>();
		for(int i=0;i<10;i++)
		   ints.add(i);
		ListIterator<Integer> iterator=ints.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			if(iterator.hasPrevious())
			{
				System.out.println("previous:"+iterator.previous());
				iterator.next();
			}
		}
		
	}
}
