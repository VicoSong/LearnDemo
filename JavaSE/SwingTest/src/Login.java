import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Login extends JFrame {

	private JPanel contentPane;
	private JButton button;
	private JButton button_1;
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u767B\u5F55");
		label.setBounds(10, 26, 424, 30);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("黑体", Font.PLAIN, 30));
		label.setBackground(Color.WHITE);
		contentPane.add(label);
		
		 button = new JButton("确定");
		button.setAction(action);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					String userName=textField.getText().trim();
					String password=textField_1.getText().trim();
					JOptionPane.showMessageDialog(null,"用户名是："+userName+";\t"+"密码是："+password);
				}
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 24));
		button.setBounds(99, 193, 93, 23);
		contentPane.add(button);
		
		 button_1 = new JButton("取消");
		button_1.setFont(new Font("宋体", Font.PLAIN, 24));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(243, 193, 93, 23);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("用户名");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(99, 91, 93, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("密码");
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		label_1.setBounds(103, 153, 69, 23);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(178, 97, 105, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(178, 156, 105, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "\u786E\u5B9A");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
