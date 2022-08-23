package com.arquitecturajava.oo;

public class Principal2 {

	public static void main(String[] args) {
		
		Factura f= new Factura (1,"ordenador",500);
		System.out.println(f.getImporte());
		System.out.println(f.getImporteConIVA());

	}

}
