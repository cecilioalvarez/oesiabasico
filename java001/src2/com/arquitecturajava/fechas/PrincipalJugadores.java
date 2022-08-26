package com.arquitecturajava.fechas;

import java.time.LocalDate;

public class PrincipalJugadores {

	public static void main(String[] args) {
		
		Equipo e= new Equipo();
		e.addJugador(new Jugador("juan",2,LocalDate.of(2005, 8, 25)));
		e.addJugador(new Jugador("david",2,LocalDate.of(1992, 8, 25)));
		e.addJugador(new Jugador("angel",2,LocalDate.of(2003, 8, 25)));
		e.addJugador(new Jugador("antonio",2,LocalDate.of(1980, 8, 25)));
		e.addJugador(new Jugador("miguel",2,LocalDate.of(2004, 8, 25)));
		e.addJugador(new Jugador("ernesto",2,LocalDate.of(1993, 8, 25)));
	
//		System.out.println(e.getEdadMedia());
//		System.out.println(e.getCapitan().getNombre());
//		System.out.println(e.getJugadorMasJoven().getNombre());
		for (Jugador j: e.getCapitanes()) {
			System.out.println(j.getNombre());
		}
	}

}
