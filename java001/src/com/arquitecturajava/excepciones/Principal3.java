package com.arquitecturajava.excepciones;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Principal3 {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Hello World Java Swing");

        // set frame site
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // center the JLabel
        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);

        JButton button = new JButton("pulsame");
        button.setBounds(130,200,100,40);//Setting location and size of button

        frame.getContentPane().setLayout(null);
        
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, " has pulsado el boton");
			}
		});
        
        // add JLabel to JFrame
        frame.getContentPane().add(lblText);
        frame.getContentPane().add(button);

        // display it
        frame.pack();
        frame.setVisible(true);

	}

}
