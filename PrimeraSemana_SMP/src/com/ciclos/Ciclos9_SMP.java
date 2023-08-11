package com.ciclos;

import java.util.Scanner;

public class Ciclos9_SMP {
	public static void main(String[] args) {
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el primer número: ");
		int numero1 = scanner.nextInt();

		System.out.print("Ingrese el segundo número: ");
		int numero2 = scanner.nextInt();
		/*
		 * La función Java.lang.math.min() es una función incorporada en Java que
		 * devuelve el mínimo de dos números. Los argumentos se toman en int, double,
		 * float y long. Si se pasa un número negativo y uno positivo como argumento, se
		 * genera el resultado negativo. Y si ambos parámetros pasados ​​son negativos
		 * entonces se genera como resultado el número con mayor magnitud.
		 */
		int menor = Math.min(numero1, numero2);
		int mayor = Math.max(numero1, numero2);

		System.out.println("Números pares entre " + menor + " y " + mayor + ":");
		for (int i = menor; i <= mayor; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		scanner.close();

	}

}
