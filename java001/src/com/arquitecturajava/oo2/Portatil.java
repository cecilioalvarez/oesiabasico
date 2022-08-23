package com.arquitecturajava.oo2;

public class Portatil {

	private String marca;

	private Cargador cargador;
	
	public Cargador getCargador() {
		return cargador;
	}

	public void setCargador(Cargador cargador) {
		this.cargador = cargador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Portatil(String marca, Cargador cargador) {
		super();
		this.marca = marca;
		this.cargador = cargador;
	}

	public Portatil(String marca) {
		super();
		this.marca = marca;
	}
	
	
}
