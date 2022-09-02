package com.arquitecturajava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalFunciones1 {

	public static void main(String[] args) {

		List<Persona> bolsaPersonas = new ArrayList<Persona>();
		bolsaPersonas.add(new Persona("miguel", 20));
		bolsaPersonas.add(new Persona("antonio", 30));
		bolsaPersonas.add(new Persona("ana", 10));
		bolsaPersonas.add(new Persona("jose", 15));

		bolsaPersonas.add(new Persona("david", 50));
		bolsaPersonas.add(new Persona("gema", 20));

		Collections.sort(bolsaPersonas, new EdadComparator());
		for (Persona p : bolsaPersonas) {

			System.out.println(p.getNombre());
		}
		System.out.println("***********");

		Comparator<Persona> comparador= (o1,o2)->o1.getNombre().compareTo(o2.getNombre());
		ordenarLista(bolsaPersonas,comparador);
		
		
	}
	public static void ordenarLista(List<Persona> lista, Comparator<Persona> comparador) {
		
		Collections.sort(lista,comparador);
		for (Persona p : lista) {

			System.out.println(p.getNombre());
		}
		
	}
	
}
