package com.arquitecturajava.fechas;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
	
//		Calendar calendario= Calendar.getInstance();
//		calendario.set(2020, 10,10);
//		
////		System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
////		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
////		System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
//		System.out.println(calendario.get(Calendar.MONTH));
//		System.out.println(calendario.get(Calendar.YEAR));
////		System.out.println(calendario.get(Calendar.HOUR));
////		System.out.println(calendario.get(Calendar.MINUTE));
////		System.out.println(calendario.get(Calendar.SECOND));
//		calendario.add(Calendar.MONTH, 1);
//		calendario.add(Calendar.YEAR, 1);
//		System.out.println(calendario.get(Calendar.MONTH));
//		System.out.println(calendario.get(Calendar.YEAR));
		
		String fecha= "01/01/2023";
		SimpleDateFormat formateador= new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date fechaReal= formateador.parse(fecha);
			Calendar calendario= Calendar.getInstance();
			calendario.setTime(fechaReal);
			
			System.out.println(calendario.get(Calendar.YEAR));
			System.out.println(calendario.get(Calendar.MONTH));
			System.out.println(calendario.get(Calendar.DATE));
			
			
			
			System.out.println(formateador.format(calendario.getTime()));
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
