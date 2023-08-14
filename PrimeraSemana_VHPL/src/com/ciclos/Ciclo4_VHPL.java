package com.ciclos;

import java.util.Scanner;

public class Ciclo4_VHPL {

	public static void main(String[] args) {
		
		// 4.Programa que reciba una frase y una letra por teclado. 
		// Deberá retornar como resultado cuántas veces existe esa letra dentro de la frase. 
		// Si no existe, imprimir un mensaje “Carácter no encontrado”.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor escriba una frase");
		String frase;
		frase = input.nextLine();
		System.out.println("Tu frase es; " + frase);
	
		// Parte del conteo de la letra
		
		int contarletra(String frase);
		
		
	input.close();	
		
		
	}

}
