import java.awt.*;
import javax.swing.*;
public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest()
	{
		super("JScrollPaneDemo");
		Container c=getContentPane();
		JTextArea ta=new JTextArea(20,50);
		JScrollPane sp=new JScrollPane(ta);
		c.add(sp);
		setSize(200,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String args[])
	{
		new JScrollPaneTest();
	}
}
