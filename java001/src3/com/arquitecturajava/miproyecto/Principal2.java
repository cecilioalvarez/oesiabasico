package com.arquitecturajava.miproyecto;

import java.util.List;

import com.arquitecturajava.jdbc4.models.Compra;
import com.arquitecturajava.jdbc4.models.Persona;
import com.arquitecturajava.miproyecto.repositories.PersonaRepository;
import com.arquitecturajava.miproyecto.repositories.jdbc.PersonaRepositoryJDBC;

public class Principal2 {

	public static void main(String[] args) {

		PersonaRepository repositorio= new PersonaRepositoryJDBC();
		
		List<Persona> lista= repositorio.buscarTodosConCompras();
		for (Persona p :lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			for (Compra c: p.getCompras()) {
				
				System.out.println(c.getConcepto());
			}
			
		}
		
		
	}
}
