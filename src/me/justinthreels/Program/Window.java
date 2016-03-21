package me.justinthreels.Program;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	private static final long serialVersionUID = -6749056370700280347L;

	public Window() {
		super("Window");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public void setup() {
		JTextField TF = new JTextField();
		TF.setText("this is a String");
		add(TF);
		setVisible(true);
	}

}
