package com.arquitecturajava.oo5;

public class Moto extends Vehiculo {

	public Moto(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}
	private String tipoEncadenado;
	public String getTipoEncadenado() {
		return tipoEncadenado;
	}
	public void setTipoEncadenado(String tipoEncadenado) {
		this.tipoEncadenado = tipoEncadenado;
	}
	@Override
	public void acelerar() {
		System.out.println("acelera en 5 s");
		
	}
	
	
	
}
