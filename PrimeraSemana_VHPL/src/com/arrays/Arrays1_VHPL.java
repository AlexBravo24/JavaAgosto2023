package com.arrays;

import java.util.Scanner;

public class Arrays1_VHPL {

	public static void main(String[] args) {
		
		/*1. Crea un array de 10 posiciones de números con valores pedidos por teclado. 
	 	Muestra por consola el índice y el valor al que corresponde.*/
		
		Scanner input = new Scanner(System.in);
		
		int [] numero = new int [10];
		
		for(int i=0; i<numero.length; i++) {
			System.out.println("Escribe un número: ");
			numero[i] = input.nextInt();
		}
		System.out.println("Los números que seleccionaste son: ");
		for (int i = 0; i < numero.length; i++) {
			System.out.println("- " + numero[i]);
		}
		
		System.out.println("La posición de los números es: ");
		for (int i = 0; i < numero.length; i++) {
			
			
		}
		

	}

}
