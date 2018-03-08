import javax.swing.*;
public class SetToolTipTextDemo extends JFrame{
	JPanel  panel;
	JLabel  label;
	Icon    icon;
	public SetToolTipTextDemo()
	{
		super("This is a Test!");
		panel=new JPanel();
		label=new JLabel();
		icon=new ImageIcon("053.jpg");
		label.setIcon(icon);
		label.setVisible(true);
		panel.setToolTipText("This is a ToolTipTextDemo!");
		panel.add(label);
		add(panel);
		setBounds(100,100,250,300);
		setResizable(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new SetToolTipTextDemo();
	}
}
