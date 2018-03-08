package com.swk.awt.stopwatch;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class StopWatchMainFram extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6204489305763965796L;

	public StopWatchMainFram() 
	{
		this.add(new StopWatch());
		addWindowListener(new WindowAdapter() 
		{

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				dispose();
				System.exit(0);
				
			}
			
		});
	}
	
	public static void main(String[] args) 
	{
		StopWatchMainFram frame = new StopWatchMainFram();
		frame.setVisible(true);
		frame.setBounds(420, 280, 320, 240);
	}
	
}
