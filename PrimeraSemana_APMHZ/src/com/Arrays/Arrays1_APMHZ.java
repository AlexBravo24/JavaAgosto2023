package com.Arrays;

import java.util.Scanner;

public class Arrays1_APMHZ {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones
		// de números con valores pedidos por teclado.
		// Muestra por consola el índice
		// y el valor al que corresponde.
		
		int [] numero = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ARRAY DE 10 POSICIONES");
		
//		for (i = 0; i < 10; i++) {
//			System.out.println("Escriba un numero");
//			numero[i] = input.nextInt();
//			System.out.println("La posición " + i + " contiene el numero " + numero[i]);
//		}
		int n = 0;
		int x = 0;
		do {
			System.out.println("Escriba un numero");
			numero[n]=input.nextInt();
			n++;
		} while(n<10);
		
		for (int i : numero) {
			System.out.println("La posición "+ x +" contiene el numero " +i);
			x++;
		}
		
		input.close();
	

	}

}
