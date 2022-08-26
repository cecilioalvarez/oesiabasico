package com.arquitecturajava.fechas;

import java.time.LocalDate;

public class Jugador implements Comparable {

	private String nombre;
	private int numero;
	private LocalDate fechaNacimiento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate edad) {
		this.fechaNacimiento = edad;
	}

	public Jugador(String nombre, int numero, LocalDate edad) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.fechaNacimiento = edad;
	}

	@Override
	public int compareTo(Object otro) {

		Jugador j = (Jugador) otro;

		if (j.getFechaNacimiento().isAfter(this.getFechaNacimiento())) {

			return 1;
		} else if (j.getFechaNacimiento().equals(this.getFechaNacimiento())) {
			return 0;
		} else
			return -1;

	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", numero=" + numero + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
