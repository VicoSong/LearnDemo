package com.calculator;
import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame{
	Calculator(){
		//���ô�������
		super("������");
		setBounds(200,200,221,242);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		//�����������
		Container c=getContentPane();
		//�����������ʾ���
		JPanel viewPanel=new JPanel();
		JTextField showField=new JTextField("0",18);
		showField.setEditable(false);
		showField.setHorizontalAlignment(SwingConstants.RIGHT);
		viewPanel.add(showField);
		c.add(viewPanel,BorderLayout.NORTH);
		//���幦�����
		JPanel functionPanel=new JPanel();
		functionPanel.setLayout(new GridLayout(1,0));
		String[] functionButtonName={"��","CE","C"};
		for(int i=0;i<functionButtonName.length;i++)
		{
			JButton functionButton=new JButton(functionButtonName[i]);
			functionPanel.add(functionButton);
		}
		c.add(functionPanel,BorderLayout.CENTER);
		//�����������
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



	