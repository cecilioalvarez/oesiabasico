package com.arquitecturajava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bolsa implements Iterable<String>{

	private List<String> elementos= new ArrayList<String>();
	private int tope;
	

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}
	public void remove(String elemento) {
		elementos.remove(elemento);
	}
	public void add(String elemento) {
		if (elementos.size()<tope)
		elementos.add(elemento);
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return elementos.iterator();
	}
	
}
