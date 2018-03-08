import java.awt.*;
import javax.swing.*;
public class dm {
   private  JLabel jlb;
   private  JTextField jtf;
   private JButton ok,cancel;
   private  Toolkit tool;
   private  Dimension WindowSize;
   public dm()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame();
	   frame.setTitle("取钱");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Container content=frame.getContentPane();
	   content.setLayout(new GridLayout(3,2,10,10));
	   tool=frame.getToolkit();
	   WindowSize=tool.getScreenSize();
	   jlb=new JLabel("金额");
	   ok=new JButton("确定");
	   cancel=new JButton("取消");
	  
	   jtf=new JTextField();
	    ButtonGroup group=new ButtonGroup();
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
		// frame.dispose();
	}
   public static void main(String args[])
   {
	   new dm();
   }
}
