package com.arquitecturajava.jdbc3;

import java.util.List;

public class Principal8 {

	public static void main(String[] args) {
		
		
		List<CompraAR> lista= CompraAR.buscarTodos();
		
		for (CompraAR c: lista) {
			
			System.out.println(c.getDni());
			System.out.println(c.getConcepto());
			System.out.println(c.getImporte());
		}
		
//		CompraAR nueva = new CompraAR("tabletB",200,"1");
//		nueva.insertar();
		CompraAR otra = new CompraAR(1);
		otra.borrar();

}
}
