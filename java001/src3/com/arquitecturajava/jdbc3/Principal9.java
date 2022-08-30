package com.arquitecturajava.jdbc3;

import java.util.List;

public class Principal9 {

	public static void main(String[] args) {
		
		
		List<CompraAR> lista= CompraAR.buscarTodosOrdenados("concepto");
		
		for (CompraAR c: lista) {
			
			System.out.println(c.getDni());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
		}
		
		
		System.out.println("******************");
	List<CompraAR> lista2= CompraAR.buscarTodosOrdenados("importe");
		
		for (CompraAR c: lista2) {
			
			System.out.println(c.getDni());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
		}
		


}
}
