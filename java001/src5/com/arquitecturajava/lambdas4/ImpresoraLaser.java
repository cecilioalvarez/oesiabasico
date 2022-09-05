package com.arquitecturajava.lambdas4;

public class ImpresoraLaser implements Impresora {

	@Override
	public void imprimir() {
		System.out.println("la impresora laser imprime");
		
	}

	@Override
	public int velocidad() {
		return 20;
	}

}
