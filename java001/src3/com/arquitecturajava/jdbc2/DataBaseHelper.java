package com.arquitecturajava.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHelper {

	
	
	public static PreparedStatement crearSentenciaPreparada(String consulta, Object ...parametros) throws SQLException {
		
		Configurador c= Configurador.getInstance();
		
		Connection conn = DriverManager.getConnection(c.getUrl(),c.getUser(),c.getPassword());
		PreparedStatement sentencia = conn.prepareStatement(consulta);
		
		for (int i=0;i<parametros.length;i++) {
		
			if (parametros[i] instanceof Integer) {
				sentencia.setInt(i+1, (Integer)parametros[i]);
				
			}else {
				
				sentencia.setString(i+1, (String)parametros[i]);
			}
		}
		return sentencia;
		
	}
	
	
}