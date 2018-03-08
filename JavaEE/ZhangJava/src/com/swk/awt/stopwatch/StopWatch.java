package com.swk.awt.stopwatch;

import java.awt.AWTEvent;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StopWatch extends Canvas implements Runnable{
	private long startTime =0;
	private long endTime =0;
	private boolean isStart =false;
	
	public StopWatch()
	{
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		
	}
	
	protected void  processMouseEvent(MouseEvent e) 
	{
		if(e.getID()==MouseEvent.MOUSE_PRESSED)
		{
			startTime = endTime =System.currentTimeMillis();
			repaint();
			isStart=true;
			new Thread(this).start();
		}
		
		if(e.getID() == MouseEvent.MOUSE_RELEASED)
		{
			endTime =System.currentTimeMillis();
			repaint();
			isStart =false;
		}
		
	}
	
	
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");
		Date elapsedTime = null;
		try {
			
			elapsedTime = (Date) sdf.parse("00:00:00");
			elapsedTime.setTime(elapsedTime.getTime()+endTime-startTime);
			String timeStr =sdf.format(elapsedTime);
			g.fill3DRect(50, 50, 224, 60, true);
			g.setFont(new Font("宋体",Font.BOLD,24));
			g.setColor(Color.WHITE);
			g.drawString(timeStr, 90, 90);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (isStart) 
			{
				Thread.sleep(1000);
				endTime =System.currentTimeMillis();
				repaint();
				
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
