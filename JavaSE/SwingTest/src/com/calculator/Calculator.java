package com.calculator;
import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame{
	Calculator(){
		//设置窗体属性
		super("计算器");
		setBounds(200,200,221,242);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		//设置面板属性
		Container c=getContentPane();
		//定义计算器显示面板
		JPanel viewPanel=new JPanel();
		JTextField showField=new JTextField("0",18);
		showField.setEditable(false);
		showField.setHorizontalAlignment(SwingConstants.RIGHT);
		viewPanel.add(showField);
		c.add(viewPanel,BorderLayout.NORTH);
		//定义功能面板
		JPanel functionPanel=new JPanel();
		functionPanel.setLayout(new GridLayout(1,0));
		String[] functionButtonName={"←","CE","C"};
		for(int i=0;i<functionButtonName.length;i++)
		{
			JButton functionButton=new JButton(functionButtonName[i]);
			functionPanel.add(functionButton);
		}
		c.add(functionPanel,BorderLayout.CENTER);
		//定义数字面板
		JPanel numberPanel=new JPanel(new GridLayout(4,4));
		String[][] numberName={{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","*"},{".","0","=","/"}};
		for(int row=0;row<numberName.length;row++)
		{
			for(int col=0;col<numberName[row].length;col++)
			{
				JButton numberButton=new JButton(numberName[row][col]);
				numberPanel.add(numberButton);
			}
		}
		c.add(numberPanel,BorderLayout.SOUTH);
	}
	public static void main(String args[])
	{
		new Calculator();
	}
}



	