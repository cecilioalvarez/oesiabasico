package com.arquitecturajava.fechas;

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
		
		Calendar calendario2=Calendar.getInstance();
		calendario2.setTime(otra.getFechaNacimiento());
		
		
		System.out.println(!calendario.after(calendario2));
		return !calendario.after(calendario2);
		
		
	}
}
