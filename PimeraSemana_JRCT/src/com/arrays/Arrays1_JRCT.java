package com.arrays;

import java.util.Scanner;

public class Arrays1_JRCT {

	public static void main(String[] args) {
		/*
		 * Crea un array de 10 posiciones de números con valores 
		 * pedidos por teclado.
Muestra por consola el índice y el valor al que corresponde.

		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese pocion: ");
		int a = input.nextInt();
		
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		
		
		for (int i = 0; i <= a; i++) {
		
		System.out.println("en la pocicion: " + a +" esta el numero: "
		+ numeros[i]);
		}
		
		
		

	}

}
