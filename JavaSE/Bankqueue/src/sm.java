import java.awt.*;
import javax.swing.*;
public class sm {
   private  JLabel jlb;
   private  JTextField jtf;
   private JRadioButton type1,type2;
   private JButton ok,cancel;
   private  Toolkit tool;
   private  Dimension WindowSize;
   public sm()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame();
	   frame.setTitle("��Ǯ");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Container content=frame.getContentPane();
	   content.setLayout(new GridLayout(3,2,10,10));
	   jlb=new JLabel("���");
	   ok=new JButton("ȷ��");
	   cancel=new JButton("ȡ��");
	   type1=new JRadioButton("����");
	   type2=new JRadioButton("����");
	   jtf=new JTextField();
	    ButtonGroup group=new ButtonGroup();
	    group.add(type1);
	    group.add(type2);
	    content.add(type1);
	    content.add(type2);
	    content.add(jlb);
	    content.add(jtf);
	    content.add(jlb);
	    content.add(ok);
	    content.add(cancel);
	    tool=frame.getToolkit();
		WindowSize=tool.getScreenSize();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
   public static void main(String args[])
   {
	   new sm();
   }
}
