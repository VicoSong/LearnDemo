import java.awt.*;
import javax.swing.*;
public class WindowDemo extends JFrame{
	private JPanel panel;
	private JLabel label;
	private JButton button;
	private JTextField textField;
	private JTextArea  textArea;
	private JPasswordField   password;
	private JCheckBox  checkbox;
	private JTabbedPane tabbedPane;
	private JSplitPane splitePane;
	private JSlider  slider;
	private JProgressBar progressBar;
	private JList list;
	private JComboBox comboBox;
	private JMenu menu;
	private JMenuBar menuBar;
	private JMenuItem menuItem;
	private JPopupMenu popupMenu;
	public WindowDemo()
	{
		super("This is a WindowDemo Procedure!");
		panel=new JPanel();
		panel.setSize(600,600);
		panel.setLayout(new GridLayout(3,3));
		label=new JLabel();
		label.setText("����һ����ǩ");
		label.setSize(30,30);
		button=new JButton("����һ����ť");
		button.setSize(30,30);
		textField=new JTextField("��ʹ����������Ҳ�ֲ���ʱ��");
		textField.setSize(30,30);
		textArea=new JTextArea("ʱ�俪ʼ������Ȱ����˷���,�������鵽����Խ����������᳦��ת����˪��");
		textArea.setSize(30,30);
		password=new JPasswordField("����һ�������");
		password.setSize(30,30);
		checkbox=new JCheckBox("����һ����ѡ��");
		checkbox.setSize(30,30);
		list=new JList();
		list.setSize(30,30);
		comboBox=new JComboBox();
		comboBox.setSize(30,30);
		panel.add(label);
		panel.add(button);
		panel.add(textField);
		panel.add(textArea);
		panel.add(password);
		panel.add(checkbox);
		panel.add(list);
		panel.add(comboBox);
		add(panel);
		setResizable(true);
		setBounds(100,100,600,600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new WindowDemo();
	}
}
