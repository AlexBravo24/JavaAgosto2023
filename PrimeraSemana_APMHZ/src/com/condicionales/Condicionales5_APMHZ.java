package com.condicionales;

import java.util.Scanner;

public class Condicionales5_APMHZ {

	public static void main(String[] args) {
		// Realiza un programa que 
		// calcule la acpetacion
		// de una solicitud en base
		// a los siguientes parametros
		// edad, nota y sexo 
		// minimo: nota (5), edad (18), sexo (M) -> posible
		// minimo: nota (5), edad (18), sexo (F) -> aceptada
		// otros casos -> no aceptada
		
		int edad;
		int nota;
		String sexo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca su nota");
		nota = input.nextInt();
		
		System.out.println("Introduzca su edad");
		edad = input.nextInt();
		
		System.out.println("Introduzca su sexo (M o F)");
		sexo = input.next();
		
		input.close();
		
		if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Aceptacion de Solicitud POSIBLE");
		}
		else if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Solicitud ACEPTADA");
		}
		else {
			System.out.println("SOLICITUD NO ACEPTADA");
		}
		

	}

}
