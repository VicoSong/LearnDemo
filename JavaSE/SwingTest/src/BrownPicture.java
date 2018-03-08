import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;
public class BrownPicture extends JFrame{
	public BrownPicture(){
		//设置面板属性
		super();
		setTitle("BrownPicture");
		setBounds(100,100,300,200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		//定义分割面板
		JSplitPane splitPane=new JSplitPane();
		splitPane.setDividerLocation(100);
	    getContentPane().add(splitPane,BorderLayout.CENTER);
	    JPanel optionPane=new JPanel();
	    JButton first_button=new JButton("第一张");
	    JButton previous_button=new JButton("上一张");
	    JButton next_button=new JButton("下一张");
	    JButton last_button=new JButton("最后一张");
	    optionPane.setLayout(new GridLayout(0,1));
	    optionPane.add(first_button);
	    optionPane.add(previous_button);
	    optionPane.add(next_button);
	    optionPane.add(last_button);
	    JPanel showPane=new JPanel();
	    showPane.setLayout(new CardLayout());
	    JLabel showPicture_label=new JLabel();
	    //
	    	
	    	showPicture_label.setIcon();
	    	
	    
	   
	    splitPane.setLeftComponent(optionPane);
	    splitPane.setRightComponent(showPane);
	    
		
	}
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					new BrownPicture();
				}catch(Exception e)
				{
					e.getMessage();
				}
			}
		});
	}
	
}
