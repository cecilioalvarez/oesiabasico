package com.arquitecturajava.oo4;

public class FactoriaDocumentos {

	
	public Documento creaDocumento(String texto,String tipo) {
		
		if (tipo.equals("HTML")) {
			
			return new DocumentoHTML(texto);
		}else {
			return new DocumentoPDF(texto);
		}
	}
}
