package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JRCT {

	public static void main(String[] args) {
		
		//  Realiza un programa que lea una cadena por teclado
		//y compruebe si es una letra mayúscula
		
		

		Scanner input = new Scanner(System.in);
		System.out.println("introduzca un texto: ");
		String nombre = input.nextLine();
		
		System.out.println("comparando con: " + nombre.toLowerCase() + " porfavor precione ENTER");
		String nombre2 =input.nextLine();
		
		if(nombre == nombre2) {
			System.out.println("El texto no tiene mayuscula");
		}else {
			System.out.println("ERROR, el texto contiene una mayuscula");
		}
		
				

	}

}