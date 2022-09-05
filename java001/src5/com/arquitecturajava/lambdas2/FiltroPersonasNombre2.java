package com.arquitecturajava.lambdas2;

public class FiltroPersonasNombre2 implements Filtro<Persona> {

	private String nombre;
	

	public FiltroPersonasNombre2(String nombre) {
		super();
		this.nombre = nombre;
	}


	@Override
	public boolean filtrar(Persona persona) {
		// TODO Auto-generated method stub
		return !persona.getNombre().equals(nombre);
	}

}
