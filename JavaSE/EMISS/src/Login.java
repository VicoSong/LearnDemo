import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame 
{  private  JLabel JLb1;
   private  JLabel JLb2;
   private JRadioButton   rb1,rb2;
   private  JButton OK_btn;
   private  JButton Cancel_btn;
   private  JTextField UserName;
   private  JPasswordField Password;
   private JFrame frame;
	private Connection con;
	private Statement stmt;
	public Login()
	{
	   JFrame.setDefaultLookAndFeelDecorated(true);
	   frame=new JFrame("登陆");
	   
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container content=frame.getContentPane();
		content.setLayout(new GridLayout(3,2,10,20));
		
	   JLb1=new JLabel("用户名:");
	   JLb1.setHorizontalAlignment(SwingConstants.RIGHT);
		JLb2=new JLabel("密码:");
	 JLb2.setHorizontalAlignment(SwingConstants.RIGHT);
		UserName=new JTextField();
		
		Password=new JPasswordField();
		
	    OK_btn=new JButton("确定");
	    
		Cancel_btn=new JButton("取消");
		
		OK_btn.addActionListener(new ActionHandler());
		Cancel_btn.addActionListener(new ActionHandler());
		content.add(JLb1);
		content.add(UserName);
		content.add(JLb2);
		content.add(Password);
		
		content.add(OK_btn);
		content.add(Cancel_btn);
		
	
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(300,200);
		frame.setVisible(true);
		
	try{
		Class.forName( "com.microsoft.sqlserver.jdbc.SQLServerDriver");   //加载JDBC驱动);
	   con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=EMIS","sa","101000");
       stmt=con.createStatement();
	}
	catch(ClassNotFoundException e)
	{
	}
	catch(SQLException ex)
	{
	}
	}
	class ActionHandler implements ActionListener
	{
	public void actionPerformed(ActionEvent e)
	{String str1,str2,username,sqlStr;
		Object obj=e.getSource();
	 str1=UserName.getText().trim();
     str2=Password.getText().trim();
	 try{
	 	
	 if(obj.equals(OK_btn))
	 
	  {
		 if(str1.equals(""))
	   {
			 JOptionPane.showMessageDialog(frame,"username can't be null!");
	         return;
	   }
	  	sqlStr="select UNAME,UPASSWORD from ESM where UNAME="+"'"+str1+"'"+" and UPASSWORD="+"'"+str2+"'";
	  
	  ResultSet result=stmt.executeQuery(sqlStr);
	  if(result.next())
	  {
	  	username=result.getString("UNAME");
        	new MainFrame();
	  
	  	}
	   
	   frame.dispose();
	   stmt.close();
	   con.close();
	  }
	  else
	  {JOptionPane.showMessageDialog(frame,"username or password is error!");
	   
	  }
	
	}
	catch(SQLException ex)
	{
		System.err.println(ex);
	}
	}
	
	}
	
	public static void main(String[]args)
	{
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable()
	{
		public void run()
		{
			new Login();
		}
	});
	}
	}