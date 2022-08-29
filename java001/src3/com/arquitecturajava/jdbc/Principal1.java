package com.arquitecturajava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal1 {

	
	static final String URL = "jdbc:mysql://localhost/curso";
	   static final String USUARIO = "root";
	   static final String CLAVE = "";
	   static final String CONSULTA = "SELECT * FROM Personas";
	
	public static void main(String[] args) {
	
		
		
		 try(Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
		       
				
		      ) {
			 
			  System.out.println("estamos conectados");
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
