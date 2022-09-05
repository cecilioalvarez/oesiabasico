package com.arquitecturajava.lambdas2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal3 {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "alvarez", 50));
		lista.add(new Persona("andres", "marquez", 30));
		lista.add(new Persona("ana", "bolado", 60));
		lista.add(new Persona("anabel", "rojo", 10));
		lista.add(new Persona("ana", "bolado", 60));

		impirmirFiltrada(lista, new FiltroPersonasNombre3("ana"));
		System.out.println("***************");
		impirmirFiltrada(lista, (p)->p.getNombre().equals("andres"));
		

	}

	public static void impirmirFiltrada(List<Persona> lista, Predicate<Persona> filtro) {

		for (Persona p : lista) {

			if (filtro.test(p)) {

				System.out.println(p.getNombre());
				System.out.println(p.getApellidos());
				System.out.println(p.getEdad());
			}
		}

	}
}
