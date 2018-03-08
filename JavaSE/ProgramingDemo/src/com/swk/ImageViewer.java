package com.swk;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * 一个看图软件
 * @version 12.10 2015.05.23
 * @author 宋维康
 */
public class ImageViewer {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() 
			{
				ImageViewerFrame imageView=new ImageViewerFrame();
				imageView.setVisible(true);
				
			}
		});
	}
}
/**
 * 看图软件界面
 * */
class ImageViewerFrame extends JFrame implements ActionListener{
	private int WIDTH=600;
	private int HEIGHT=480;
	private	JLabel show_label;
	private JPanel contentPane;
	private JPanel showPane;
	private JPanel functiontPane;
    private JFileChooser image_choser;
	private JMenuBar menubar;
	private JMenu file_menu;
	private	JMenuItem open_item;
	private	JMenuItem exit_item;
	private JButton first_button;
	private JButton next_button;
	private JButton previous_button;
	private JButton last_button;
	private  CardLayout card;
	ImageViewerFrame()
	{
		//定义窗口属性
		super("看图软件");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		contentPane=new JPanel();
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		//定义显示标签
		show_label=new JLabel();
		showPane=new JPanel();
		CardLayout card=new CardLayout();
		showPane.setLayout(card);
		showPane.add(show_label);
		contentPane.add(show_label,BorderLayout.CENTER);
		
		//定义功能面板
		functiontPane=new JPanel();
		functiontPane.setLayout(new GridLayout(1, 0));
		first_button=new JButton("第一张");
		next_button=new JButton("下一张");
		previous_button=new JButton("上一张");
		last_button=new JButton("最后一张");
		functiontPane.add(first_button);
		functiontPane.add(next_button);
		functiontPane.add(previous_button);
		functiontPane.add(last_button);
		contentPane.add(functiontPane,BorderLayout.SOUTH);
		
		//为按钮注册监听器
		first_button.addActionListener(this);
		next_button.addActionListener(this);
		previous_button.addActionListener(this);
		last_button.addActionListener(this);
		//设置文件选择器
		File image_file=new File("E:\\屏幕保护照片");
		image_choser=new JFileChooser(image_file);
		
		//设置菜单
		menubar=new JMenuBar();
		contentPane.add(menubar,BorderLayout.NORTH);
		file_menu=new JMenu("文件");
		menubar.add(file_menu);
		open_item=new JMenuItem("打开");
		exit_item=new JMenuItem("退出");
		file_menu.add(open_item);
		file_menu.add(exit_item);
		//打开事件处理
		open_item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result=image_choser.showOpenDialog(null);
				if(result==JFileChooser.APPROVE_OPTION)
				{
					
					String name=image_choser.getSelectedFile().getPath();
					ImageIcon icon=new ImageIcon(name);
					
					show_label.setIcon(icon);
					
				}
			}
		});
		//关闭事件处理
		exit_item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	//按钮事件处理,未实现
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==first_button)
		{
			
			
		}
		
		if(e.getSource()==next_button)
		{
			
		}
		
		if(e.getSource()==previous_button)
		{
			
		}
		
		if(e.getSource()==last_button)
		{
			
		}
	}
}
 