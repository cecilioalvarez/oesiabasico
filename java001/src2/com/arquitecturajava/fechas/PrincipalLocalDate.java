package com.arquitecturajava.fechas;

import java.time.LocalDate;

public class PrincipalLocalDate {

	public static void main(String[] args) {
		
		
		LocalDate ahora= LocalDate.now();
		LocalDate otra= LocalDate.of(2000, 10, 10);
		System.out.println(ahora);
		System.out.println(ahora.getDayOfMonth());
		System.out.println(ahora.getYear());
		System.out.println(ahora.getMonthValue());
		System.out.println(ahora.isAfter(otra));
		System.out.println(ahora.isBefore(otra));
		
		
		

	}

}
