package com.arquitecturajava.lambdas1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {

		
		
		List<Persona> bolsaPersonas= new ArrayList<Persona>();
		bolsaPersonas.add(new Persona("miguel",20));
		bolsaPersonas.add(new Persona("antonio",30));
		bolsaPersonas.add(new Persona("ana",10));
		bolsaPersonas.add(new Persona("jose",15));
		
		bolsaPersonas.add(new Persona("david",50));
		bolsaPersonas.add(new Persona("gema",20));
		
		Collections.sort(bolsaPersonas, new EdadComparator());
		for (Persona p : bolsaPersonas) {

			System.out.println(p.getNombre());
		}
		
		
	}
}
