package com.arquitecturajava.oo3;

public class Principal {

	public static void main(String[] args) {
		
		
		Persona p= new Persona();
		p.setNombre("juan");
		System.out.println(p.getNombre());
		Deportista d= new Deportista();
		d.setNombre("maria");
		d.setDeporte("padel");
		System.out.println(d.getNombre());
		System.out.println(d.getDeporte());
	}

}
