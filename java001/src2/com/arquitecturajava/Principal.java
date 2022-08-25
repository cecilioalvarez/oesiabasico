package com.arquitecturajava;

import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
	
		Calendar calendario= Calendar.getInstance();
		calendario.set(2020, 10,10);
		
		System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
		
		
		
		

	}

}
