package com.arquitecturajava.oo5;

public class Coche extends Vehiculo {

	
	public Coche(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}
	private int plazas;
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	@Override
	public void acelerar() {
		System.out.println("acelerea en 10s");
		
	}
	
	
	
	
}
