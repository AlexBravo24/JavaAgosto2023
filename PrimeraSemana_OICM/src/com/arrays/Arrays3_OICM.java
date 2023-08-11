package com.arrays;

import java.util.Scanner;

public class Arrays3_OICM {

	public static void main(String[] args) {
		
		// Pide al usuario por teclado una frase y pasa sus caracteres
		//a un array de caracteres.
		
		System.out.println("---- Array de Caracteres ----");
		
		System.out.print("Ingresa una Frase: ");
		
		Scanner input = new Scanner(System.in);
		
		String frase = input.nextLine();
		
		input.close();
		
		char [] array = new char [frase.length()]; 
		
		for (int i = 0; i < frase.length(); i++) {
			array [i] = frase.charAt(i);
		}
		System.out.print("El array de caracteres ahora contiene: ");
		System.out.print(array);
	}

}
