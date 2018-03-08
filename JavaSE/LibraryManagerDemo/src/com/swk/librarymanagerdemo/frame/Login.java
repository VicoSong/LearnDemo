package com.swk.librarymanagerdemo.frame;
/**
 * ��������¼���棬�������
 * @version 20.03 2015.08.29
 * @author ��ά��
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * �������һ��ϵͳ��¼����
 * ˼·�����裺
 * 1.���һ����̳�JFrame
 * 2.��Ƶ�¼�����ʾ������
 * 3.Ϊ������ܹ��������¼��İ�ť����¼�����
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
	 * ����ϵͳ.
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
		
		JLabel title_label = new JLabel("�û���¼");
		title_label.setFont(new Font("Ҷ����ë������2.0��", Font.PLAIN, 20));
		title_label.setBounds(121, 0, 86, 41);
		panel.add(title_label);
		
		JLabel userName_label = new JLabel("�û���");
		userName_label.setFont(new Font("����", Font.PLAIN, 16));
		userName_label.setBounds(36, 120, 66, 21);
		panel.add(userName_label);
		
		JLabel passwordLabel = new JLabel("����");
		passwordLabel.setFont(new Font("����", Font.PLAIN, 16));
		passwordLabel.setBounds(36, 163, 66, 21);
		panel.add(passwordLabel);
		
		userName_textField = new JTextField();
		userName_textField.setFont(new Font("����", Font.PLAIN, 16));
		userName_textField.setToolTipText("�������û���");
		userName_textField.setBounds(105, 119, 134, 21);
		panel.add(userName_textField);
		userName_textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("����������");
		passwordField.setBounds(104, 164, 135, 21);
		panel.add(passwordField);
		
		/*
		//��������򣬴������������¼�
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(final KeyEvent e)
			{
				if(e.getKeyCode()==10)
				{
					
				}
			}
		});
		*/
		
		
		JButton okButton = new JButton("ȷ��");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//�ж��û��������Ƿ���ȷ
					
					//�ж��û����Ƿ�Ϊ��
					if(userName_textField.getText()==null||userName_textField.getText().length()==0)
					{
						JOptionPane.showMessageDialog(null, "�û�������Ϊ��");
					
					}
					//�ж������Ƿ�Ϊ��
					if(passwordField.getText()==null||passwordField.getText().length()==0)
					{
					JOptionPane.showMessageDialog(null, "���벻��Ϊ��");
					}
		
				
				
				Operator operator=SQLMethod.loginCheck(userName_textField.getText(),passwordField.getText());
				//�ж��û����������Ƿ���ȷ
				if(!(userName_textField.getText().trim().equals(operator.getUserName().trim())))
				{
					if(!(passwordField.getText().trim().equals(operator.getUserPassword().trim())))
					{
						JOptionPane.showMessageDialog(null, ",�����������������");
						userName_textField.setText("");
						passwordField.setText("");
						
					}else
					{
						JOptionPane.showMessageDialog(null, "�����������������");
						userName_textField.setText("");
						passwordField.setText("");
						
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "������ȷ�����ڵ�½.....");
						
				}
				
				/*
				if(operator.getUserName()!=null&&operator.getUserName().length()!=0)
				{
					
						JOptionPane.showMessageDialog(null, "������ȷ�����ڵ�½.....");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "�������,����������");
					userName_textField.setText("");
					passwordField.setText("");
				}
				*/
			}
		});
		okButton.setBounds(45, 219, 93, 23);
		panel.add(okButton);
		
		JButton resetButton = new JButton("����");
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
