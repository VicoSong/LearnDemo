package com.swk.main;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;

import com.swk.frame.CalculatorFrame;

/**
 * Main类：程序执行的入口
 * @author Administrator
 * @version 20151019
 * 
 * */
public class Main {
	public static void  main(String[] args) 
	{
		try {
			EventQueue.invokeAndWait(new Runnable() 
			{
				public void run() 
				{
					CalculatorFrame f=new CalculatorFrame();
					f.pack();
					f.setVisible(true);
					f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
				}
			});
		} catch (InvocationTargetException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
