package com.arquitecturajava.fechas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ExpresionesRegulares5 {

	public static void main(String[] args) {

		String linea = "";
		Pattern patron = Pattern.compile("\\d{2,5}");
		try (FileReader fr = new FileReader("datosregulares.txt"); BufferedReader lector = new BufferedReader(fr);) {
			while ((linea = lector.readLine()) != null) {
				
				Matcher encontrar = patron.matcher(linea);
				MatchResult[] lista=encontrar.results().toArray(MatchResult[]::new);
				System.out.println(lista[1].group());
				
			
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
