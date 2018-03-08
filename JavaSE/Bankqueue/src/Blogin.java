
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Blogin extends JFrame 
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
	public Blogin()
	{
	   JFrame.setDefaultLookAndFeelDecorated(true);
	   frame=new JFrame("登陆");
	   
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container content=frame.getContentPane();
		content.setLayout(new GridLayout(4,2,20,20));
	   JLb1=new JLabel("用户名:");
        rb1=new JRadioButton("普通用户");
        rb2=new JRadioButton("VIP用户");
       ButtonGroup group=new ButtonGroup();
	   group.add(rb1);
	   group.add(rb2);
		JLb2=new JLabel("密码:");
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
		content.add(rb1);
		content.add(rb2);
		content.add(OK_btn);
		content.add(Cancel_btn);
		
	
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(300,200);
		frame.setVisible(true);
		
	try{
		Class.forName( "com.microsoft.sqlserver.jdbc.SQLServerDriver");   //加载JDBC驱动);
	   con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=BQUEUE","sa","101000");
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
	  	sqlStr="select 用户名,密码 from userlogin where 用户名="+"'"+str1+"'"+" and 密码="+"'"+str2+"'";
	  	
	  ResultSet result=stmt.executeQuery(sqlStr);
	  if(result.next())
	  {
	  	username=result.getString("用户名");
        	new Bmainframe();
	  
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
			new Blogin();
		}
	});
	}
	}