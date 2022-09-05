package com.arquitecturajava.lambdas4;

public class ImpresoraTinta implements Impresora {

	@Override
	public void imprimir() {
		System.out.println("la imprisora tinta imprime");

	}

	@Override
	public int velocidad() {
		// TODO Auto-generated method stub
		return 5;
	}

}
