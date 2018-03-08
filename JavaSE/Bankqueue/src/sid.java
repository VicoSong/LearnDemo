import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
public class sid extends JFrame {
   private  JLabel jlb1,jlb2,jlb3;
   private  JTextField jtf1,jtf2,jtf3;
   private JButton ok,cancel;
   private  Toolkit tool;
   private  Dimension WindowSize;
   private Statement stmt;
   private Connection con;
   private JFrame frame;
   public sid()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame=new JFrame();
	   frame.setTitle("业务账号登陆");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Container content=frame.getContentPane();
	   content.setLayout(new GridLayout(3,2,10,10));
	   tool=frame.getToolkit();
	   WindowSize=tool.getScreenSize();
	   jlb1=new JLabel("账户");
	   jlb2=new JLabel("密码");
	   ok=new JButton("确定");
	   cancel=new JButton("取消");
	   jtf1=new JTextField();
	   jtf2=new JTextField();
	    content.add(jlb1);
	    content.add(jtf1);
	    content.add(jlb2);
	    content.add(jtf2);
	    content.add(ok);
	    content.add(cancel);
	    ok.addActionListener(new ActionHandler());
		cancel.addActionListener(new ActionHandler());
	    tool=frame.getToolkit();
		WindowSize=tool.getScreenSize();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(300,200);
		frame.setVisible(true);
		 try
			{Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=BQUEUE","sa","101000");
			 stmt=con.createStatement();
			}
			catch(ClassNotFoundException e)
			{System.err.println(e.getMessage());
			}
			catch(SQLException e)
			{System.err.println(e.getMessage());
			}	 
	}
   class ActionHandler implements ActionListener
   {
	   public void actionPerformed(ActionEvent e) 
	   {
		   Object obj=e.getSource();
		   String str1,str2,username,sqlStr;
		   str1=jtf1.getText().trim();
	       str2=jtf1.getText().trim();
	       try{
	   	 	
	    		 if(obj.equals(ok))
	    		  {
	    			 	sqlStr="select * from Bcosteminfo where 账号="+"'"+str1+"'"+" and 取款密码="+"'"+str2+"'";
	    			 	ResultSet result=stmt.executeQuery(sqlStr);
		    		  if(result.next())
		    		  {
			    		   username=result.getString("账号");
			    		  	new sm();
			    		   frame.dispose();
			    		   stmt.close();
			    		   con.close();
		    		  }
		    		  else
		    		  {
		    			  JOptionPane.showMessageDialog(frame,"用户名或密码错误！");
		    		  }
	    		  }
	    		}  
	    		catch(SQLException ex)
	    		{
	    			System.err.println(ex);
	    		}
	   }  
   }
   public static void main(String args[])
   {
	   new sid();
   }
}

