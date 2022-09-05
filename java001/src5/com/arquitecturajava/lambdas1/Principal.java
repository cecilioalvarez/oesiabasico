package com.arquitecturajava.lambdas1;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {

		Bolsa<String> b = new Bolsa<String>(5);

		b.add("galletas");
		b.add("chocolate");
		b.add("leche");
		
		Bolsa<Persona> bolsaPersonas= new Bolsa<Persona>(5);
		bolsaPersonas.add(new Persona("miguel"));
		bolsaPersonas.add(new Persona("antonio"));
		
		for (Persona p : bolsaPersonas) {

			System.out.println(p.getNombre());
		}
		
		
		
		

		Iterator<String> iterador = b.iterator();
		while (iterador.hasNext()) {

			System.out.println(iterador.next());
			iterador.remove();
		}

		for (String elemento : b) {

			System.out.println(elemento);
		}
		
		
		
//		Set conjunto= new HashSet();
//		
//		Iterator<String> iterador2= conjunto.iterator();
//		while (iterador2.hasNext()) {
//			
//			System.out.println(iterador2.next());
//		}
	}
}
