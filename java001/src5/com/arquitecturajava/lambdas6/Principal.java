package com.arquitecturajava.lambdas6;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Principal {

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
		
		OptionalInt total=lista.stream()
		.filter((d)->d.getAutor().equals("pedro"))
		.mapToInt((d)->d.getPaginas()).reduce((a,p)->a+p);
		
		if (total.isPresent()) {
			System.out.println(total.getAsInt());
		}
		
		
		int total2=lista.stream()
				.filter((d)->d.getAutor().equals("pedro"))
				.mapToInt((d)->d.getPaginas()).sum();
				
				System.out.println(total2);
		
	}

}
