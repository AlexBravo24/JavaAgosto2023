package com.ciclos;

import java.util.Scanner;

public class Ciclos3_APMHZ {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra o frase para determinar si es un palindromo");
		String cadena = input.nextLine();
		
		input.close();
		String cadenaAux = cadena.toLowerCase();
		cadenaAux = cadenaAux.replace(" ", "");
		int j = 0;
		char compara = ' ';
		boolean pal = false ;
		
		for (int i = cadenaAux.length()-1; i >= 0; i--) {
			compara = cadenaAux.charAt(i);
			
			if (compara == cadenaAux.charAt(j)) {
				pal = true;
			} else {
				pal = false;
			}
			j++;
		}
		
		if(pal) {
			System.out.println("Es un palindromo");
		} else {
			System.out.println("No es un palindromo");
		}
		

	}

}
