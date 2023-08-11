package com.ciclos;

import java.util.Scanner;

public class Ciclos4_APMHZ {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. 
		// Deberá retornar como resultado cuántas veces existe esa letra 
		// dentro de la frase. Si no existe, imprimir un mensaje 
		// “Carácter no encontrado”. 

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba una frase");
		String frase = input.nextLine();
		frase = frase.toLowerCase();
		
		System.out.println("Escriba una letra");
		String letra = input.next();
		letra = letra.toLowerCase();
		//Character letra = input.nextLine()charAt(0);
		// letra = Character.toLoweCase()
		
		input.close();
		
		int contador = 0;
		
		for (int i = 0; i <= frase.length()-1; i++) {
			if (frase.charAt(i) == letra.charAt(0)) {
				contador++;
			} 
		}
		
		if (contador > 0) {
		System.out.println("La letra se repite " + contador + " veces en la frase");
		} else {
			System.out.println("Carácter no encontrado");
		}
	}

}
