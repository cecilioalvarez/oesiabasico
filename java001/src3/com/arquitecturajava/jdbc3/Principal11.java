package com.arquitecturajava.jdbc3;

import java.util.List;

public class Principal11 {

	public static void main(String[] args) {

		PersonaAR p= new PersonaAR("2");
		
		List<CompraAR> compras=p.getCompras();
		
		for (CompraAR c: compras) {
			
			System.out.println(c.getImporte());
			System.out.println(c.getConcepto());
			
		}
	}
}
