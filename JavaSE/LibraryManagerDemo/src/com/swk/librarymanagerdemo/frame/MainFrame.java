package com.swk.librarymanagerdemo.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.CardLayout;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\1183933.gif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
//		menuBar.setBounds(100,100, 800, 100);
		setJMenuBar(menuBar);
		
		JMenu basedDataMenu = new JMenu("\u57FA\u7840\u6570\u636E\u7EF4\u62A4");
		basedDataMenu.setFont(new Font("Ò¶¸ùÓÑÃ«±ÊÐÐÊé2.0°æ", Font.PLAIN, 20));
		menuBar.add(basedDataMenu);
		
		JMenu readerInfoMenu = new JMenu("\u8BFB\u8005\u4FE1\u606F\u7BA1\u7406");
		basedDataMenu.add(readerInfoMenu);
		
		JMenuItem readerInfoAddMenuItem = new JMenuItem("\u8BFB\u8005\u4FE1\u606F\u6DFB\u52A0");
		readerInfoMenu.add(readerInfoAddMenuItem);
		
		JMenuItem readerInfoUpdateMenuItem = new JMenuItem("\u8BFB\u8005\u4FE1\u606F\u4FEE\u6539");
		readerInfoMenu.add(readerInfoUpdateMenuItem);
		
		JMenu bookTypeMenu = new JMenu("\u56FE\u4E66\u7C7B\u522B\u7BA1\u7406");
		basedDataMenu.add(bookTypeMenu);
		
		JMenuItem bookTypeAddMenuItem = new JMenuItem("\u6DFB\u52A0\u56FE\u4E66\u7C7B\u522B");
		bookTypeMenu.add(bookTypeAddMenuItem);
		
		JMenuItem bookTypeUpdateMenuItem = new JMenuItem("\u4FEE\u6539\u56FE\u4E66\u7C7B\u522B");
		bookTypeMenu.add(bookTypeUpdateMenuItem);
		
		JMenu bookInfoMenu = new JMenu("\u56FE\u4E66\u4FE1\u606F\u7BA1\u7406");
		basedDataMenu.add(bookInfoMenu);
		
		JMenuItem bookInfoAddMenuItem = new JMenuItem("\u56FE\u4E66\u4FE1\u606F\u6DFB\u52A0");
		bookInfoMenu.add(bookInfoAddMenuItem);
		
		JMenuItem bookInfoUpdateMenuItem = new JMenuItem("\u56FE\u4E66\u4FE1\u606F\u4FEE\u6539");
		bookInfoMenu.add(bookInfoUpdateMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		basedDataMenu.add(exitMenuItem);
		
		JMenu bookOrderMenu = new JMenu("\u65B0\u4E66\u8BA2\u8D2D\u7BA1\u7406");
		bookOrderMenu.setFont(new Font("Ò¶¸ùÓÑÃ«±ÊÐÐÊé2.0°æ", Font.PLAIN, 20));
		menuBar.add(bookOrderMenu);
		
		JMenuItem bookOrderMenuItem = new JMenuItem("\u65B0\u4E66\u8BA2\u8D2D");
		bookOrderMenu.add(bookOrderMenuItem);
		
		JMenuItem menuItem = new JMenuItem("\u65B0\u4E66\u9A8C\u6536");
		bookOrderMenu.add(menuItem);
		
		JMenu lendMenu = new JMenu("\u501F\u9605\u7BA1\u7406");
		lendMenu.setFont(new Font("Ò¶¸ùÓÑÃ«±ÊÐÐÊé2.0°æ", Font.PLAIN, 20));
		menuBar.add(lendMenu);
		
		JMenuItem borrowMenuItem = new JMenuItem("\u56FE\u4E66\u501F\u9605");
		lendMenu.add(borrowMenuItem);
		
		JMenuItem returnMenuItem = new JMenuItem("\u56FE\u4E66\u5F52\u8FD8");
		lendMenu.add(returnMenuItem);
		
		JMenuItem searchMenuItem = new JMenuItem("\u56FE\u4E66\u641C\u7D22");
		lendMenu.add(searchMenuItem);
		
		JMenu systemMenu = new JMenu("\u7CFB\u7EDF\u7EF4\u62A4");
		systemMenu.setFont(new Font("Ò¶¸ùÓÑÃ«±ÊÐÐÊé2.0°æ", Font.PLAIN, 20));
		menuBar.add(systemMenu);
		
		JMenuItem modifiedPasswordMenuItem = new JMenuItem("\u66F4\u6539\u53E3\u4EE4");
		systemMenu.add(modifiedPasswordMenuItem);
		
		JMenu userManagerMenu = new JMenu("\u7528\u6237\u7BA1\u7406");
		systemMenu.add(userManagerMenu);
		
		JMenuItem userAddMenuItem = new JMenuItem("\u6DFB\u52A0\u7528\u6237");
		userManagerMenu.add(userAddMenuItem);
		
		JMenuItem userUpdateMenuItem = new JMenuItem("\u4FEE\u6539\u7528\u6237");
		userManagerMenu.add(userUpdateMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel menuPane = new JPanel();
		menuPane.setBounds(5, 5, 774, 526);
		menuPane.setToolTipText("\u56FE\u4E66\u4FE1\u606F\u4FEE\u6539");
		contentPane.add(menuPane);
		menuPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 774, 37);
		menuPane.add(toolBar);
		
		JButton bookAddButton = new JButton("");
		bookAddButton.setToolTipText("\u6DFB\u52A0\u56FE\u4E66");
		bookAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bookAddButton.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\bookAddtb.jpg"));
		toolBar.add(bookAddButton);
		
		JButton bookInfoUpdateButton = new JButton("");
		bookInfoUpdateButton.setToolTipText("\u56FE\u4E66\u4FE1\u606F\u4FEE\u6539");
		bookInfoUpdateButton.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\bookModiAndDeltb.jpg"));
		toolBar.add(bookInfoUpdateButton);
		
		JButton bookTypeAddButton = new JButton("");
		bookTypeAddButton.setToolTipText("\u56FE\u4E66\u7C7B\u522B\u6DFB\u52A0");
		toolBar.add(bookTypeAddButton);
		
		JButton bookBorrowButton = new JButton("");
		bookBorrowButton.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\bookBorrowtb.jpg"));
		bookBorrowButton.setToolTipText("\u56FE\u4E66\u501F\u9605");
		toolBar.add(bookBorrowButton);
		
		JButton bookOrderButton = new JButton("");
		bookOrderButton.setToolTipText("\u56FE\u4E66\u8BA2\u8D2D");
		bookOrderButton.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\bookOrdertb.jpg"));
		toolBar.add(bookOrderButton);
		
		JButton bookChechButton = new JButton("");
		bookChechButton.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\newbookChecktb.jpg"));
		bookChechButton.setToolTipText("\u65B0\u4E66\u9A8C\u6536");
		toolBar.add(bookChechButton);
		
		JButton readerAddButton = new JButton("");
		readerAddButton.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\readerAddtb.jpg"));
		readerAddButton.setToolTipText("\u6DFB\u52A0\u8BFB\u8005\u4FE1\u606F");
		toolBar.add(readerAddButton);
		
		JButton readerUpdateButton = new JButton("");
		readerUpdateButton.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\readerModiAndDeltb.jpg"));
		readerUpdateButton.setToolTipText("\u7528\u6237\u4FE1\u606F\u4FEE\u6539");
		toolBar.add(readerUpdateButton);
		
		JButton exitButton = new JButton("");
		exitButton.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\exittb.jpg"));
		exitButton.setToolTipText("\u9000\u51FA\u7CFB\u7EDF");
		toolBar.add(exitButton);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setLocation(0, 37);
		backgroundLabel.setSize(774,479);
		backgroundLabel.setVerticalAlignment(SwingConstants.TOP);
		menuPane.add(backgroundLabel);
		backgroundLabel.setIcon(new ImageIcon("D:\\Rescourse\\Java\\LibraryManagerDemo\\image\\bg.jpg"));
	}
}
