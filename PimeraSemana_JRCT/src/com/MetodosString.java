package com;

public class MetodosString {

	public static void main(String[] args) {
		// metodos o funcionalidades  de la clase String
		
		//declaremos una cadena de texto 
		String cadena  = "hoy es 8 de agosto del 2023";
		
		//.length() - devuelve el tamaño de nuestro texto en un valor numerico entero
		System.out.println(cadena.length());
		 // .CharAt() -  nos devuelve el indice o pocicion EN QUE
		//se encuentra un determinado caracter en la cadena de texto 
		System.out.println(cadena.charAt(26));
		System.out.println(cadena.charAt(cadena.length()-1));

		//.substring - nos devuelve una subcadena a partir del indice espesificado
		
		System.out.println(cadena.substring(5));
		System.out.println(cadena.substring(5,10));
		
		//toLowerCase() - toUopperCase() -convierte en minusculas/convierte de mayusculas
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		
		//.equals() - comparar el valor del objeto contra otro 
		
		System.out.println(cadena.contentEquals("Hola mundo"));
		
		//.equalsIgnoreCase() - compara ignorando el uso de mayusculas o minusculas 
		System.out.println(cadena.equalsIgnoreCase("hOy es 8 de Agosto del 2023"));
		 
		//.replace -remplazar las apariciones de un texto o carcter
		//CON OTRO QUE LE INDIQUEMOS
		System.out.println(cadena.replace("2023", "2003"));
	}

}
