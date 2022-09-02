package com.arquitecturajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {

		
		
		List<Persona> bolsaPersonas= new ArrayList<Persona>();
		bolsaPersonas.add(new Persona("miguel"));
		bolsaPersonas.add(new Persona("antonio"));
		bolsaPersonas.add(new Persona("ana"));
		bolsaPersonas.add(new Persona("jose"));
		
		bolsaPersonas.add(new Persona("david"));
		bolsaPersonas.add(new Persona("gema"));
		
		Collections.sort(bolsaPersonas);
		for (Persona p : bolsaPersonas) {

			System.out.println(p.getNombre());
		}
		
		
	}
}
