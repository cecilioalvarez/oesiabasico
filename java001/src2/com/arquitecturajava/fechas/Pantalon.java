package com.arquitecturajava.fechas;

public class Pantalon {

	private String color;
	private static int contador;
	
	public static int getContador() {
		return contador;
	}

	public static  void setContador(int contador) {
		Pantalon.contador = contador;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Pantalon(String color) {
		super();
		this.color = color;
		contador=contador+1;
	}
	
	
}
