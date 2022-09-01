package com.arquitecturajava.fechas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {

		Pattern patron = Pattern.compile("a");
		Matcher encontrar=patron.matcher("hola que tal estas") ;
		boolean encontrados= encontrar.find();
		
		if (encontrados) {
			System.out.println("se encontro");
		}
	}
}
