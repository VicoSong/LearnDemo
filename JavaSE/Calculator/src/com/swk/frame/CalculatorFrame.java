package com.swk.frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.swk.function.CalculatorFunction;

/**
 * CalculatorFrame类：用来显示计算器界面
 * @author Administrator
 * @version 20151019
 * 
 * */
/*
 * 思路及步骤：
 * 1.定义数组用于存放计算器界面上的操作符
 * 2.定义计算器初始化界面
 * 3.定义获取事件监听器的方法
 * 4.定义初始化输入框方法
 * 5.定义获取计算器存储操作键的方法
 * 6.定义获取计算器结果操作键的方法
 * 7.定义获取计算器运算操作键的方法
 * */
public class CalculatorFrame extends JFrame{
	//显示计算结果的TextField
	private JTextField resultShowTextField; 
	//用一个数组保存MC、MR、MS、M+操作符
	String[] memeryOperator ={"MC","MR","MS","M+"};
	//用数组保存结果操作符
	String[] resultOperator={"←","CE","C"};
	//用数组保存数字与运算操作符
	String[] numberOperator={"7","8","9","/","x²",
							 "4","5","6","*","%",
							 "1","2","3","-","1/x",
							 "0","+/-",".","+","="};
	private JButton button;
	private CalculatorFunction function =new CalculatorFunction();
	private ActionListener actionListener;
	//定义面板的宽和高
	private final int WIDTH=360;
	private final int HEIGHT=250;
	
	/**
	 * 默认构造器
	 * */
	public CalculatorFrame()
	{
		super();
		initialize();
	}
	
	/**
	 * initialize:初始化界面
	 * return void 
	 * */
	public void initialize()
	{
		this.setTitle("计算器");
		this.setResizable(false);
		JPanel mainPanel=new JPanel();
		mainPanel.setLayout(new BorderLayout(10,1));
		mainPanel.add(getTextField(),BorderLayout.NORTH);
		mainPanel.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		JButton[] memberyButton=getMemberyButton();
		JPanel buttomPanel=new JPanel();
		buttomPanel.setLayout(new GridLayout(5,1,0,5));
		for(JButton b:memberyButton)
		{
			buttomPanel.add(b);
		}
		JButton[] resultButton=this.getResultButton();
		JPanel resultPanel=new JPanel();
		resultPanel.setLayout(new BorderLayout(1,5));
		JPanel resultButtonPanel=new JPanel();
		resultButtonPanel.setLayout(new GridLayout(1, 3,3,3));
		for(JButton b:resultButton)
		{
			resultButtonPanel.add(b);
		}
		JButton[] numberButton=getNumberButton();
		JPanel numberPanel=new JPanel();
		numberPanel.setLayout(new GridLayout(4,5,3,5));
		for(JButton b:numberButton)
		{
			numberPanel.add(b);
		}
		resultPanel.add(resultButtonPanel,BorderLayout.NORTH);
		resultPanel.add(numberPanel,BorderLayout.CENTER);
		mainPanel.add(buttomPanel,BorderLayout.WEST);
		mainPanel.add(resultPanel,BorderLayout.CENTER);
		this.add(mainPanel);
		
	}
	
	
	/**
	 * getTextField:用于初始化输入框
	 * return JTextField
	 * 
	 * */
	private JTextField getTextField()
	{
		if(resultShowTextField==null)
		{
			resultShowTextField=new JTextField("0");
			resultShowTextField.setEditable(false);
			resultShowTextField.setBackground(Color.WHITE);
		
		}
		return resultShowTextField;
	}
	
	
	/**
	 * getButton:获取按钮
	 * return JButton
	 * 
	 * */
	private JButton getButton()
	{
		if(button==null)
		{
			button=new JButton();
		}
		return button;
	}
	

	
	/**
	 * getActionListener:获取事件监听器
	 * return ActionListener
	 * 
	 * */
	public ActionListener getActionListener()
	{
		if(actionListener==null)
		{
			actionListener=new ActionListener()
			{
				public void actionPerformed(ActionEvent e) 
				{
					String cmd=e.getActionCommand();
					String result=null;
					try {
						result=function.callMethod(cmd,resultShowTextField.getText());
					} catch (Exception e2)
					{
						System.out.println(e2.getMessage());
					}
					if(cmd.indexOf("MC")==0)
					{
						button.setText("");
					}else if(cmd.indexOf("M")==0 && function.getScore()>0)
					{
						button.setText("M");
					}
					
					if(result!=null)
					{
						resultShowTextField.setText(result);
					}
				}
			};
		}
		return actionListener;
	}
	
	
	/**
	 * getMemberyButton:获得计算器的存储操作键
	 * return JButton类型的数组
	 * 
	 * */
	private JButton[] getMemberyButton()
	{
		JButton[] result=new JButton[memeryOperator.length+1];
		result[0]=getButton();
		for(int i=0;i<this.memeryOperator.length;i++)
		{
			JButton jbt=new JButton(this.memeryOperator[i]);
			jbt.addActionListener(getActionListener());
			jbt.setForeground(Color.RED);
			result[i+1]=jbt;
		}
		return result;
	}
	
	/**
	 * getResultButton:获取计算器结果的操作键
	 * @return JButton类型的数组
	 * 
	 * */
	private JButton[] getResultButton()
	{
		JButton[] result=new JButton[resultOperator.length];
		for(int i=0;i<resultOperator.length;i++)
		{
			JButton jbt=new JButton(resultOperator[i]);
			jbt.addActionListener(getActionListener());
			jbt.setForeground(Color.RED);
			result[i]=jbt;
		}
		return result;
	}
	
	/**
	 * getNumberButton:
	 * @return JButton类型的数组
	 * 
	 * */
	private JButton[] getNumberButton()
	{
		String[] redButton={"/","*","-","+","="};
		JButton[] resultButton=new JButton[numberOperator.length];
		for(int i=0;i<numberOperator.length;i++)
		{
			JButton jbt=new JButton(numberOperator[i]);
			jbt.addActionListener(getActionListener());
			Arrays.sort(redButton);
			if(Arrays.binarySearch(redButton, numberOperator[i])>=0)
			{
				jbt.setForeground(Color.RED);
				
			}else{
				jbt.setForeground(Color.BLUE);
			}
			resultButton[i]=jbt;
		}
		return resultButton;
	}
}
