package com.arquitecturajava.fechas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares3 {

	public static void main(String[] args) {

		Pattern patron = Pattern.compile("\\d{2}");
		Matcher encontrar=patron.matcher("hola que tal 10 estas tu yo bien y tu 20") ;
		while (encontrar.find()) {
			
			System.out.println("encontrado");
			System.out.println(encontrar.start());
			System.out.println(encontrar.end());
		}
		
	}
}
