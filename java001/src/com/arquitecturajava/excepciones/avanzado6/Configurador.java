package com.arquitecturajava.excepciones.avanzado6;

public class Configurador {

	private String configuracion;
	
	public Configurador(){
		super();
		
		GestorFichero gestor= new GestorFichero();
		try {
			configuracion=gestor.leerFichero("nuevo.txt");
		} catch (GestorFicheroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("el fichero de configuracion no existe",e);
		}
		
	}

	public String getConfiguracion() {
		return configuracion;
	}

	public void setConfiguracion(String configuracion) {
		this.configuracion = configuracion;
	}

	
	
}
