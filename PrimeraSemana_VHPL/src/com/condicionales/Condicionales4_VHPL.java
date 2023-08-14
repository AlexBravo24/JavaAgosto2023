package com.condicionales;

import java.util.Scanner;

public class Condicionales4_VHPL {

	public static void main(String[] args) {
		
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor, introduce una letra");
		String letra = input.nextLine();
		
		if(letra.length() == 1) {
			char caracter = letra.charAt(0);
			if (Character.isUpperCase(caracter));{
		 System.out.println("La letra que has seleccionado es Mayúsculaa");
			} else { System.out.println("La letra que seleccionaste es  Minúscula");
			} else {System.out.println("Este caractwr no es una letra");
			}
			}
			
			
		input.close();
	}

}
