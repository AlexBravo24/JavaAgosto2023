package com.ciclos;

import java.util.Scanner;

public class Ciclos10_SMP {
	public static void main(String[] args) {
		/*
		 * 10. Programa que lea 20 números e indique si son positivos o negativos y
		 * pares o impares y además muestre la sumatoria de los positivos y sumatoria de
		 * los impares.
		 */
		Scanner scanner = new Scanner(System.in);

		int cantidadNumeros = 20;
		int sumaPositivos = 0;
		int sumaImpares = 0;

		for (int i = 1; i <= cantidadNumeros; i++) {
			System.out.print("Ingrese el número " + i + ": ");
			int numero = scanner.nextInt();

			if (numero > 0) {
				System.out.print("Positivo ");
				sumaPositivos += numero;
			} else if (numero < 0) {
				System.out.print("Negativo ");
			} else {
				System.out.print("Cero ");
			}

			if (numero % 2 == 0) {
				System.out.println("y Par");
			} else {
				System.out.println("y Impar");
				sumaImpares += numero;
			}
		}

		System.out.println("Sumatoria de los números positivos: " + sumaPositivos);
		System.out.println("Sumatoria de los números impares: " + sumaImpares);

		scanner.close();
	}

}
