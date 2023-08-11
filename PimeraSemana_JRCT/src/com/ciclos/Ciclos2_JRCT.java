package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JRCT {

	public static void main(String[] args) {
		/*
		 * Programa un algoritmo que realice la tabla de 
		 * multiplicar de un numero introducido
desde teclado, hasta la iteración deseada por el usuario.
 Ejemplo, tabla de 23 hasta el 95.
23 x 95 = ???
		 */
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca el numero de la tabla: ");
		a = input.nextInt();
		
		System.out.println("hasta: ");
		b = input.nextInt();
		
		
		for (int i = 1; i <= b; i++) {
			System.out.println(a + " x " + i + " = " + i*b);
			}

	}

}
