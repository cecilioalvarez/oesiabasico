package com.arquitecturajava.oo5;

import java.util.ArrayList;
import java.util.List;

public class LamparaTecho  implements Conectable{

	
	List<Conectable> conectables= new ArrayList<Conectable>();

	public void addBombilla(Bombilla b) {
		
		conectables.add(b);
	}
	public void addTelefono(Telefono telefono) {
		
		conectables.add(telefono);
	}
	
	@Override
	public void on() {
	
		for (Conectable c: conectables) {
			c.on();
		}
		
	}

	@Override
	public void off() {
		for (Conectable c: conectables) {
			c.on();
		}
		
	}

}
