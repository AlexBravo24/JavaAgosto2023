package com.arrays;

import java.util.Scanner;

public class Arrays3_VHPL {

	public static void main(String[] args) {
		/* 3. Pide al usuario por teclado una frase y pasa sus caracteres 
		  a un array de caracteres.*/
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Por favor, escriba una frase");
		String frase; 		
		frase = input.nextLine();
		
		char[] caracteres =  frase.toCharArray();  // convierte la cadena en un arreglo de caracteres
		
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(i);
		}
		
		
		input.close();
		

	}

}
