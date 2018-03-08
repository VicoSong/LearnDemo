import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class MainFrame implements ActionListener
{
	private  JMenuBar jMenuBar=new JMenuBar();
	//系统管理
	private JMenu SystemManege=new JMenu("系统管理");
	public JMenuItem UpdatePassword=new JMenuItem("修改密码");
	public JMenuItem SystemExit=new JMenuItem("系统退出");
	private JMenu UserManage=new JMenu("用户管理");//用户管理
	public JMenuItem Useradd=new JMenuItem("添加用户");
	public JMenuItem Userupdate=new JMenuItem("修改用户");
	public JMenuItem Userdelete=new JMenuItem("删除用户");
	   //添加
	   
	   //基本信息管理
	private JMenu BasicInfo=new JMenu("基本信息");       //基本信息
	private JMenu EquipementInfo=new JMenu("履历表");  //履历表
	private JMenu EquipementUseHelp=new JMenu("使用帮助");//使用帮助
	public JMenuItem EquipementInfoLook=new JMenuItem("查看设备信息");
	public JMenuItem EquipementInfoDelet=new JMenuItem("删除设备信息");
	public JMenuItem EquipementInfoAdd=new JMenuItem("添加设备信息");
	   //使用帮助二级菜单
	public JMenuItem EquipementUseHelpLook=new JMenuItem("查看设备使用帮助");
	public JMenuItem EquipementUseHelpDelet=new JMenuItem("删除设备使用帮助");
	   //设备管理
	private JMenu     EquipementManagement=new JMenu("设备管理");//设备管理
	private JMenu 	  UseManagement=new JMenu("使用管理"); //使用管理
	private JMenu    MaintanceRecord=new JMenu("保养维修记录");//维修保养记录
	private JMenu   UPdateManagement=new JMenu("改造更新");//改造更新
		//使用管理二级菜单
	public JMenuItem  UseManagementLook=new JMenuItem("查看使用计划");
	public JMenuItem  UseManagementUpdate=new JMenuItem("更新使用计划");
		//维修保养记录二级菜单
	public JMenuItem  MaintanceRecordLook=new JMenuItem("查看维修记录");
	public JMenuItem  MaintanceRecordUpdate=new JMenuItem("修改维修记录");
	public JMenuItem  MaintanceRecordInsert=new JMenuItem("插入维修记录");
	public JMenuItem  MaintanceRecordDelet=new JMenuItem("删除记录");
		//改造更新二级菜单
	public JMenuItem  UPdateManagemenLook=new JMenuItem("查看改造更新记录");
	public JMenuItem  UPdateManagemenUpdate=new JMenuItem("修改改造更新记录");
	public JMenuItem  UPdateManagemenInsert=new JMenuItem("插入改造更新记录");
	public JMenuItem  UPdateManagemenDelet=new JMenuItem("删除改造更新记录");
	private  JLabel jlb1,jlb2;
	private  Toolkit tool;
	private  Dimension WindowSize;
	public MainFrame()
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
	  SystemManege.add(UpdatePassword);
	  SystemManege.add(UserManage);
	  UserManage.add(Useradd);
	  UserManage.add(Userupdate);
	  UserManage.add(Userdelete);
	  SystemManege.add(SystemExit);
	  
	  BasicInfo.add(EquipementInfo);
	  BasicInfo.add(EquipementUseHelp);
	  EquipementInfo.add(EquipementInfoLook);
	  EquipementInfo.add(EquipementInfoDelet);
	  EquipementInfo.add(EquipementInfoAdd);
	  EquipementUseHelp.add(EquipementUseHelpLook);
	  EquipementUseHelp.add(EquipementUseHelpDelet);
	  
	  EquipementManagement.add(UseManagement);
	  EquipementManagement.add(MaintanceRecord);
	  EquipementManagement.add(UPdateManagement);
	  UseManagement.add(UseManagementLook);
	  UseManagement.add(UseManagementUpdate);
	  MaintanceRecord.add(MaintanceRecordLook);
	  MaintanceRecord.add(MaintanceRecordUpdate);
	  MaintanceRecord.add(MaintanceRecordInsert);
	  MaintanceRecord.add(MaintanceRecordDelet);
	  UPdateManagement.add(UPdateManagemenLook);
	  UPdateManagement.add(UPdateManagemenUpdate);
	  UPdateManagement.add(UPdateManagemenInsert);
	  UPdateManagement.add(UPdateManagemenDelet);
	  
	  UpdatePassword.addActionListener(this);
	  SystemExit.addActionListener(this);
	  Useradd.addActionListener(this);
	  Userupdate.addActionListener(this);
	  Userdelete.addActionListener(this);
	  
	  EquipementInfoLook.addActionListener(this);
	  EquipementInfoDelet.addActionListener(this);
	  EquipementInfoAdd.addActionListener(this);
	  EquipementUseHelpLook.addActionListener(this);
	  EquipementUseHelpDelet.addActionListener(this);
	 
	  UseManagementLook.addActionListener(this);
	  UseManagementUpdate.addActionListener(this);
	  MaintanceRecordLook.addActionListener(this);
	  MaintanceRecordUpdate.addActionListener(this);
	  MaintanceRecordInsert.addActionListener(this);
	  MaintanceRecordDelet.addActionListener(this);
	  UPdateManagemenLook.addActionListener(this);
	  UPdateManagemenUpdate.addActionListener(this);
	  UPdateManagemenInsert.addActionListener(this);
	  UPdateManagemenDelet.addActionListener(this);
	  SystemExit.addActionListener(this);
	  Useradd.addActionListener(this);
	  Userupdate.addActionListener(this);
	  Userdelete.addActionListener(this);
	  EquipementUseHelpLook.addActionListener(this);
	  EquipementUseHelpDelet.addActionListener(this);
	  MaintanceRecordLook.addActionListener(this);
	  MaintanceRecordUpdate.addActionListener(this);
	  MaintanceRecordInsert.addActionListener(this);
	  UPdateManagemenLook.addActionListener(this);
	  UPdateManagemenInsert.addActionListener(this);
	  UPdateManagemenInsert.addActionListener(this);
	  //快捷键
	  UpdatePassword.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
	  SystemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.ALT_MASK));
	  Useradd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.ALT_MASK));
	  Userupdate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.ALT_MASK));
	  Userdelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.ALT_MASK));
	  Userdelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.ALT_MASK));
	  EquipementInfoLook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.ALT_MASK));
	  EquipementInfoDelet.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.ALT_MASK));
	  EquipementInfoLook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.ALT_MASK));
	  EquipementInfoAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,ActionEvent.ALT_MASK));
	  UseManagementLook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,ActionEvent.ALT_MASK));
	  UseManagementUpdate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.ALT_MASK));
	  
	  MaintanceRecordLook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.ALT_MASK));
	  MaintanceRecordInsert.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));
	  MaintanceRecordDelet.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.ALT_MASK));
	  MaintanceRecordDelet.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.ALT_MASK));
	  UPdateManagemenLook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.ALT_MASK));
	  UPdateManagemenInsert.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.ALT_MASK));
	
	 //菜单添加到菜单栏
	 jMenuBar.add(SystemManege);
	 jMenuBar.add(BasicInfo);
	 jMenuBar.add(EquipementManagement); 
       frame.setJMenuBar(jMenuBar); 
	 jlb1=new JLabel(new ImageIcon("D:/Rescourse/Java/EMISS/image/background.jpg"));
	 jlb2=new JLabel("欢迎进入设备管理系统",JLabel.CENTER);
	 jlb2.setFont(new Font("宋体",Font.BOLD, 30));
	 jlb2.setLocation(100,100);

	 content.add(jlb2,BorderLayout.NORTH);
	 content.add(jlb1,BorderLayout.CENTER);
	 frame.setSize(WindowSize);
	 
	 frame.setLocationRelativeTo(null);
	 frame.setVisible(true);
	 
	}
	public void actionPerformed(ActionEvent e)
	{
		Object obj=e.getSource();
	  if(obj==UpdatePassword)
	 {
		  new Uppd();  //修改密码
	 }
/*	 else if(obj==Useradd)
	 {
		 new  Uad();
	 }
	 
	 */
	 else if(obj==EquipementInfoLook|obj==EquipementInfoDelet|obj==EquipementInfoAdd)
	 {
		 new Equpinfo();
	 }
	 else if(obj==UseManagementLook|obj==UseManagementUpdate)
	 {
		 new Eusemanage();
	 }
	 else if(obj==SystemExit)
	 {
		 new se();
	 }
	 else if(obj==Useradd)
	 {
		 new useradd();
	 }
	 else if(obj==Userupdate)
	 {
		 new userupdate();
	 }
	 else if(obj==EquipementUseHelpLook)
	 {
		 new ehelp();
	 }
 
	}
	public static void main(String[]args)
	{
		new MainFrame();
	}
}