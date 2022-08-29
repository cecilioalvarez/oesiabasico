package com.arquitecturajava.fechas;

public class PrincipalPantalon {

	public static void main(String[] args) {
		
		Pantalon p= new Pantalon("azul");
		System.out.println(p.getColor());
		Pantalon p2= new Pantalon("rojo");
		System.out.println(p2.getColor());
		System.out.println(Pantalon.getContador());
	}
}
