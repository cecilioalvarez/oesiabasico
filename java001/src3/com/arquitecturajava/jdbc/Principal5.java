package com.arquitecturajava.jdbc;

import java.util.List;

public class Principal5 {

	public static void main(String[] args) {
		
		List<PersonaAR> lista=PersonaAR.buscarTodos();
		for (PersonaAR p: lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
		}
	}

}
