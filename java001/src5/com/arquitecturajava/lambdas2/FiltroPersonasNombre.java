package com.arquitecturajava.lambdas2;

public class FiltroPersonasNombre implements FiltroPersonas {

	private String nombre;
	
	
	
	
	public FiltroPersonasNombre(String nombre) {
		super();
		this.nombre = nombre;
	}




	@Override
	public boolean filtrar(Persona persona) {
		// TODO Auto-generated method stub
		return !persona.getNombre().equals(nombre);
	}

}
