package com.arquitecturajava;

import java.util.Calendar;
import java.util.Date;

public class Persona {

	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	
	
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Persona(String nombre, String apellidos, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean esMayor(Persona otra) {
		
		Calendar calendario=Calendar.getInstance();
		calendario.setTime(getFechaNacimiento());
		return !calendario.after(otra.getFechaNacimiento());
		
		
	}
}
