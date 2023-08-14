package com.condicionales;

import java.util.Scanner;
public class Condicionales5_JRCT {

	public static void main(String[] args) {
		/* Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA*/
		
		int e, n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Intruduzca su Edad: ");
		e = input.nextInt();
		
		System.out.print("Introduzca su Nota: ");
		n = input.nextInt();
		
		
		System.out.print("Introduzca su Sexo (M , F): ");
		String sexo = input.nextLine();
		
		input.nextLine();
		
		if(n>=5 && e>=18) {
			sexo.contentEquals("M");
			System.out.println( "POSIBLE");	
		}else if(n>=5 && e>=18) {
			sexo.contentEquals("F");
			System.out.println( "ACEPTADA");
		}else {
			System.out.println("Rechazado");
		}
		
		
		
		
	}
	
	
	

}
