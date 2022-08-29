package com.arquitecturajava.fechas.colecciones;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {

		HashMap<String,Persona> map= new HashMap<String,Persona>();
		Persona p1= new Persona("1","pedro","perez");
		Persona p2= new Persona("2","juan","sanchez");
		Persona p3= new Persona("3","david","gomez");
		map.put(p1.getDni(), p1);
		map.put(p2.getDni(), p2);
		map.put(p3.getDni(), p3);
		
		System.out.println(map.get("1").getNombre());
		System.out.println(map.get("1").getApellidos());
		System.out.println(map.get("1").getDni());
		
		System.out.println(map.get("2").getNombre());
		System.out.println(map.get("2").getApellidos());
		System.out.println(map.get("2").getDni());
		
		System.out.println(map.get("3").getNombre());
		System.out.println(map.get("3").getApellidos());
		System.out.println(map.get("3").getDni());
		
		
		for(Map.Entry<String,Persona> claves: map.entrySet()) {
			
			String clave= claves.getKey();
			System.out.println(map.get(clave).getNombre());
			
			
		}
		
		
		

	}

}
