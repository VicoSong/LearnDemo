import java.awt.*;
import javax.swing.*;
public class useradd {
	   private  JLabel jlb1,jlb2,jlb3;
	   private  JTextField jtf1,jtf2,jtf3;
	   private JButton ok,cancel;
	   private JRadioButton type1,type2;
	   private  Toolkit tool;
	   private  Dimension WindowSize;
	   public useradd()
		{
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame frame=new JFrame();
		   frame.setTitle("����û�");
		//   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   Container content=frame.getContentPane();
		   content.setLayout(new GridLayout(5,2,10,10));
		   jlb1=new JLabel("�û�����");
		   jtf1=new JTextField();
		   jlb2=new JLabel("��¼��");
		   jtf2=new JTextField();
		   jlb3=new JLabel("����");
		   jtf3=new JTextField();
		   type1=new JRadioButton("��ͨ�û�");
		   type2=new JRadioButton("����Ա");
		   ButtonGroup group=new ButtonGroup();
		   group.add(type1);
		   group.add(type2);
		   ok=new JButton("ȷ��");
		   cancel=new JButton("ȡ��");
		    content.add(type1);
		    content.add(type2);
		    content.add(jlb1);
		    content.add(jtf1);
		    content.add(jlb2);
		    content.add(jtf2);
		    content.add(jlb3);
		    content.add(jtf3);
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
		   new useradd();
	   }
	}