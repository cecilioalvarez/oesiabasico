package com.arquitecturajava.oo6;

public class PrincipalEquipo {

	public static void main(String[] args) {
		
		SoldadoEjercitoTierra s1= new SoldadoEjercitoTierra();
		SoldadoEjercitoTierra s2= new SoldadoEjercitoTierra();
		SoldadoEjercitoTierra s3= new SoldadoEjercitoTierra();
		EquipoAsalto equipo= new EquipoAsalto(5);
		equipo.addSoldado(s1);
		equipo.addSoldado(s2);
		equipo.addSoldado(s3);
		equipo.addSoldado(new SoldadoEjercitoTierraEspia());
		equipo.addSoldado(new SoldadoEjercitoTierraEspia());
		System.out.println(equipo.estaPreparado());
		

	}

}
