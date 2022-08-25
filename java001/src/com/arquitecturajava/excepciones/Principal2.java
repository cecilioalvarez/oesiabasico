package com.arquitecturajava.excepciones;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal2 {

	public static void main(String[] args) {
		
		File fichero = new File("nuevo.txt");
		try {
			fichero.createNewFile();
			Connection con= DriverManager
					.getConnection("dasfdaf","dffdasfd","dafd");
		} catch (IOException e) {
			
			System.out.println("mensaje :"+e.getMessage());
			
		} catch (SQLException e) {
			System.out.println("no se puede acceder a la base de datos"+ e.getMessage());
		}finally {
			
			System.out.println("el programa cierra los recursos");
		}
		
		

	}

}
