package com.ciclos;

import java.util.Scanner;

public class Ciclos2_SMP {

	public static void main(String[] args) {
		/*
		 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		 * introducido desde teclado, hasta la iteración deseada por el usuario.
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el número para generar la tabla de multiplicar: ");
		int numero = scanner.nextInt();

		System.out.print("Ingrese el número de iteración deseada: ");
		int iteracionDeseada = scanner.nextInt();

		System.out.println("Tabla de multiplicar del " + numero + " hasta la iteración " + iteracionDeseada + ":");
		for (int i = 1; i <= iteracionDeseada; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

		scanner.close();

	}

}
