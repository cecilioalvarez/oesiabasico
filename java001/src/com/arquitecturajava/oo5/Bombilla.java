package com.arquitecturajava.oo5;

public class Bombilla implements Conectable{

	private int potencia;

	public Bombilla(int potencia) {
		super();
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public void on() {
		System.out.println("la bombilla se enciende");
		
	}

	@Override
	public void off() {
		System.out.println("la bombilla se apaga");
		
	}
	
}
