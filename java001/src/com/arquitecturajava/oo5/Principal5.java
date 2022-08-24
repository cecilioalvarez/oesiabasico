package com.arquitecturajava.oo5;

public class Principal5 {

	public static void main(String[] args) {
		
		Bombilla b= new Bombilla(100);
		Bombilla b2= new Bombilla(80);
		
		LamparaTecho lt= new LamparaTecho();
		lt.addBombilla(b);
		lt.addBombilla(b2);
		lt.on();
	}
}
