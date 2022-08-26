package com.arquitecturajava.fechas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrincipalFactura {

	public static void main(String[] args) {
		
		Factura f= new Factura (1,"ordenador",200);
		Factura f1= new Factura (2,"ordenador",100);
		Factura f2= new Factura (3,"ordenador",50);
		Factura f3= new Factura (4,"ordenador",600);
		Factura f4= new Factura (5,"ordenador",120);
		
		List<Factura> lista=Arrays.asList(f,f1,f2,f3,f4);
		Collections.sort(lista);
		for (Factura ffinal: lista) {
			
			System.out.println(ffinal.getConcepto());
			System.out.println(ffinal.getImporte());
		}
	}

}
