package com.arquitecturajava.oo2;

public class Principal {
public static void main(String[] args) {
	
	
	Portatil p= new Portatil("samsung");
	Cargador c= new Cargador("belking","usbc",100);
	System.out.println(c.getPrecio());
	p.setCargador(c);
	
	System.out.println(p.getCargador().getTipo());
	
}
}
