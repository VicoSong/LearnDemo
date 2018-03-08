package com.swk.datatransform.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.BatchUpdateException;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument.Content;

public class DataTransformFrame extends JFrame{
    private JLabel partnumberLabel;
    private JLabel storehouseLabel;
    private JLabel cartonnumberLabel;
    private JLabel palletLabel;
    private JLabel  statusLabel;
    private JLabel snLabel;
    
    private JTextField partnumberTextField;
    private JTextField storehouseTextField;
    private JTextField cartonnumberTextField;
    private JTextField palletTextField;
    private JTextField  statusTextField;
    /*private JFileChooser snFileChooser;*/
    
    private JButton oKbButton;
    private JButton cancleButton;
    private JPanel mainPanel;
    public DataTransformFrame()
    {
	//设置窗体属性
	this.setTitle("数据转移");
	this.setBounds(400, 500, 600, 800);
	
	//设置面板属性
	JPanel contetnPanel= (JPanel)this.getContentPane();
	contetnPanel.setLayout(new BorderLayout(5, 5));
	
	mainPanel=new JPanel();
	contetnPanel.add(mainPanel,BorderLayout.CENTER);
	mainPanel.setLayout(new GridLayout(5,5));
	this.add(mainPanel);
	
	partnumberLabel=new JLabel("料号");
	partnumberLabel.setSize(150,60);
	partnumberTextField=new JTextField();
	partnumberTextField.setSize(150,60);
	
	storehouseLabel=new JLabel("储位");
	storehouseLabel.setSize(150,60);
	storehouseTextField=new JTextField();
	storehouseTextField.setSize(150,60);
	
	cartonnumberLabel=new  JLabel("箱号");
	cartonnumberLabel.setSize(150,60);
	String defaultCartonnumberString="PU"+String.valueOf(new Date().getDate())+partnumberTextField.getText();
	cartonnumberTextField=new JTextField(defaultCartonnumberString);
	cartonnumberTextField.setSize(150,60);
	
	palletLabel=new  JLabel("栈板号");
	palletLabel.setSize(150,60);
	String defaultPalletString="PU"+String.valueOf(new Date().getDate())+partnumberTextField.getText();
	palletTextField=new JTextField(defaultPalletString);
	palletTextField.setSize(150,60);
	
	statusLabel=new JLabel("状态");
	statusLabel.setSize(150,60);
	statusTextField=new JTextField("1");
	statusTextField.setSize(150,60);
	
	snLabel=new JLabel("导入sn");
	snLabel.setSize(150,60);
	/*snFileChooser=new  JFileChooser();
	snFileChooser.setSize(150,60);*/
	
	mainPanel.add(partnumberLabel);
	mainPanel.add(partnumberTextField);
	mainPanel.add(storehouseLabel);
	mainPanel.add(storehouseTextField);
	
	mainPanel.add(cartonnumberLabel);
	mainPanel.add(cartonnumberTextField);
	mainPanel.add(palletLabel);
	mainPanel.add(palletTextField);
	
	mainPanel.add(statusLabel);
	mainPanel.add(statusTextField);
	mainPanel.add(snLabel);
	/*mainPanel.add(snFileChooser);*/
	
	oKbButton=new JButton("确定");
	cancleButton=new JButton("重置");
	JPanel buttonPanel=new JPanel();
	contetnPanel.add(buttonPanel,BorderLayout.SOUTH);
	buttonPanel.setLayout(new GridLayout(1,2));
	buttonPanel.add(oKbButton);
	buttonPanel.add(cancleButton);
    }
    
}
