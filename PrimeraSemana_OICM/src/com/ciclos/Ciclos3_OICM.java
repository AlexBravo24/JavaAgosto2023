package com.ciclos;

import java.util.Scanner;

public class Ciclos3_OICM {

	public static void main(String[] args) {
		
		
		System.out.println("---- PALÍNDROMO ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa la Cadena de Texto");
		String cadena = input.nextLine();
		
		input.close();
		
		//Eliminar los espacios de la cadena
		cadena = cadena.replace(" ", "");  
		
		//Declaramos variable string que no contenga caracteres
		//para guardar los datos de cadena en orden invertido
		String cadenaflip = ""; 
		
		//Se invierte el orden de los caracteres de cadena
		//del ultimo al primero ejem 123 --> 321
		for (int indice = cadena.length()-1; indice >= 0; indice--) {
			// =+ concatena los caracteres de cadena en cadenaflip
			cadenaflip += cadena.charAt(indice); 
		}
		
		if(cadena.equalsIgnoreCase(cadenaflip)){
			System.out.println("El Texto es Palíndromo");
		}else {
			System.out.println("El Texto 'NO' es Palíndromo");
		}
		
	}

}
