package com.arrays;

import java.util.Scanner;

public class Arrays3_SMP {
	public static void main(String[] args) {
		/*
		 * 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		 * caracteres.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese una frase: ");
		String frase = scanner.nextLine();

		char[] arrayCaracteres = frase.toCharArray();

		System.out.println("La frase ingresada se ha convertido a un array de caracteres:");
		for (char c : arrayCaracteres) {
			System.out.print(c + " ");
		}

		scanner.close();
	}

}
