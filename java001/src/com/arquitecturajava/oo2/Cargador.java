package com.arquitecturajava.oo2;

public class Cargador {

	private String marca;
	private String tipo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Cargador(String marca, String tipo) {
		super();
		this.marca = marca;
		this.tipo = tipo;
	}
	
	
	
}
