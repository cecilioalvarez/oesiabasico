package com.arquitecturajava.fechas;

import java.util.Objects;

public class Factura  implements Comparable<Factura>{

	private int numero;
	private String concepto;
	private double importe;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	@Override
	public int compareTo(Factura o) {
		
		if (this.getImporte()>o.getImporte()) {
			return 1;
		}else if (this.getImporte()==o.getImporte()) return 0;
		else return -1;
	}
	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return numero == other.numero;
	}
	

	
}
