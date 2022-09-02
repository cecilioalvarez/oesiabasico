package com.arquitecturajava;

public class Principal {

	public static void main(String[] args) {
		
		Bolsa b= new Bolsa(5);
		
		b.add("galletas");
		b.add("chocolate");
		b.add("leche");
		
		for (String elemento: b) {
			
			System.out.println(elemento);
		}
	}
}
