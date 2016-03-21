package me.justinthreels.Program;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	private static final long serialVersionUID = -6749056370700280347L;

	public Window() {
		super("Window");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout());
	}
	
	public void setup() {
		JTextField TF = new JTextField();
		TF.setText("this is a String");
		TF.setEditable(false);
		JButton button = new JButton("Click here!");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
			        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Sound.wav").getAbsoluteFile());
			        Clip clip = AudioSystem.getClip();
			        clip.open(audioInputStream);
			        clip.start();
				} catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		add(TF);
		add(button);
		setVisible(true);
	}

}
