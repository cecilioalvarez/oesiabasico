package com.arquitecturajava.lambdas5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Principal3 {

	public static void main(String[] args) {
		
		List<Factura> facturas= new ArrayList<Factura>();
		
		facturas.add(new Factura (20,"ordenador",200,true));
		facturas.add(new Factura (21,"ordenador",250,false));
		facturas.add(new Factura (22,"ordenador",150,true));
		facturas.add(new Factura (50,"ordenador",220,false));
		
		Stream<Factura> flujo= facturas.stream();
		
		
		
		
		flujo
		.map(Albaran::new)
		.forEach(System.out::println);
		
		
		

	}

}
