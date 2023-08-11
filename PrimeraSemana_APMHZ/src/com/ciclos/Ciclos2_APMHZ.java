package com.ciclos;

import java.util.Scanner;

public class Ciclos2_APMHZ {

	public static void main(String[] args) {
		// Programa un algoritmo que 
		// realice la tabla de multiplicar de un numero introducido 
		// desde teclado, hasta la iteración deseada por el usuario.

		Scanner input = new Scanner(System.in);
		
		System.out.println("¿De qué número desea conocer su tabla de multiplicar?");
		int inicial = input.nextInt();
		
		System.out.println("¿Hasta que numero desea multiplicar " + inicial + "?");
		int limite = input.nextInt();
		
		input.close();
		
		for (int i = 1; i <= limite; i++) {
			System.out.println(inicial + " x " + i + " es igual a " + (inicial*i));
		}
		
		
		
	}

}
