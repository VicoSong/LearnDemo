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

public class dayin  
{
	  private JFrame frame;
	  private Statement stmt;
	  private Connection con;
	  private JTable tableTest;
	  private JButton bt1,bt2;
	  private String[]columnNames={"�ͻ�����","���׺�","�˺�","��������"};
	  private Object[][]rowData=new Object[1][4]; 
	  public dayin()
	  {
		    frame=new JFrame("��ӡƾ��");
			Container content=frame.getContentPane();
			bt1=new JButton("ȷ��");
			bt2=new JButton("ȡ��");
		    JPanel pl=new JPanel();
		    pl.setLayout(new GridLayout(1,4,10,0));
		    tableTest=new JTable(rowData,columnNames);
			tableTest.setRowHeight(20);
			pl.add(bt1);
			pl.add(bt2);
	        tableTest.setPreferredScrollableViewportSize(new Dimension(500, 30));
	        JScrollPane scrollPane=new JScrollPane(tableTest);
		    content.add(pl,BorderLayout.NORTH);
	        content.add(scrollPane,BorderLayout.CENTER);
	        frame.pack();
	        frame.setVisible(true);
		  }

		public static void main(String args[])
		{
			new dayin();
		}
}