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


public class Equpinfo implements ActionListener
{
	  private JFrame frame;
	  private Statement stmt;
	  private Connection con;
	  private JTable tableTest;
	  private String[]columnNames={"设备名","设备编号","制造商","设备起用时间","设备负责人","设备状态"};
	  private Object[][]rowData=new Object[50][6];
	  private JButton Searchfor;
	  private JRadioButton Byname,Byno;
	  private JTextField Searchforcontent; 
	  public Equpinfo()
	  {
		   frame=new JFrame("设备信息查询");
			Container content=frame.getContentPane();
			Searchfor=new JButton("查询");
			Searchforcontent=new JTextField();
		    JPanel pl=new JPanel();
		    Byname=new JRadioButton("设备名");
		    Byno=new JRadioButton("设备编号");
		    Byname.setSelected(true);
		    Searchfor.addActionListener(this);
		   
		    ButtonGroup group=new ButtonGroup();
		    group.add(Byname);
		    group.add(Byno);
		    pl.setLayout(new GridLayout(1,4,10,0));
		    pl.add(Byname);
		    pl.add(Byno);
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
		
		 if(Byno.isSelected())
		 {
			 sqlStr="select ENAME,EID,EMADE,DATETU,EMANAGER,ESTATE from EIF where EID="+"'"+str+"'";
		 }
		  else
		 {
			 sqlStr="select ENAME,EID,EMADE,DATETU,EMANAGER,ESTATE from EIF where  ENAmE like '"+str+"%'";
		 }
		 
		 try
		 {if(obj==Searchfor)
		  {if(str.equals(""))
		    {JOptionPane.showMessageDialog(frame,"Text was null!");
		     return;
		    }
		   result=stmt.executeQuery(sqlStr);
		   for(int j=0;j<rowData.length;j++)
		   { for(int k=0;k<6;k++)
		   	 rowData[j][k]=null;
		   }
		  tableTest.repaint();
		    while(result.next())
		    {
		     
		     if(i<rowData.length)
		     {
		     
		     rowData[i][0]=result.getString("ENAME");
		     rowData[i][1]=result.getString("EID");
		     rowData[i][2]=result.getString("EMADE");
		     rowData[i][3]=result.getString("DATETU");
		     rowData[i][4]=result.getString("EMANAGER");
		     rowData[i][5]=result.getString("ESTATE");
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
			new Equpinfo();
		}
}
