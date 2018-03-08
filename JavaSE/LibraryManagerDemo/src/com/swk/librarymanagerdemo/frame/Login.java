package com.swk.librarymanagerdemo.frame;
/**
 * 描述：登录界面，程序入口
 * @version 20.03 2015.08.29
 * @author 宋维康
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * 需求：设计一个系统登录界面
 * 思路、步骤：
 * 1.设计一个类继承JFrame
 * 2.设计登录面板显示的内容
 * 3.为面板中能够出触发事件的按钮添加事件处理
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.swk.librarymanagerdemo.dao.SQLMethod;
import com.swk.librarymanagerdemo.model.Operator;


import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userName_textField;
	private JPasswordField passwordField;

	/**
	 * 登入系统.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 352, 252);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel title_label = new JLabel("用户登录");
		title_label.setFont(new Font("叶根友毛笔行书2.0版", Font.PLAIN, 20));
		title_label.setBounds(121, 0, 86, 41);
		panel.add(title_label);
		
		JLabel userName_label = new JLabel("用户名");
		userName_label.setFont(new Font("宋体", Font.PLAIN, 16));
		userName_label.setBounds(36, 120, 66, 21);
		panel.add(userName_label);
		
		JLabel passwordLabel = new JLabel("密码");
		passwordLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		passwordLabel.setBounds(36, 163, 66, 21);
		panel.add(passwordLabel);
		
		userName_textField = new JTextField();
		userName_textField.setFont(new Font("宋体", Font.PLAIN, 16));
		userName_textField.setToolTipText("请输入用户名");
		userName_textField.setBounds(105, 119, 134, 21);
		panel.add(userName_textField);
		userName_textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("请输入密码");
		passwordField.setBounds(104, 164, 135, 21);
		panel.add(passwordField);
		
		/*
		//监听密码框，处理密码框键盘事件
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e)
			{
				if(e.getKeyCode()==10)
				{
					
				}
			}
		});
		*/
		
		
		JButton okButton = new JButton("确定");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//判断用户名输入是否正确
					
					//判断用户名是否为空
					if(userName_textField.getText()==null||userName_textField.getText().length()==0)
					{
						JOptionPane.showMessageDialog(null, "用户名不能为空");
					
					}
					//判断密码是否为空
					if(passwordField.getText()==null||passwordField.getText().length()==0)
					{
					JOptionPane.showMessageDialog(null, "密码不能为空");
					}
		
				
				
				Operator operator=SQLMethod.loginCheck(userName_textField.getText(),passwordField.getText());
				//判断用户名和密码是否正确
				if(!(userName_textField.getText().trim().equals(operator.getUserName().trim())))
				{
					if(!(passwordField.getText().trim().equals(operator.getUserPassword().trim())))
					{
						JOptionPane.showMessageDialog(null, ",输入错误，请重新输入");
						userName_textField.setText("");
						passwordField.setText("");
						
					}else
					{
						JOptionPane.showMessageDialog(null, "输入错误，请重新输入");
						userName_textField.setText("");
						passwordField.setText("");
						
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "输入正确，正在登陆.....");
						
				}
				
				/*
				if(operator.getUserName()!=null&&operator.getUserName().length()!=0)
				{
					
						JOptionPane.showMessageDialog(null, "输入正确，正在登陆.....");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "输入错误,请重新输入");
					userName_textField.setText("");
					passwordField.setText("");
				}
				*/
			}
		});
		okButton.setBounds(45, 219, 93, 23);
		panel.add(okButton);
		
		JButton resetButton = new JButton("重置");
		resetButton.setBounds(158, 219, 93, 23);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				userName_textField.setText("");
				passwordField.setText("");
			}
		});
		panel.add(resetButton);
		
		JLabel backgroud_label = new JLabel("");
		backgroud_label.setBounds(-11, 40, 389, 220);
		panel.add(backgroud_label);
		backgroud_label.setHorizontalAlignment(SwingConstants.CENTER);
		backgroud_label.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\a2.jpg"));
		
	}
	
	
	private static Operator user;
	public static Operator getUser() {
		return user;
	}
	public static void setUser(Operator user) {
		Login.user = user;
	}
}
