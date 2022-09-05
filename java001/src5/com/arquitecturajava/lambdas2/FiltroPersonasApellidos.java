package com.arquitecturajava.lambdas2;

public class FiltroPersonasApellidos implements FiltroPersonas {

	private String apellidos;
	
	public FiltroPersonasApellidos(String apellidos) {
		super();
		this.apellidos = apellidos;
	}

	@Override
	public boolean filtrar(Persona persona) {
		// TODO Auto-generated method stub
		return !persona.getApellidos().equals(apellidos);
	}
}
