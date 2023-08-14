package com.ciclos;

import java.util.Scanner;

public class Ciclos3_SVL {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Vamos a determinar si lo ingresado es un palindromo o no lo es");
		System.out.println("Teclea una palabra");
		String cadena = input.nextLine();
		
		String cadenaAux = cadena.toLowerCase();
		cadenaAux = cadenaAux.replace(" ", "");
		
		int j = 0 ;
		char compara = ' ';
		boolean pal = false;
		
		for (int i = cadenaAux.length() -1; i >= 0; i--) {
			compara = cadenaAux.charAt(i);
			
			if (compara== cadenaAux.charAt(j)) {
				pal = true;
			}else {
				pal = false;
						
			}
			j++;
		}
		if (pal) {
			System.out.println("Es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}

		
		}
		
	

}


