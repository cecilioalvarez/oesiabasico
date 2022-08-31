package com.arquitecturajava.jdbc4;

import java.util.List;

import com.arquitecturajava.jdbc4.models.Persona;
import com.arquitecturajava.jdbc4.repositories.jdbc.PersonaRepositoryJDBC;

public class Principal1 {

	public static void main(String[] args) {

		PersonaRepositoryJDBC repositorio= new PersonaRepositoryJDBC();
		
		List<Persona> lista= repositorio.buscarTodos();
		for (Persona p :lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			
		}
		
		Persona p= new Persona("10","david","gomez",20,"colombia");
		repositorio.insertar(p);
		System.out.println("*************");
		List<Persona> lista2= repositorio.buscarTodos();
		for (Persona p2 :lista2) {
			
			System.out.println(p2.getNombre());
			System.out.println(p2.getApellidos());
			
		}
		
	}
}
