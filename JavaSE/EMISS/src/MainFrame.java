import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
public class MainFrame implements ActionListener
{
	private  JMenuBar jMenuBar=new JMenuBar();
	//ϵͳ����
	private JMenu SystemManege=new JMenu("ϵͳ����");
	public JMenuItem UpdatePassword=new JMenuItem("�޸�����");
	public JMenuItem SystemExit=new JMenuItem("ϵͳ�˳�");
	private JMenu UserManage=new JMenu("�û�����");//�û�����
	public JMenuItem Useradd=new JMenuItem("����û�");
	public JMenuItem Userupdate=new JMenuItem("�޸��û�");
	public JMenuItem Userdelete=new JMenuItem("ɾ���û�");
	   //���
	   
	   //������Ϣ����
	private JMenu BasicInfo=new JMenu("������Ϣ");       //������Ϣ
	private JMenu EquipementInfo=new JMenu("������");  //������
	private JMenu EquipementUseHelp=new JMenu("ʹ�ð���");//ʹ�ð���
	public JMenuItem EquipementInfoLook=new JMenuItem("�鿴�豸��Ϣ");
	public JMenuItem EquipementInfoDelet=new JMenuItem("ɾ���豸��Ϣ");
	public JMenuItem EquipementInfoAdd=new JMenuItem("����豸��Ϣ");
	   //ʹ�ð��������˵�
	public JMenuItem EquipementUseHelpLook=new JMenuItem("�鿴�豸ʹ�ð���");
	public JMenuItem EquipementUseHelpDelet=new JMenuItem("ɾ���豸ʹ�ð���");
	   //�豸����
	private JMenu     EquipementManagement=new JMenu("�豸����");//�豸����
	private JMenu 	  UseManagement=new JMenu("ʹ�ù���"); //ʹ�ù���
	private JMenu    MaintanceRecord=new JMenu("����ά�޼�¼");//ά�ޱ�����¼
	private JMenu   UPdateManagement=new JMenu("�������");//�������
		//ʹ�ù�������˵�
	public JMenuItem  UseManagementLook=new JMenuItem("�鿴ʹ�üƻ�");
	public JMenuItem  UseManagementUpdate=new JMenuItem("����ʹ�üƻ�");
		//ά�ޱ�����¼�����˵�
	public JMenuItem  MaintanceRecordLook=new JMenuItem("�鿴ά�޼�¼");
	public JMenuItem  MaintanceRecordUpdate=new JMenuItem("�޸�ά�޼�¼");
	public JMenuItem  MaintanceRecordInsert=new JMenuItem("����ά�޼�¼");
	public JMenuItem  MaintanceRecordDelet=new JMenuItem("ɾ����¼");
		//������¶����˵�
	public JMenuItem  UPdateManagemenLook=new JMenuItem("�鿴������¼�¼");
	public JMenuItem  UPdateManagemenUpdate=new JMenuItem("�޸ĸ�����¼�¼");
	public JMenuItem  UPdateManagemenInsert=new JMenuItem("���������¼�¼");
	public JMenuItem  UPdateManagemenDelet=new JMenuItem("ɾ��������¼�¼");
	private  JLabel jlb1,jlb2;
	private  Toolkit tool;
	private  Dimension WindowSize;
	public MainFrame()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame();
	   frame.setTitle("������");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Container content=frame.getContentPane();
	   content.setLayout(new BorderLayout());
	  tool=frame.getToolkit();
	  WindowSize=tool.getScreenSize();
	  
	 //����˵�
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
	  //��ݼ�
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
	
	 //�˵���ӵ��˵���
	 jMenuBar.add(SystemManege);
	 jMenuBar.add(BasicInfo);
	 jMenuBar.add(EquipementManagement); 
       frame.setJMenuBar(jMenuBar); 
	 jlb1=new JLabel(new ImageIcon("D:/Rescourse/Java/EMISS/image/background.jpg"));
	 jlb2=new JLabel("��ӭ�����豸����ϵͳ",JLabel.CENTER);
	 jlb2.setFont(new Font("����",Font.BOLD, 30));
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
		  new Uppd();  //�޸�����
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