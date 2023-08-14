package com.arrays;

import java.util.Scanner;

public class Arrays3_JRCT {

	public static void main(String[] args) {
		/*
		 * Pide al usuario por teclado una frase 
		 * y pasa sus caracteres a un array de
         * caracteres.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("ingrese un texto: ");
		String r = input.nextLine();
		char [] name = new char[r.length()];
		
		for (int i = 0; i< r.length(); i++) {
			
			System.out.println("cada guardado: " + i);
			
		}
		
		
		
	}

}
