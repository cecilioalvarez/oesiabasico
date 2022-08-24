package com.arquitecturajava.oo5;

public class Telefono  implements Conectable{

	@Override
	public void on() {
		System.out.println("enciendo el telefono");
		
	}

	@Override
	public void off() {
		System.out.println("apago el telefono");
		
	}

}
