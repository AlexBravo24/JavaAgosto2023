package com.condicionales;

import java.util.Scanner;

public class Condicionales7_APMHZ {

	public static void main(String[] args) {
		
		// El director de una escuela esta organizando un viaje de estudios
		// y requiere determinar cuanto debe cobrar a cada alumno
		// y cuanto debe pagar a la compañia de viajes por el servicio.
		// La forma de cobrar es la siguiente:
		//
		// Si son 100 alumnos o mas, el costo por cada alumno es de 65 euros
		// De 50 a 99 alumnos, el costo es de 70 euros
		// De 30 a 49 alumnos, el costo es de 95 euros
		// Menos de 30 alumnos, el costo de la renta del autobus es de 4000 euros
		// sin importar el numero de alumnos
		//
		// Realiza un algoritmo que permita determinar el pago a la compañia de autobuses
		// y lo que debe pagar cada alumno por el viaje
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("¿Cuantos alumnos iran al viaje?");
		int alumnos = input.nextInt();
		
		input.close();
		
		if (alumnos >= 100) {
			System.out.println("Cada alumno debe pagar 65 euros");
			System.out.println("Debe pagar a la compañia de autobuses: " + (alumnos*65) + " euros");
		}
		else if ((alumnos >= 50) && (alumnos <= 99)) {
			System.out.println("Cada alumno debe pagar 70 euros");
			System.out.println("Debe pagar a la compañia de autobuses: " + (alumnos*70) + " euros");
		}
		else if ((alumnos >= 30) && (alumnos <= 49)) {
			System.out.println("Cada alumno debe pagar 95 euros");
			System.out.println("Debe pagar a la compañia de autobuses: " + (alumnos*95) + " euros");
		}
		else if (alumnos < 30) {
			double costo = (4000d/alumnos);
			costo = Math.round(costo*100)/100d;
			System.out.println("Cada alumno debe pagar " + (costo) + " euros");
			System.out.println("Debe pagar a la compañia de autobuses: 4000 euros");
		}
		
		

	}

}
