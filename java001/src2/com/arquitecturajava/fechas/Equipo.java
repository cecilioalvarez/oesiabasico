package com.arquitecturajava.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Equipo {

	List<Jugador> jugadores = new ArrayList<Jugador>();

	public void addJugador(Jugador j) {

		jugadores.add(j);
	}

	public double getEdadMedia() {

		double total = 0;
		LocalDate fechaActual = LocalDate.now();

		for (Jugador j : jugadores) {

			LocalDate fechaNacimiento = j.getFechaNacimiento();
			Period periodo = Period.between(fechaNacimiento, fechaActual);
			int años = periodo.getYears();
			total += años;

		}
		return total / jugadores.size();
	}

	public Jugador getCapitan() {

		Jugador j = jugadores.get(0);

		for (Jugador jugador : jugadores) {

			if (jugador.getFechaNacimiento().isBefore(j.getFechaNacimiento())) {

				j = jugador;
			}
		}

		return j;

	}

	public Jugador getJugadorMasJoven() {

		Jugador j = jugadores.get(0);

		for (Jugador jugador : jugadores) {

			if (jugador.getFechaNacimiento().isAfter(j.getFechaNacimiento())) {

				j = jugador;
			}
		}

		return j;

	}

	public List<Jugador> getCapitanes() {
		
		
		Collections.sort(jugadores);
		ArrayList<Jugador> lista= new ArrayList<Jugador>();
		lista.add(jugadores.get(jugadores.size()-1));
		lista.add(jugadores.get(jugadores.size()-2));
		lista.add(jugadores.get(jugadores.size()-3));
		return lista;
		
	}
	
	
}
