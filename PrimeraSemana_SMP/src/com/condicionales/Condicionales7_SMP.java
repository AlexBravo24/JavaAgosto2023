package com.condicionales;

import java.util.Scanner;

public class Condicionales7_SMP {
	public static void main(String[] args) {

		/*
		 * 7. El director de una escuela está organizando un viaje de estudios y
		 * requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
		 * compañía de viajes por el servicio. La forma de cobrar es la siguiente: Si
		 * son 100 alumnos o más, el costo por cada alumno es de 65 euros. De 50 a 99
		 * alumnos, el costo es de 70 euros. De 30 a 49 alumnos, el costo es de 95
		 * euros. Menos de 30 alumnos, el costo de la renta del autobús es de 4000
		 * euros, sin importar el número de alumnos. Realiza un algoritmo que permita
		 * determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno
		 * por el viaje.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el número de alumnos: ");
		int numAlumnos = scanner.nextInt();
		double costoAlumno = 0;
		double costoTotal = 0;

		if (numAlumnos >= 100) {
			costoAlumno = 65.0;
		} else if (numAlumnos >= 50 && numAlumnos <= 99) {
			costoAlumno = 70.0;
		} else if (numAlumnos >= 30 && numAlumnos <= 49) {
			costoAlumno = 95.0;
		} else {
			costoTotal = 4000.0;
		}

		if (costoAlumno > 0) {
			costoTotal = numAlumnos * costoAlumno;
		}

		System.out.println("El costo total para la compañía de autobuses es: " + costoTotal + " euros");

		if (costoAlumno > 0) {
			System.out.println("El costo por alumno es: " + costoAlumno + " euros");
		} else {
			System.out.println("El costo por alumno no aplica en este caso.");
		}

		scanner.close();

	}

}
