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

	private JFrame frame = new JFrame("登录");
	private Container c = frame.getContentPane();
	private JTextField username = new JTextField();
	private JPasswordField password = new JPasswordField();
	private JButton ok = new JButton("确定");
	private JButton cancel = new JButton("取消");
	public Login(){
		frame.setSize(300,200);
		c.setLayout(new BorderLayout());
		initFrame();
		frame.setVisible(true);
	}

	private void initFrame() {
		
		//顶部
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());
		titlePanel.add(new JLabel("用户登录"));
		c.add(titlePanel,"North");
		
		//中部表单
		JPanel fieldPanel = new JPanel();
		fieldPanel.setLayout(null);
		JLabel l1 = new JLabel("用户名:");
		l1.setBounds(50, 20, 50, 20);
		JLabel l2 = new JLabel("密    码:");
		l2.setBounds(50, 60, 50, 20);
		fieldPanel.add(l1);
		fieldPanel.add(l2);
		username.setBounds(110,20,120,20);
		password.setBounds(110,60,120,20);
		fieldPanel.add(username);
		fieldPanel.add(password);
		c.add(fieldPanel,"Center");
		
		//底部按钮
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
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //加载JDBC驱动  
			 
		    String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=EMIS";   //连接服务器和数据库sample  
			 
		    String userName = "sa";   //默认用户名  
			 
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
		JOptionPane.showMessageDialog(null,"登陆成功！"); 
	} 
	else 
		JOptionPane.showMessageDialog(null,"用户名或密码错误！"); 
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
