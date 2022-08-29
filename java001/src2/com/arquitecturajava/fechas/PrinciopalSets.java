package com.arquitecturajava.fechas;

import java.util.HashSet;

public class PrinciopalSets {

	public static void main(String[] args) {
		
		HashSet<Factura> conjunto = new HashSet<Factura>();
		
		conjunto.add(new Factura (1,"ordenador1",200));
		conjunto.add(new Factura (2,"ordenador2",400));
		conjunto.add(new Factura (3,"ordenador3",800));
		conjunto.add(new Factura (4,"ordenador4",1200));
		conjunto.add(new Factura (1,"ordenador5",200));
		
		for (Factura f: conjunto) {
			
			System.out.println(f.getNumero());
			System.out.println(f.getConcepto());
		}

	}

}
