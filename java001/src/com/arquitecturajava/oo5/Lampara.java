package com.arquitecturajava.oo5;

public class Lampara implements Conectable {

	private Bombilla bombilla;

	public Bombilla getBombilla() {
		return bombilla;
	}

	public void setBombilla(Bombilla bombilla) {
		this.bombilla = bombilla;
	}

	public Lampara(Bombilla bombilla) {
		super();
		this.bombilla = bombilla;
	}

	public void on() {
		bombilla.on();
	}

	public void off() {
		bombilla.off();
	}
	
	
}
