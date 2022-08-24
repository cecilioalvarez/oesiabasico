package com.arquitecturajava.oo5;

public class Principal3 {

	public static void main(String[] args) {
		
		
		Coche c= new Coche("toyota","yaris");
		c.setMarca("toyota");
		c.setModelo("yaris");
		c.setPlazas(4);

		c.acelerar();
	}

}
