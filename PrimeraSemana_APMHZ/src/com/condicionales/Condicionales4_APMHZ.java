package com.condicionales;

import java.util.Scanner;

public class Condicionales4_APMHZ {

	public static void main(String[] args) {
		// Realiza un programa que lea
		// una cadena por teclado
		// y compruebe si es una letra mayuscula
		
		String cadena;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		cadena=input.nextLine();
		
		input.close();
		
		String cadenaAux = cadena.toUpperCase();
		
		String cadenaMin = cadena.toLowerCase();
		
		if (cadena.contentEquals(cadenaAux)) {
			System.out.println("La cadena se escribio en mayusculas");
		}
		else if (cadena.contentEquals(cadenaMin)) {
			System.out.println("La cadena se escribio en minusculas");
		}
		else {
			System.out.println("La cadena contiene una o mas letras mayusculas");
		}
		

	}

}
