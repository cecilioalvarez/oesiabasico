package com.arquitecturajava.oo5;

public class Televisor implements Conectable{

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Televisor(String marca) {
		super();
		this.marca = marca;
	}

	@Override
	public void on() {
		System.out.println("el televisor" + marca+ "se enciende");
		
	}

	@Override
	public void off() {
		System.out.println("el televisor" + marca+ "se apaga");
		
		
	}
	
	
}
