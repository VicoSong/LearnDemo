import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class TableDemo extends JFrame{
	private JButton add_button;
	private JButton update_button;
	private JButton delete_button;
	private JPanel  pane;
	private JScrollPane scrollPane;
	private JLabel No_label;
	private JLabel partment_label;
	private JTextField No_textField;
	private JTextField partment_textField;
	TableDemo(){
		//���ô�������
		super("������");
		setBounds(100,100,480,240);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		scrollPane=new JScrollPane();
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		//���ñ��
		String []columnNames={"ͼ���","ͼ����"};
		String [][]tableValue={{"001","Java"},{"002","C#"},{"003","C++"}};
		final DefaultTableModel  tableModel=new DefaultTableModel(tableValue,columnNames);
		tableModel.addTableModelListener(new TableModelListener(){
			public void tableChanged(TableModelEvent e)
			{
				if(e.getType()==TableModelEvent.INSERT)
				{
					System.out.println("������������µ�������");
				}
				if(e.getType()==TableModelEvent.UPDATE)
				{
					int col=e.getColumn();
					if(col==1)
					{
						System.out.println("�޸��˱�������");
					}
				}
				if(e.getType()==TableModelEvent.DELETE)
				{
					System.out.println("ɾ���˱���е�������");
				}
			}
		});
		//���ñ������
		final JTable table=new JTable(tableModel);
		scrollPane.setViewportView(table);
		table.setRowSorter(new TableRowSorter(tableModel));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setSelectionBackground(Color.PINK);
		table.setSelectionForeground(Color.MAGENTA);
		table.setRowHeight(25);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		//���õײ����
		No_label=new JLabel("Ա����ţ�");
		partment_label=new JLabel("��������:");
		No_textField=new JTextField();
		partment_textField=new JTextField();
		add_button=new JButton("���");
		update_button=new JButton("�޸�");
		delete_button=new JButton("ɾ��");
		pane=new JPanel();
		pane.setLayout(new GridLayout(1,0));
		getContentPane().add(pane,BorderLayout.SOUTH);
		pane.add(No_label);
		pane.add(No_textField);
		pane.add(partment_label);
		pane.add(partment_textField);
		pane.add(add_button);
		pane.add(update_button);
		pane.add(delete_button);
		//�¼�����
		add_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String strNo=No_textField.getText();
				String strDepartment=partment_textField.getText();
				if(strNo.equals("")||strDepartment.equals(""))
				{
					JOptionPane.showMessageDialog(null,"�����ֶβ���Ϊ��");
					No_textField.requestFocus();
				}
				else{
					String[] rowValue={strNo,strDepartment};
					tableModel.addRow(rowValue);
				}
			}
		});
		
		update_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int selectedRow=table.getSelectedRow();

				if(selectedRow!=-1){
					String strNo=No_textField.getText();
					String strDepartment=partment_textField.getText();
					if(strNo.equals("")||strDepartment.equals(""))
					{
						JOptionPane.showMessageDialog(null,"�����ֶβ���Ϊ��");
						No_textField.requestFocus();
					}
					else{
						tableModel.setValueAt(No_textField.getText(), selectedRow,0);
						tableModel.setValueAt(partment_textField.getText(),selectedRow,1);
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"��ѡ��Ҫ�޸ĵ��У�");
				}
			}
		});
		
		delete_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int selectedRow=table.getSelectedRow();
				if(selectedRow!=-1){
					tableModel.removeRow(selectedRow);
				}
				else{
					JOptionPane.showMessageDialog(null,"����ѡ��Ҫɾ������");
				}
			}
		});
	}
	public static void main(String args[])
	{
		new TableDemo().setVisible(true);
	}
}
