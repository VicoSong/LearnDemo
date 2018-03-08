package com.calculator;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
public class Accutron extends JFrame implements Runnable{
	JLabel label;
	public Accutron(){
		//��������
		super("���ֵ��ӱ�");
		setBounds(100,100,196,115);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);
	//	setTitle("");
		//��ǩ
		label=new JLabel();
		label.setFont(new Font("΢���ź�",Font.BOLD,24));
		label.setForeground(Color.YELLOW);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon=new ImageIcon("Images/116.jpg");
		label.setIcon(icon);
		//��ӱ�ǩ������
		getContentPane().add(label);
	}
	public void run()
	{
		while(true)
		{
			Long timeMillis=System.currentTimeMillis();
			Date date=new Date(timeMillis);
			String timeStr=String.format("%tH:%tM:%tS %tp",date,date,date,date);
			label.setText(timeStr);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}	
		}
	}
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable(){
			public void run()
			{
				try{
				Accutron frame=new Accutron();
				frame.setVisible(true);
				new Thread(frame).start();
				}catch(Exception e){
				e.printStackTrace();
				}
			}
		});
	}
}
