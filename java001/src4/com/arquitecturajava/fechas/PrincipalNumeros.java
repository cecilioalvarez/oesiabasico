package com.arquitecturajava.fechas;

import java.util.ArrayList;

public class PrincipalNumeros {

	public static void main(String[] args) {
		
		int numero= 7;
		
		ArrayList<Integer> lista= new ArrayList<Integer>();
		//in boxing
		lista.add(numero);
		// outboxing
		int numero2= lista.get(0);
		
		Integer numero3= new Integer(numero2);
		Integer numero4= Integer.valueOf(numero2);
		int numero5= numero4.intValue();
		System.out.println(numero5);
		String texto=numero4.toString();
		System.out.println(texto);
		
		System.out.println(Math.PI);
		System.out.println(Math.sin(1.23));
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(4));
		
	}
}
