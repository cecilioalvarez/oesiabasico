package com.arquitecturajava.excepciones.avanzado6;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal8 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello World Java Swing");
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("pulsame");
		JLabel l1 = new JLabel("First Label.");
		l1.setBounds(50, 50, 300, 30);
		l1.setText("hola soy una etiqueta");

		button.setBounds(130, 200, 100, 40);
		frame.getContentPane().setLayout(null);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					GestorFichero gf = new GestorFichero();
					Configurador c = new Configurador();
					l1.setText(c.getConfiguracion());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					l1.setText("la aplicacion no puede arrancar");
				}

			}
		});

		frame.getContentPane().add(button);
		frame.getContentPane().add(l1);
		frame.pack();
		frame.setVisible(true);

	}

}
