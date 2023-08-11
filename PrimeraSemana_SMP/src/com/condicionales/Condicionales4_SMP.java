package com.condicionales;

import java.util.Scanner;

public class Condicionales4_SMP {
	public static void main(String[] args) {

		/*
		 * 4. Realiza un programa que lea una cadena por teclado y compruebe si es una
		 * letra mayúscula.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese una letra: ");
		String input = scanner.nextLine();

		if (input.length() == 1 && Character.isUpperCase(input.charAt(0))) {
			System.out.println("La cadena ingresada es una letra mayúscula.");
		} else {
			System.out.println("La cadena ingresada no es una letra mayúscula.");
		}

		scanner.close();
	}

}

