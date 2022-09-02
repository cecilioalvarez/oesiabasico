package com.arquitecturajava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bolsa<T> implements Iterable<T>{

	private List<T> elementos= new ArrayList<T>();
	private int tope;
	

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}
	public void remove(T elemento) {
		elementos.remove(elemento);
	}
	public void add(T elemento) {
		if (elementos.size()<tope)
		elementos.add(elemento);
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return elementos.iterator();
	}
	
}
