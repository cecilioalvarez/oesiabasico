package com.arquitecturajava.lambdas4;

public class Principal {

	public static void main(String[] args) {
		
		
		Impresora i= new ImpresoraLaser();
		i.imprimir();
		Impresora i2= new ImpresoraTinta();
		i2.imprimir();
		System.out.println(i.esMasRapida(i2));		

		System.out.println(Impresora.masRapida(i,i2).velocidad());
		
	}

}
