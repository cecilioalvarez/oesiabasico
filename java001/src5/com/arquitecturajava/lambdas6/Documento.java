package com.arquitecturajava.lambdas6;

public class Documento {

	private int numero;
	private String titulo;
	private String autor;
	private int paginas;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Documento(int numero, String titulo, String autor, int paginas) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	
}
