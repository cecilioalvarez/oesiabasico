package com.arquitecturajava.excepciones;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		File fichero = new File("z:/nuevo.txt");
		try {
			fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ha ocurrido un error");
			System.out.println("mensaje :"+e.getMessage());
			System.out.println("***********");
			System.out.println("causa raiz :"+e.getCause());
			System.out.println("***********");
			
			for (int i=0;i< e.getStackTrace().length;i++)
			System.out.println("mensaje metodo " +i+":"+e.getStackTrace()[i]);
			System.out.println("**********");
			e.printStackTrace();
		}
		
		

	}

}
