import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
public class ehelp implements ActionListener{
   private JRadioButton jrb1,jrb2;
   private JTextField jtf1;
   private JButton jb;
   private TextField tf;
   private  Toolkit tool;
   private  String str;
   private  Dimension WindowSize;
   private  Connection con;
   private  Statement stmt;
   JFrame frame=new JFrame();
   public ehelp ()
   {
	    JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame();
		frame=new JFrame();
	    frame.setTitle("查看帮助文档");
	    Container content=frame.getContentPane();
		content.setLayout(new GridLayout(4,2,10,10));
		jrb1=new JRadioButton("按名称");
		jrb2=new JRadioButton("按编号");
		   ButtonGroup group=new ButtonGroup();
		   group.add(jrb1);
		   group.add(jrb2);
		 jtf1=new JTextField();
		 jb=new JButton("搜索");
		 tf=new TextField(str);
		 content.add(jrb1);
		 content.add(jrb2);
		 content.add(jtf1);
		 content.add(jb);
		 content.add(tf);
		 jb.addActionListener(this);
		 tool=frame.getToolkit();
		WindowSize=tool.getScreenSize();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(300,200);
		frame.setVisible(true);
		try
		{Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=EMIS","sa","101000");
		 stmt=con.createStatement();
		}
		catch(ClassNotFoundException e)
		{System.err.println(e.getMessage());
		}
		catch(SQLException e)
		{System.err.println(e.getMessage());
		}
   }
   
   public void actionPerformed(ActionEvent e)
   {
	   Object obj=e.getSource();
	   ResultSet  rs;
	   String   sqlStr;
	   str=jtf1.getText().trim();
	   sqlStr="select EID from EUH where EID="+"'"+str+"'";
		   if(obj==jb)
		   {
			   if(str.equals(""))
			   {
				   JOptionPane.showMessageDialog(frame,"Text was null!");
				     return;
			   }
			   else if(str.equals(sqlStr))
			   {
	//			   System.out.println(rs.getString("EUH"));  
			   }
		   }
   } 
   public static void main()
   {
	   new ehelp();
   }
}
