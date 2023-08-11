package com.arrays;

import java.util.Scanner;

public class Arrays1_SMP {
	public static void main(String[] args) {
		/*
		 * 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el índice y el valor al que corresponde.
		 */
		Scanner scanner = new Scanner(System.in);

		int[] arreglo = new int[10];

		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("Ingrese un número para la posición " + i + ": ");
			arreglo[i] = scanner.nextInt();
		}

		System.out.println("Índice  Valor");
		// System.out.printf("%s%8s%n", "Indice", " Valor");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("  " + i + "       " + arreglo[i]);
			// System.out.printf("%5d%8d%n ", i ,arreglo[i]);
		}

		scanner.close();

	}

}
