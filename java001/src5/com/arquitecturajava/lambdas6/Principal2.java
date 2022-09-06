package com.arquitecturajava.lambdas6;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Principal2 {

	public static void main(String[] args) {
		
		Documento d1= new Documento(1,"java","pedro",20);
		Documento d2= new Documento(2,".net","miguel",20);
		Documento d3= new Documento(3,"java","ana",20);
		Documento d4= new Documento(4,"php","gema",10);
		Documento d5= new Documento(5,"c","pedro",20);
		Documento d6= new Documento(6,"python","pedro",20);
		
		List<Documento> lista= new ArrayList<Documento>();
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);
		lista.add(d5);
		lista.add(d6);
		
		List<Documento> lista2=lista.stream()
		.filter((d)->d.getAutor().equals("pedro"))
		.collect(Collectors.toList());
		
		for (Documento documento: lista2) {
			
			System.out.println(documento.getTitulo());
		}
		
	}

}
