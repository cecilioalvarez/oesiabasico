package com.arquitecturajava.cecilio.inicio.complementario;

public class PrincipalForAnidado {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			System.out.println(i);
			for (int j = 0; j < 5; j++) {
				System.out.println("     " + j);
			}
		}

	}

}
