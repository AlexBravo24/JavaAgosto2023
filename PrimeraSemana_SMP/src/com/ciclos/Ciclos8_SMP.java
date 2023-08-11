package com.ciclos;

import java.util.Scanner;

public class Ciclos8_SMP {
	public static void main(String[] args) {
		/*
		 * 8. Programa Java que lea dos números y muestre los números desde el menor
		 * hasta el mayor
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el primer número: ");
		int numero1 = scanner.nextInt();

		System.out.print("Ingrese el segundo número: ");
		int numero2 = scanner.nextInt();

		int menor = Math.min(numero1,
				numero2);/*
							 * La función Java.lang.math.min() es una función incorporada en Java que
							 * devuelve el mínimo de dos números. Los argumentos se toman en int, double,
							 * float y long. Si se pasa un número negativo y uno positivo como argumento, se
							 * genera el resultado negativo. Y si ambos parámetros pasados ​​son negativos
							 * entonces se genera como resultado el número con mayor magnitud.
							 */
		int mayor = Math.max(numero1, numero2);

		System.out.println("Números desde el menor hasta el mayor:");
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}

		scanner.close();

	}

}
