package com.condicionales;

import java.util.Scanner;

public class Condicionales4_OICM {

	public static void main(String[] args) {
		
		String cadena;
		
		System.out.println("---- Una Letra MAYUSCULA ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingres una Cadena de Texto");
		
		cadena = input.nextLine();
		input.close();
		
		switch(cadena.length()) {
		case 1:
			if(cadena == cadena.toUpperCase()){
				System.out.println("'" + cadena + "' Es una letra MAYUSCULA");
			}else {
				System.out.println("'" + cadena + "' No es una letra Mayuscula");
			}
			break;
		default:
			if(cadena == cadena.toLowerCase()) {
				System.out.println("No tiene MAYUSCULA");
			}else {
				System.out.println("Una Letra es MAYUSCULA");
			}
			break;
		}
		
	}//Cierre main

}
