package com.arquitecturajava.excepciones;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal3 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello World Java Swing");
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("pulsame");
		button.setBounds(130, 200, 100, 40);
		frame.getContentPane().setLayout(null);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				File fichero = new File("z:/nuevo.txt");
				try {
					fichero.createNewFile();
					JOptionPane.showMessageDialog(null, "Has creado el fichero");
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				
			}
		});
		
		frame.getContentPane().add(button);
		frame.pack();
		frame.setVisible(true);

	}

}
