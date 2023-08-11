package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JRCT {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo

		 
//		Scanner input = new Scanner(System.in);
//		System.out.println("intruduza su texto: ");
//		String t = input.nextLine();
//		
//		StringBuilder stringBuilder = new StringBuilder(t);
//		String ta = stringBuilder.reverse().toString();
//		
//		System.out.println("Cadena original: " + t);
//		System.out.println("Cadena invertida: " + ta);
//		
//		System.out.println(t.contentEquals(ta));
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("intruduza una palabra sin espacios: ");
		String t = input.nextLine();
		
		String ta = "";
	
		
		for (int cambio = t.length() - 1; cambio >= 0; cambio--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			ta += t.charAt(cambio);
		}
		System.out.println("Cadena original: " + t);
		System.out.println("Cadena invertida: " + ta);
		
		System.out.println(t.contentEquals(ta));
	}

}
