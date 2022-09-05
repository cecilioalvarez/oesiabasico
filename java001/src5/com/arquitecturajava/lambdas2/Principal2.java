package com.arquitecturajava.lambdas2;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "alvarez", 50));
		lista.add(new Persona("andres", "marquez", 30));
		lista.add(new Persona("ana", "bolado", 60));
		lista.add(new Persona("anabel", "rojo", 10));
		lista.add(new Persona("ana", "bolado", 60));

		impirmirFiltrada(lista, new FiltroPersonasNombre("ana"));
		System.out.println("*******************");
		impirmirFiltrada(lista, (p)->p.getNombre().equals("pedro"));

	}

	public static void impirmirFiltrada(List<Persona> lista, FiltroPersonas filtro) {

		for (Persona p : lista) {

			if (filtro.filtrar(p)) {

				System.out.println(p.getNombre());
				System.out.println(p.getApellidos());
				System.out.println(p.getEdad());
			}
		}

	}
}
