package com.arquitecturajava.lambdas2;

public class FiltroPersonasNombre implements FiltroPersonas {

	@Override
	public boolean filtrar(Persona persona) {
		// TODO Auto-generated method stub
		return !persona.getNombre().equals("ana");
	}

}
