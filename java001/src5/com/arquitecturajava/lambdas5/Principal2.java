package com.arquitecturajava.lambdas5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {
		
		List<Factura> facturas= new ArrayList<Factura>();
		
		facturas.add(new Factura (20,"ordenador",200,true));
		facturas.add(new Factura (21,"ordenador",250,false));
		facturas.add(new Factura (22,"ordenador",150,true));
		facturas.add(new Factura (50,"ordenador",220,false));
		
		Stream<Factura> flujo= facturas.stream();
		
		
		
		
		OptionalDouble oResultado=flujo.filter(Predicate.not(Factura::isPagada))
		.mapToDouble(Factura::getIva).reduce((a,i)->a+i);
			
		
		 if (oResultado.isPresent()) {
			 
			 System.out.println(oResultado.getAsDouble());
		 }
		
		

	}

}
