package com.condicionales;

import java.util.Scanner;

public class Condicionales5_OICM {

	public static void main(String[] args) {
		
		int nota;
		int edad;
		
		String sexo;
		
		System.out.println("---- Aceptacion de Solicitud ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa Nota");
		nota = input.nextInt();
		
		System.out.println("Ingresa Edad");
		edad = input.nextInt();
		
		System.out.println("Ingresa Sexo (M o F)");
		sexo = input.next();
		
		input.close();
		
		if(nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("ACEPTADA");
		}else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("POSIBLE");
		}else {
			System.out.println("NO ACEPTADA");
		}
		
	}//Cierre main

}
