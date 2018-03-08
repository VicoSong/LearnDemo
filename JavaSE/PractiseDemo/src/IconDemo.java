import java.awt.*;
import javax.swing.*;
public class IconDemo extends JFrame{
	public IconDemo()
	{
		super("This is IconDemo");
		Container contentPane=getContentPane();
		
		Icon image_1=new ImageIcon("054.jpg");
		JLabel label_1=new JLabel(image_1);
		JLabel label_2=new JLabel(new ImageIcon("054.jpg"));
	}
	public static void main(String args[])
	{
		JFrame f=new IconDemo();
		f.setBounds(100,100,300,250);
		f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		f.setVisible(true);
	}
}
