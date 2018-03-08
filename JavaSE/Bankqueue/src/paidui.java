import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class paidui extends JFrame 
{ 
   private  JLabel JLb1,JLb2,JLb3,JLb4,JLb5,JLb6;
   private  JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
	private JFrame frame;
	public paidui()
	{
	   JFrame.setDefaultLookAndFeelDecorated(true);
	   frame=new JFrame("排队");
	   
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content=frame.getContentPane();
		content.setLayout(new GridLayout(6,2,10,10));
	     JLb1=new JLabel("A窗口正在服务:");
         jtf1=new JTextField("30号");
         JLb2=new JLabel("B窗口正在服务:");
         jtf2=new JTextField("31号");
         JLb3=new JLabel("你的排队号是:");
         jtf3=new JTextField("40");
         JLb4=new JLabel("排在你前面的人数:");
         jtf4=new JTextField("9");
         JLb5=new JLabel("排队总人数:");
         jtf5=new JTextField("60");
         JLb6=new JLabel("请耐心等待！");
		content.add(JLb1);
		content.add(jtf1);
		content.add(JLb2);
		content.add(jtf2);
		content.add(JLb3);
		content.add(jtf3);
		content.add(JLb4);
		content.add(jtf4);
		content.add(JLb5);
		content.add(jtf5);
		content.add(JLb6);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
			public static void main(String args[])
			{
				new paidui();
			}
}