package com.arquitecturajava.jdbc4.models;

import java.util.Objects;

public class Persona {

	
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private String pais;
//	private List<CompraAR> compras = new ArrayList<CompraAR>();
//
//	public void setCompras(List<CompraAR> compras) {
//		this.compras = compras;
//	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Persona(String dni, String nombre, String apellidos, int edad, String pais) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.pais = pais;
	}

	public Persona() {
		super();
	}

	public Persona(String dni) {
		super();
		this.dni = dni;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

}
