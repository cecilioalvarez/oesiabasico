package com.arquitecturajava.jdbc4.repositories;

import java.util.List;

import com.arquitecturajava.jdbc4.models.Persona;

public interface PersonaRepository {

	List<Persona> buscarTodos();

	List<Persona> buscarTodosConCompras();

	Persona buscarUna(String dni);

	void insertar(Persona p);

	void borrar(Persona p);

}