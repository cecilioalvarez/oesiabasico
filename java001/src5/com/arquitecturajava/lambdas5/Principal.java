package com.arquitecturajava.lambdas5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		List<Persona> lista= new ArrayList<Persona>();
		lista.add(new Persona ("pepe","perez",20));
		lista.add(new Persona ("ana","lopez",30));
		lista.add(new Persona ("david","gomez",50));
		lista.add(new Persona ("pedro","perez",10));
 		
		Stream<Persona> flujo= lista.stream();
		
		flujo.filter((p)->p.getEdad()>20).forEach((p)-> {
			
				System.out.println(p.getNombre());
		});
		

	}

}
