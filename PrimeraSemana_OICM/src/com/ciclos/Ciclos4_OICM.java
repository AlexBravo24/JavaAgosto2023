package com.ciclos;

import java.util.Scanner;

public class Ciclos4_OICM {

	public static void main(String[] args) {
		
		/*Programa que reciba una frase y una letra por teclado. 
		 * Deberá retornar como resultado cuántas veces existe esa letra 
		 * dentro de la frase. Si no existe, imprimir un mensaje 
		 * “Carácter no encontrado”.
		 */
		
		int cuenta = 0;
		
		System.out.println("---- Cuantas Letras Tiene ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe una Frase");
		String cadena = input.nextLine();
		
		System.out.println("Escribe la Letra a Buscar");
		Character letra = input.next().charAt(0);
		
		input.close();
		
		cadena = cadena.toLowerCase();
		letra = Character.toLowerCase(letra);
		
		
		for (int indice = cadena.length()-1; indice >= 0; indice--) {
			
			if(letra.equals(cadena.charAt(indice))) {
				cuenta++;
			}
			
		}
		
		if (cuenta == 1) {
			System.out.println("La Letra '"+ Character.toUpperCase(letra) +"' se Repite ["+ cuenta +"] Vez.");
		}else if(cuenta > 1){
			System.out.println("La Letra '"+ Character.toUpperCase(letra) +"' se Repite ["+ cuenta +"] Veces.");
		}else {
			System.out.println("Caracter 'NO' Encontrado");
		}
		
	}

}
