package com.arquitecturajava.miproyecto;

import java.util.List;

import com.arquitecturajava.jdbc4.models.Compra;
import com.arquitecturajava.jdbc4.models.Persona;
import com.arquitecturajava.miproyecto.repositories.CompraRepository;
import com.arquitecturajava.miproyecto.repositories.PersonaRepository;
import com.arquitecturajava.miproyecto.repositories.jdbc.CompraRepositoryJDBC;
import com.arquitecturajava.miproyecto.repositories.jdbc.PersonaRepositoryJDBC;
import com.arquitecturajava.miproyecto.servicios.PersonasService;

public class Principal3 {

	public static void main(String[] args) {

		PersonaRepository repoP= new PersonaRepositoryJDBC();
		CompraRepository repoC= new CompraRepositoryJDBC();
		
		PersonasService servicio= new PersonasService(repoP, repoC);
		System.out.println("*******************");
		List<Persona> lista=servicio.buscarTodosLasPersonasConCompras();
		for (Persona p :lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			for (Compra c: p.getCompras()) {
				
				System.out.println(c.getConcepto());
			}
			
		}
		
		
	}
}
