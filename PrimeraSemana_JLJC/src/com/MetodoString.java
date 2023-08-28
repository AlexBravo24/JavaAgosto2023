package com;

public class MetodoString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase String
		
		//Declaramos una cadena de texto
		String cadena = "Hoy es 8 de agosto del 2023";
		
		//Metodo length() - devuelve el tamaño de la cadena de texto en un valor enter
		System.out.println(cadena.length());
		
		/*Metodo charAl() - Devuelve el indice o posicion en el que se encuentra
		 * un determinado caracter dentro de la cadena de tecto*/
		System.out.println(cadena.charAt(cadena.length() - 1));
		
		/*Metodo substring() - Devuelve una subcadena a partir del numero indicado*/
		System.out.println(cadena.substring(7));
		System.out.println(cadena.substring(7, 15));
		
		/*Metodo toLowerCase() - Convierte la cadena a minusculas
		 * Metodo toUpperCase() - Convierte la cadena a mayusculas*/
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		/*Metodo equals() - Compara el valor de un objeto contra otro*/
		System.out.println(cadena.equals("hoy es 8 de agosto del 2023"));
		System.out.println(cadena.equals("Hoy es 8 de agosto del 2023"));
		
		/*Metodo equalsIgnoreCase() - Compara cadenas ignorando mayusculas y minusculas*/
		System.out.println(cadena.equalsIgnoreCase("hoy es 8 de agosto del 2023"));
		
		/*Metodo replace() - reemplaza un caracter por otro dentro de una cadena*/
		System.out.println(cadena.replace("agosto", "septiembre"));
		System.out.println(cadena.replace(" ", "_"));
		
	}

}
