package com.ciclos;

import java.util.Scanner;

public class Ciclos3_SMP {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese una palabra o frase sin espacios: ");
		String palabra = scanner.nextLine(), palindromo = "";
		int it = (palabra.length());

		for (int i = it; 0 < i; i--) {
			palindromo = palindromo + palabra.charAt(i - 1);
		}
		System.out.println(palindromo);
		System.out.println(palabra);

		if (palindromo.equalsIgnoreCase(palabra)) {
			System.out.println("El texto ingresado es un palíndromo.");
		} else {
			System.out.println("El texto ingresado NO es un palíndromo.");
		}

		scanner.close();
	}

}
