package com.condicionales;

import java.util.Scanner;

public class Condicionales4_SVL {

	public static void main(String[] args) {
		// Programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		
		Scanner input = new Scanner (System.in);
		String letra;
		
		System.out.println("Este programa nos indicara si el caracter ingresado es mayuscula o minuscula");
		System.out.println("Introduce un caracter");
		letra = input.nextLine();
		
		if (letra.length() != 1){
		      System.out.println("La letra tecleado NO es MAYUSCULA");
		    } else if ((letra.compareTo("A") >= 0) && (letra.compareTo("Z")<=0)) {
		       System.out.println("La letra: " +letra+ "  Es MAYUSCULA.");
		    }else {
		        System.out.println("El Valor:  " +letra + "  NO ES MAYUSCULA");
		}
		
	}

}
