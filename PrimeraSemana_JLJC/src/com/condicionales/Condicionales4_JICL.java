package com.condicionales;
import java.util.Scanner;//librer�a scanner
public class Condicionales4_JICL {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.

		 Scanner scanner = new Scanner (System.in);
		    String cadena;
		// Solicitud de datos al usuario
		    System.out.println("Este programa nos pide una cadena y comprueba si es una letra may�scula.");
		    System.out.print("Introduce la cadena que desees: ");
		    cadena = scanner.nextLine();
		    
		// Realizamos C�lculos y mostramos en pantalla
		    if (cadena.length() != 1){
		      System.out.println("La cadena no es una letra may�scula");
		   // }else if ((cadena > "A") && (cadena < "Z")) {
		    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		       System.out.println("La cadena es una letra may�scula.");
		    }else {
		        System.out.println("La cadena no es una letra may�scula.");
		    }

	}

}
