package com.arquitecturajava.jdbc3;

import java.util.List;

public class Principal12 {

	public static void main(String[] args) {

		List<PersonaAR> lista=PersonaAR.buscarTodosConCompras();
		
		for (PersonaAR p:lista) {
			
			System.out.println(p.getDni());
			
			System.out.println(p.getNombre());
			
			for (CompraAR c: p.getCompras()) {
				System.out.println(c.getConcepto());
				System.out.println(c.getImporte());
			}
		}
	}
}
