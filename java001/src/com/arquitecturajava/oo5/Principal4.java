package com.arquitecturajava.oo5;

public class Principal4 {

	public static void main(String[] args) {
	
		
//		Conectable c= new Televisor("samsung");
//		
//		c.on();
//		c.off();
		
		Bombilla b= new Bombilla(90);
		Lampara l= new Lampara(b);
		l.on();
	}

}
