package com.arquitecturajava.oo;

public class Principal {

	public static void main(String[] args) {
	
		
		Rectangulo r= new Rectangulo();
		r.setLado1(50);
		r.setLado2(7);
		System.out.println(r.getLado1());
		System.out.println(r.getLado2());
		System.out.println(r.area());
	}

}
