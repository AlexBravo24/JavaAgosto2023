package com.ciclos;

import java.util.Scanner;

public class Ciclos12_SMP {
	public static void main(String[] args) {
		/*
		 * 12.Se ingresan un conjunto de n edades de personas por teclado. El programa
		 * finalizara cuando el promedio de las edades sea superior a 25.
		 */

		Scanner scanner = new Scanner(System.in);

		int sumaEdades = 0;
		int cantidadEdades = 0;

		while (true) {
			System.out.print("Ingrese una edad (o ingrese -1 para finalizar): ");
			int edad = scanner.nextInt();

			if (edad == -1) {
				break; // Termina el bucle si se ingresa -1
			}

			sumaEdades += edad;
			cantidadEdades++;

			int promedio = (int) sumaEdades / cantidadEdades;
			System.out.println("Promedio de edades: " + promedio);

			if (promedio > 25) {
				System.out.println("El promedio es mayor a 25. Finalizando el programa.");
				break;
			}
		}

		scanner.close();

	}

}
