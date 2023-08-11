package com.condicionales;

import java.util.Scanner;

public class Condicionales2_SMP {
	public static void main(String[] args) {

		/*
		 * 2.Realiza un programa que pida un número por teclado y nos indique si es par
		 * o impar
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El número ingresado es par.");
		} else {
			System.out.println("El número ingresado es impar.");
		}

		scanner.close();
	}
}
