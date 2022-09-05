package com.arquitecturajava.lambdas5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
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
		
		Predicate<Persona> pp= (Persona personita)-> personita.getEdad()>20;
		System.out.println(pp.test(p));
		
		lista.add(p);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		
		
		
		
		Stream<Persona> flujo= lista.stream();
		
		flujo
		.map(Persona::getLibros)
		.flatMap((libros)->libros.stream())
		.map(Libro::getPrecio)
		.forEach(System.out::println);
		
		
		
		
		
		
		

	}

}
