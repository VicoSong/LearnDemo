import javax.swing.*;

import java.awt.*;

import javax.swing.event.*;
import java.awt.event.*;
public class Bmainframe implements ActionListener
{
	private  JMenuBar jMenuBar=new JMenuBar();
	//系统管理
	private JMenu Queueinfo=new JMenu("排队情况");
	public JMenuItem queueinfo=new JMenuItem("排队信息");
	public JMenu Systemmanage=new JMenu("系统管理");
	public JMenuItem Personalinfo=new JMenuItem("个人信息");
	public JMenuItem Systemexit=new JMenuItem("退出系统");
	private JMenu Bussinesshangding=new JMenu("业务办理");
	public JMenuItem Savemoney=new JMenuItem("存钱");
	public JMenuItem Drawmoney=new JMenuItem("取钱");
	public JMenuItem Bankcard=new JMenuItem("办卡");
	private  JLabel Jlb;
	private  Toolkit tool;
	private  Dimension WindowSize;
	public Bmainframe()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame();
	   frame.setTitle("主窗体");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Container content=frame.getContentPane();
	   content.setLayout(new BorderLayout());
	  tool=frame.getToolkit();
	  WindowSize=tool.getScreenSize();
	  
	 //构造菜单
	  Queueinfo.add(queueinfo);
	  Systemmanage.add(Personalinfo);
	  Systemmanage.add(Systemexit);
	  Bussinesshangding.add(Savemoney);
	  Bussinesshangding.add(Drawmoney);
	  Bussinesshangding.add(Bankcard);
	  
	  Personalinfo.addActionListener(this);
	  Systemexit.addActionListener(this);
	  Savemoney.addActionListener(this);
	  Drawmoney.addActionListener(this);
	  Bankcard.addActionListener(this);
	  queueinfo.addActionListener(this);
	  //快捷键
	  Personalinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
	  Systemexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.ALT_MASK));
	  Savemoney.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.ALT_MASK));
	  Drawmoney.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.ALT_MASK));
	  Bankcard.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.ALT_MASK));
	  queueinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
	
	 //菜单添加到菜单栏
	 jMenuBar.add(Queueinfo);
	 jMenuBar.add(Systemmanage);
	 jMenuBar.add(Bussinesshangding);
      frame.setJMenuBar(jMenuBar);
      Jlb=new JLabel(new ImageIcon("D:/Rescourse/Java/Bankqueue/src/background.jpg"));
 	  Jlb.setBorder(BorderFactory.createLoweredBevelBorder());
 	 content.add(Jlb,BorderLayout.CENTER);
	 frame.setSize(WindowSize);
	 frame.setLocationRelativeTo(null);
	 frame.setVisible(true);
	// frame.dispose();
	 
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
	  if(obj==Systemexit)
	 {
		  new se();  //修改密码
	 }
	 else if(obj==Savemoney|obj==Drawmoney)
	 {
		 new  sid();
	 }
	 else if(obj==Bankcard)
	 {
		 new banka();
	 }
	 else if(obj==queueinfo)
	 {
		 new paidui();
	 }

	}
	public static void main(String[]args)
	{
		new Bmainframe();
	}
}