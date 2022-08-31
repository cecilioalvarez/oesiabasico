package com.arquitecturajava.miproyecto.repositories;

import com.arquitecturajava.jdbc4.models.Compra;

public interface CompraRepository {

	void insertar(Compra compra);

	void borrar(Compra compra);

}