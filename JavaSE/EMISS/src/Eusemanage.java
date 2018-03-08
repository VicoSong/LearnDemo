import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Eusemanage implements ActionListener
{
	  private JFrame frame;
	  private Statement stmt;
	  private Connection con;
	  private JTable tableTest;
	  private String[]columnNames={"设备编号","设备开始使用日期","设备结束使用日期","使用设备数量","备注"};
	  private Object[][]rowData=new Object[50][5];
	  private JButton Searchfor;
	  private JTextField Searchforcontent; 
	  public Eusemanage()
	  {
		    frame=new JFrame("设备使用管理");
			Container content=frame.getContentPane();
			Searchfor=new JButton("查询");
			Searchforcontent=new JTextField();
		    JPanel pl=new JPanel();
		    Searchfor.addActionListener(this);
		    pl.setLayout(new GridLayout(1,4,10,0));
		    pl.add(Searchforcontent);
		    pl.add(Searchfor);
		    tableTest=new JTable(rowData,columnNames);
			tableTest.setRowHeight(20);
		    
	        tableTest.setPreferredScrollableViewportSize(new Dimension(500, 30));
	        JScrollPane scrollPane=new JScrollPane(tableTest);
		    content.add(pl,BorderLayout.NORTH);
	        content.add(scrollPane,BorderLayout.CENTER);
	        frame.pack();
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
		    ResultSet  result;
		     String    sqlStr;
		    int i=0;
		 String str=Searchforcontent.getText().trim();
		 sqlStr="select EID,EDS,EDE,EQ,ERM from EUM where EID="+"'"+str+"'";
		 try
		 {if(obj==Searchfor)
		  {if(str.equals(""))
		    {JOptionPane.showMessageDialog(frame,"Text was null!");
		     return;
		    }
		   result=stmt.executeQuery(sqlStr);
		   for(int j=0;j<rowData.length;j++)
		   { for(int k=0;k<5;k++)
		   	 rowData[j][k]=null;
		   }
		  tableTest.repaint();
		    while(result.next())
		    {
		     
		     if(i<rowData.length)
		     {
		     
		     rowData[i][0]=result.getString("EID");
		     rowData[i][1]=result.getString("EDS");
		     rowData[i][2]=result.getString("EDE");
		     rowData[i][3]=result.getString("EQ");
		     rowData[i][4]=result.getString("ERM");
		     i++;
		     }
		     else{JOptionPane.showMessageDialog(frame,"please specify the ENAME!");
		     }
		    }
		  
		    Searchforcontent.setText("");
		  }
		 	
		 }
		 catch(SQLException sqle)
		 {System.err.println(sqle);
		 }
		
		}
		public static void main(String args[])
		{
			new Eusemanage();
		}
}