package com.arquitecturajava;

import java.util.Comparator;

public class EdadComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		if (o1.getEdad() > o2.getEdad()) {

			return 1;
		} else if (o1.getEdad() == o2.getEdad()) {

			return 0;
		} else
			return -1;

	}

}
