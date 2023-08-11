package com.arrays;

public class Arrays2_SMP {

	public static void main(String[] args) {
		/*
		 * 2. Crea un array de números de 100 posiciones, que contendrá los números del
		 * 1 al 100. Obtén la suma de todos ellos y la media
		 */
		int[] array = new int[100];
		int subindice = 0;
		while (subindice < 100) {
			array[subindice] = subindice + 1;
			subindice++;
		}

		// Rellenamos el array con los números del 1 al 100
		// for (int i = 0; i < 100; i++) {
		// array[i] = i + 1;
		// }
		System.out.println("Contenido del array");
		for (int i = 0; i < 100; i++) {
			System.out.println(array[i]);
		}
		// Imprimimos los números del array
		int suma = 0;
		for (int num : array) {
			suma += num;
		}

		double media = (double) suma / array.length;

		System.out.println("Suma de los 100 números: " + suma);
		System.out.println("Media de los números: " + media);
	}

}
