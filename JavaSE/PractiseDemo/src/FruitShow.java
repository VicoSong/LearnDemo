import java.awt.Container;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
public class FruitShow extends JFrame implements ItemListener{
	JRadioButton button1,button2,button3;
	ButtonGroup bg;
	JPanel panel;
	JScrollPane scroll;
	JLabel label,label1;
	JSplitPane splitpane;
	public FruitShow(){
		//窗体设计
		super("水果选择");
		setBounds(100,100,300,200);
		setVisible(true);
	//	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container c=getContentPane();
		ArrayList list=new ArrayList<String>();
		list.add("香蕉");
		list.add("葡萄");
		list.add("西瓜");
		//设置组件
		button1=new JRadioButton((String)list.get(0));
		button2=new JRadioButton((String)list.get(1));
		button3=new JRadioButton((String)list.get(2));
		panel=new JPanel();
		bg=new ButtonGroup();
		label1=new JLabel(new ImageIcon("Images/116.jpg"));
		bg.add(button1);
		bg.add(button2);
		bg.add(button3);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(label1);
		//显示图片面板
		label=new JLabel();
		scroll=new JScrollPane(label);
		//向事件源加监听器
		button1.addItemListener(this);
		button2.addItemListener(this);
		button3.addItemListener(this);
		splitpane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,panel,scroll);
		c.add(splitpane);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItemSelectable()==button1)
		{
			ImageIcon icon=new ImageIcon("Images/100.jpg");
			label.setIcon(icon);
		}
		if(e.getItemSelectable()==button2)
		{
			ImageIcon icon=new ImageIcon("Images/101.jpg");
			label.setIcon(icon);
		}
		if(e.getItemSelectable()==button3)
		{
			ImageIcon  icon=new ImageIcon("Images/102.jpg");
			label.setIcon(icon);
		}
	}
	public static void main(String args[])
	{
		new FruitShow();
	}
}
