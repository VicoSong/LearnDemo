import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import java.awt.*;
import java.awt.event.*; 
import javax.swing.JOptionPane;
public class Login implements ActionListener {

	private JFrame frame = new JFrame("��¼");
	private Container c = frame.getContentPane();
	private JTextField username = new JTextField();
	private JPasswordField password = new JPasswordField();
	private JButton ok = new JButton("ȷ��");
	private JButton cancel = new JButton("ȡ��");
	public Login(){
		frame.setSize(300,200);
		c.setLayout(new BorderLayout());
		initFrame();
		frame.setVisible(true);
	}

	private void initFrame() {
		
		//����
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		titlePanel.add(new JLabel("�û���¼"));
		c.add(titlePanel,"North");
		
		//�в���
		JPanel fieldPanel = new JPanel();
		fieldPanel.setLayout(null);
		JLabel l1 = new JLabel("�û���:");
		l1.setBounds(50, 20, 50, 20);
		JLabel l2 = new JLabel("��    ��:");
		l2.setBounds(50, 60, 50, 20);
		fieldPanel.add(l1);
		fieldPanel.add(l2);
		username.setBounds(110,20,120,20);
		password.setBounds(110,60,120,20);
		fieldPanel.add(username);
		fieldPanel.add(password);
		c.add(fieldPanel,"Center");
		
		//�ײ���ť
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(ok);
		buttonPanel.add(cancel);
		c.add(buttonPanel,"South");
	}
	
	public void actionPerformed(ActionEvent e) 
	{ 
	if(e.getSource()==ok) 
	{ 
		try 
	{ 
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //����JDBC����  
			 
		    String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=EMIS";   //���ӷ����������ݿ�sample  
			 
		    String userName = "sa";   //Ĭ���û���  
			 
		   String userPwd = "101000";
		   Connection con; 
		   Statement stmt;
		   ResultSet rs=null;
		   Class.forName(driverName);  
			 
		   con= DriverManager.getConnection(dbURL,userName,userPwd);  
		 
		 //  Connection con=DriverManager.getConnection(dbURL,userName,userPwd); 
		 //  Statement stmt=con.createStatement();
		//   ResultSet rs;
		
	 //rs=stmt.executeQuery("select UNAME,UPASSWORD from ESM where UNAME='"+username.getText()+"' and UPASSWORD='"+password.getText()+"'"); 
	if(rs.next()) 
	{ 
		JOptionPane.showMessageDialog(null,"��½�ɹ���"); 
	} 
	else 
		JOptionPane.showMessageDialog(null,"�û������������"); 
	} catch(Exception ex){} 

	if(e.getSource()==cancel) 
	{ 
		username.setText(""); 
	    password.setText(""); 
	} 
	} 
	} 
	
	
	public static void main(String[] args){
		new Login();
	}
	
}
