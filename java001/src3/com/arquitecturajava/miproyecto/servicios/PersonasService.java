package com.arquitecturajava.miproyecto.servicios;

import java.util.List;

import com.arquitecturajava.jdbc4.models.Compra;
import com.arquitecturajava.jdbc4.models.Persona;
import com.arquitecturajava.miproyecto.repositories.CompraRepository;
import com.arquitecturajava.miproyecto.repositories.PersonaRepository;

public class PersonasService {

	private PersonaRepository personaRepositorio;
	private CompraRepository compraRepositorio;
	
	public PersonasService(PersonaRepository personaRepositorio, CompraRepository compraRepositorio) {
		super();
		this.personaRepositorio = personaRepositorio;
		this.compraRepositorio = compraRepositorio;
	}

	public List<Persona> buscarTodosLasPersonas() {
		return personaRepositorio.buscarTodos();
	}

	public List<Persona> buscarTodosLasPersonasConCompras() {
		return personaRepositorio.buscarTodosConCompras();
	}

	public Persona buscarUnaPersona(String dni) {
		return personaRepositorio.buscarUna(dni);
	}

	public void insertarPersona(Persona p) {
		personaRepositorio.insertar(p);
	}

	public void borrarPersona(Persona p) {
		personaRepositorio.borrar(p);
	}

	public void insertarCompra(Compra compra) {
		compraRepositorio.insertar(compra);
	}

	public void borrarCompra(Compra compra) {
		compraRepositorio.borrar(compra);
	}
	
	
	
	
	
	
}
