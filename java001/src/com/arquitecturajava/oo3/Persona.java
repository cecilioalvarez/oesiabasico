package com.arquitecturajava.oo3;

public class Persona {

	private String nombre;


	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void andar() {
		
		System.out.println("la persona anda a 3 km/hora");
	}
	
}
