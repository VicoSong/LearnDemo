import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
public class SwingTest extends JFrame {
		 final int WIDTH=300;
		 final int HEIGTH=200;
		 private JPanel panel;
		 private JButton button;
		 private JLabel label;
		 int count=0;
		 public SwingTest(String str)
		 {
			 super(str);
			 panel=new JPanel();
			 button=new JButton("��ť��������"+count+"��");
			 label=new JLabel("����һ����ǩ",new ImageIcon("053.jpg"),SwingConstants.LEFT);
			 panel.add(label);
			 panel.add(button);
			 add(panel);
			 button.addActionListener(new ActionListener()
			 {
				 public void actionPerformed(ActionEvent e)
				 {
					 
					 button.setText("��ť������"+(++count)+"��");
					 
				 }
			 });
			 
			 this.setSize(WIDTH,HEIGTH);
			 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			 this.setVisible(true);
		 }
		
		public static void main(String args[])
		{
		   new SwingTest("hello");
		}
}
