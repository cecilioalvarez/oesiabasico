package com.arquitecturajava.oo2;

import java.util.ArrayList;

public class Equipo {

	private String nombre;

	private ArrayList<Jugador> jugadores= new ArrayList<Jugador>();
	
	public void addJugador(Jugador jugador) {
		
		jugadores.add(jugador);
	}
	
	public void remove(int posicion) {
		
		jugadores.remove(posicion);
	}
	
	public Jugador jugadorNumeroMasAlto() {
		
		int numero=0;
		Jugador jugadorSeleccionado=null;
		for (Jugador j : jugadores) {
			
			if (j.getNumero()>numero) {
				
				jugadorSeleccionado=j;
				numero=j.getNumero();
			}
			
		}
		return jugadorSeleccionado;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
}
