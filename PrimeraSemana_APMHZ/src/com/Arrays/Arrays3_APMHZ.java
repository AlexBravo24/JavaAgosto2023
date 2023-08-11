package com.Arrays;

import java.util.Scanner;

public class Arrays3_APMHZ {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase
		// y pasa sus caracteres a un array de caracteres.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba una frase");
		String frase = input.nextLine();
		
		frase = frase.replace(" ", "");
		char [] letra = new char [frase.length()];
		
		System.out.println("Los caracteres de la frase son:");
		
		for (int i = 0; i < frase.length(); i++) {
			letra[i] = frase.charAt(i);
			System.out.print(" ' "+letra[i] + " ' ");
		}
		
		input.close();
		
		
		

	}

}
