package com.arquitecturajava.lambdas5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		List<Persona> lista= new ArrayList<Persona>();
		Persona p= new Persona("pepe","perez",20);
		Persona p2= new Persona("pepe","perez",20);
		Persona p3= new Persona("pepe","perez",20);
		Persona p4= new Persona("pepe","perez",20);
		Persona p5= new Persona("pepe","perez",20);
		p.addLibro(new Libro ("java",20));
		p2.addLibro(new Libro ("net",25));
		p3.addLibro(new Libro ("php",20));
		p4.addLibro(new Libro ("c",20));
		
		lista.add(p);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		
		
		
		
		Stream<Persona> flujo= lista.stream();
		
		flujo.
		map((persona)->persona.getLibros()).forEach((listado)-> {
			
			listado.forEach((l)->System.out.println(l.getPrecio()));
			
		});
		
		
		
		
		
		
		

	}

}
