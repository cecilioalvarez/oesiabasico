package com.arquitecturajava.lambdas5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		List<Persona> lista= new ArrayList<Persona>();
		lista.add(new Persona ("pepe","perez",20));
		lista.add(new Persona ("ana","lopez",30));
		lista.add(new Persona ("david","gomez",50));
		lista.add(new Persona ("pedro","perez",10));
		lista.add(new Persona ("carlos","perez",60));
		lista.add(new Persona ("miguel","lopez",70));
		lista.add(new Persona ("gema","gomez",70));
		lista.add(new Persona ("sebastin","perez",10));
 		
		Stream<Persona> flujo= lista.stream();
		
		
		
		flujo
		.filter(Persona::estaJubilado)
		
		.peek((p)->System.out.println(p.getNombre()))
		
		.map((p)->p.getNombre())
		
		.peek((nombre)->System.out.println("solo nombre :"+nombre))
		
		.map((nombre)->nombre.toUpperCase())
		.peek((nombre)->System.out.println("solo mayusculas :"+nombre))
		.forEach((nombre)-> {
			
				System.out.println("*****"+nombre+"******");
			
		});
		
		
		

	}

}
