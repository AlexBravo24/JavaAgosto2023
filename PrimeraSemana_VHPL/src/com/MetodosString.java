package com;

public class MetodosString {

	public static void main(String[] args) {
		// Métodos o funcionalidades de la clase String
		//Declaramos una cadena de texto
		
		String cadena = "Hoy es 8 de agosto de 2023";
		//.length() - devuelve el tamaño de nuestra cadena de texto en un valor numérico entero
		
		System.out.println(cadena.length());

		//charAt() - Nos devuelve el índice o posición en el que se encuentra un determinado caracter de la cadena de texot
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - nos devuelve una subcadena a partir del índice especificado
		System.out.println(cadena.substring(5));
		System.out.println(cadena.substring(11,18));
	
		//.toLowerCase ()/toUpperCase() - Convierte la cadena de texo a minúsculas y mayúsculas
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals()- comparar el valor de un objeto contra otro
		System.out.println(cadena.equals("Hoy es 8 de agosto de 2023"));
		
		//.equalsIgnoreCase- compara las cadenas ignorando el uso de mayúsculas y minúsculas
		System.out.println(cadena.equalsIgnoreCase("HOY Es 8 de agosto DE 2023"));
		
		//.replace - rempleza las apariciones de un texto o caracter con otro que indiquemos
		System.out.println(cadena.replace("2023", "2003"));
		System.out.println(cadena.replace(" ", "+"));
		
		
	}

}
