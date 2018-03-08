import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class Uppd  implements ActionListener{
	  private JTextField Uname,Oldpassword,Newpassword,Renewpassword;
	  private JButton OK,Cancel;
	  private Connection con;
	  private Statement stmt;
	  private PreparedStatement pstmt; 
	  private JFrame frame;
	  public Uppd ()
	  {
		  JFrame.setDefaultLookAndFeelDecorated(true);
			 frame=new JFrame("修改密码");
			 Container content=frame.getContentPane();
			 content.setLayout(new GridLayout(5,2,10,10));
			 JLabel lb1=new JLabel("用户名:");
			 JLabel lb2=new JLabel("旧密码:");
			 JLabel lb3=new JLabel("新密码:");
			 JLabel lb4=new JLabel("确认新密码:");
			 
			 Uname=new JTextField();
			 Oldpassword=new JTextField();
			 Newpassword=new JTextField();
			 Renewpassword=new JTextField();
			 
			 OK=new JButton("确定");
			 Cancel=new JButton("取消");	
			 OK.addActionListener(this);
			 content.add(lb1);
			 content.add(Uname);
			 content.add(lb2);
			 content.add(Oldpassword);
			 content.add(lb3);
			 content.add(Newpassword);
			 content.add(lb4);
			 content.add(Renewpassword);
			 content.add(OK);
			 content.add(Cancel);
			 frame.setBounds(100,100,400,300);
			 frame.setVisible(true);
			 
			 frame.addWindowListener(new WindowAdapter()
				{ 
					public void windowCloing(WindowEvent e)
					{try{
					
						pstmt.close();
					    con.close();
					    stmt.close();
					    frame.dispose();
					    }
					    catch(SQLException sqle)
					    {
					    }
					}
					
				});
			    frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setSize(450,400);
				frame.setVisible(true);
			 try{
				    String str;
				    str="insert into ESM (UID,UNAME,UPASSWORD,URIGHT) values(?,?,?,?)";
				 	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				 	con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=EMIS","sa","101000");
				 	pstmt=con.prepareStatement(str,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					stmt=con.createStatement();
				 }	
				 catch(ClassNotFoundException e)
				 {
				 }
				 catch(SQLException e)
				 {
				 }
				}
	 	public void actionPerformed(ActionEvent e)
			{
				 
				  Object obj=e.getSource();
			  
			//  pstmt=con.prepareStatement(str,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			  // stmt=con.createStatement();
			
					 if(obj.equals(OK))
					 {
						 frame.dispose();
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(frame,"username or password is error!");
					 }
			   
			 
		 }
		
	 

	  public static void main(String args[])
	  {
		 new Uppd();
	  }

}
	  

