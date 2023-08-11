package com.condicionales;

import java.util.Scanner;

public class Condicionales5_SNP {
	public static void main(String[] args) {
		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		 * los siguientes parámetros: edad, nota y sexo. 
		 * Mínimo: Nota (5), edad (18),sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 * Otros casos * -> NO ACEPTADA
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la edad: ");
		int edad = scanner.nextInt();

		System.out.print("Ingrese la nota: ");
		double nota = scanner.nextDouble();

		System.out.print("Ingrese el sexo (M/F): ");
		char sexo = scanner.next().charAt(0);

		if (nota >= 5 && edad >= 18) {
			if (sexo == 'M') {
				System.out.println("POSIBLE: La solicitud es posible.");
			} else if (sexo == 'F') {
				System.out.println("ACEPTADA: La solicitud es aceptada.");
			} else {
				System.out.println("NO ACEPTADA: Sexo no válido.");
			}
		} else {
			System.out.println("NO ACEPTADA: No cumple con los requisitos mínimos.");
		}

		scanner.close();

	}

}
