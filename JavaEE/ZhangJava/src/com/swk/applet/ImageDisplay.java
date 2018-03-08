package com.swk.applet;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class ImageDisplay extends Applet implements Runnable{
	
	
	private static final long serialVersionUID = 1L;
	int index = 0; 
	Image[] imgs =new Image[10];
	
	@Override
	public void init()
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++)
		{
			 imgs[i] =getToolkit().getImage(getCodeBase()+"imgs\\"+(i+1)+".jpg");
			 
			
		}
		new Thread(this).start();
	}
	
	@Override
	public void paint(Graphics g)
	{
		// TODO Auto-generated method stub
		g.drawImage(imgs[index], 0, 0, this);
		g.setFont(new Font(null, Font.ITALIC|Font.BOLD, 30));
		g.drawString(index+"", 0, 60);
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		try
		{
			Thread.sleep(100);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		index = (index+1)%10;
		repaint();
		
	}
	
}
