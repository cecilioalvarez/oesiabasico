package com.arquitecturajava.oo6;

import java.util.ArrayList;
import java.util.List;

public class EquipoAsalto {

	private int numeroSoldados;

	public EquipoAsalto(int numeroSoldados) {
		super();
		this.numeroSoldados = numeroSoldados;
	}

	public int getNumeroSoldados() {
		return numeroSoldados;
	}

	private List<Soldado> soldados = new ArrayList<Soldado>();

	public List<Soldado> getSoldados() {
		return soldados;
	}

	public void setSoldados(List<Soldado> soldados) {
		this.soldados = soldados;
	}

	public void addSoldado(Soldado soldado) {

		if (soldados.size() < 5)
			soldados.add(soldado);
	}

	public boolean estaPreparado() {

		boolean tieneConductor = false;
		boolean tieneBuzo = false;

		for (Soldado s : soldados) {

			if (s.isConductor())
				tieneConductor = true;
			if (s.isBuzo())
				tieneBuzo = true;

		}
		System.out.println(tieneConductor);
		System.out.println(tieneBuzo);
		System.out.println(soldados.size());

		if (soldados.size() == numeroSoldados && tieneBuzo && tieneConductor)
			return true;
		else
			return false;
	}

	public void disparar() {

		for (Soldado s : soldados) {

			s.disparar();

		}

	}

}
