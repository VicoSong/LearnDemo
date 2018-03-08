import java.awt.*;
import javax.swing.*;
public class userupdate {
	   private  JLabel jlb1,jlb2,jlb3,jlb4;
	   private  JTextField jtf2,jtf3,jtf4;
	   private JButton ok,cancel;
	   private  Choice c;
	   private JRadioButton type1,type2;
	   private  Toolkit tool;
	   private  Dimension WindowSize;
	   public userupdate()
		{
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame frame=new JFrame();
		   frame.setTitle("添加用户");
		//   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   Container content=frame.getContentPane();
		   content.setLayout(new GridLayout(5,2,10,10));
		   jlb1=new JLabel("修改项目");
		   c=new Choice();
		   c.addItem("用户名");
		   c.addItem("登录名");
		   c.addItem("密码");
		   c.addItem("权限");
		   
		   jlb2=new JLabel("原值");
		   jtf2=new JTextField();
		   jlb3=new JLabel("新值");
		   jtf3=new JTextField();
		   jlb4=new JLabel("确认新值");
		   jtf4=new JTextField();
		   ok=new JButton("确定");
		   cancel=new JButton("取消");
		    content.add(jlb1);
		    content.add(c);
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
		   new userupdate();
	   }
	}