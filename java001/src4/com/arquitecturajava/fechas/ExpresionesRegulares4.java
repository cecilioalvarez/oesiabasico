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
		Pattern patron = Pattern.compile("\\d{2,5}");
		try (FileReader fr = new FileReader("datosregulares.txt"); BufferedReader lector = new BufferedReader(fr);) {
			while ((linea = lector.readLine()) != null) {
				int contador=0;
				System.out.println(linea);
				Matcher encontrar = patron.matcher(linea);
				Stream<MatchResult> resultados=encontrar.results();
				resultados.skip(1).forEach((e)->System.out.println(e.group()));
				
				
			System.out.println(contador);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
