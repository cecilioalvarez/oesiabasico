package com.arquitecturajava.oo2;

import java.util.ArrayList;

public class PrincipalJugador {

	public static void main(String[] args) {
		
		
		Jugador j= new Jugador( "pedro",2);
		Jugador j2= new Jugador( "pedro2",15);
		Jugador j3= new Jugador( "pedro3",20);
		Jugador j4= new Jugador( "pedro4",7);
		Equipo e= new Equipo("miequpo");
		
		e.addJugador(j);
		e.addJugador(j2);
		e.addJugador(j3);
		e.addJugador(j4);
		
		System.out.println(e.jugadorNumeroMasAlto().getNombre());
		
	}

}
