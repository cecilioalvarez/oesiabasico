package com.arquitecturajava.fechas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ExpresionesRegulares4 {

	public static void main(String[] args) {

		String linea = "";
		Pattern patronImporte = Pattern.compile("\\d{2,5}");
		Pattern patronNumeroFactura = Pattern.compile("F-?[A-Z\\d]{2,7}");
		try (FileReader fr = new FileReader("datosregulares.txt"); BufferedReader lector = new BufferedReader(fr);) {
			while ((linea = lector.readLine()) != null) {
				
				Matcher encontrar = patronImporte.matcher(linea);
				Matcher encontrarNumeroFactura = patronNumeroFactura.matcher(linea);
				MatchResult[] lista=encontrar.results().toArray(MatchResult[]::new);
				MatchResult[] listaFactura=encontrarNumeroFactura.results().toArray(MatchResult[]::new);
				
				System.out.println(lista[1].group());
				System.out.println(listaFactura[0].group());
				
			
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
