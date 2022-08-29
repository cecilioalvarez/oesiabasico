package com.arquitecturajava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal1 {

	static final String URL = "jdbc:mysql://localhost/curso";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	//static final String CONSULTA = "SELECT * FROM Personas";

	public static void main(String[] args) {

		String dni="4";
		String nombre="maria";
		String apellidos="perez";
		
		String consulta = "insert into Personas values ('"+dni+"','" +nombre+"','"+apellidos+"')";
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();

		) {
			sentencia.execute(consulta);
			System.out.println("hemos insertado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
