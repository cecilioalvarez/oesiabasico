package com.arquitecturajava.lambdas2;

import java.util.function.Predicate;

public class FiltroPersonasNombre3 implements Predicate<Persona> {

	private String nombre;
	

	public FiltroPersonasNombre3(String nombre) {
		super();
		this.nombre = nombre;
	}


	@Override
	public boolean test(Persona persona) {
		return !persona.getNombre().equals(nombre);
	}

}
