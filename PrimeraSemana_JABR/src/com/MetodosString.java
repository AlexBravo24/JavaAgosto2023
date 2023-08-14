package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Métodos o funcionalidades de la clase String
		
		//Declaramos una cadena de texto
		String cadena = "Hoy es 8 de agosto de 2023";
		
		//.length() - devuelve el tamaño de nuestra cadena
		//de texto en un valor númerico entero
		System.out.println(cadena.length());
		
		//.charAt() - Nos devuelve el índice o posicion
		//en el que se encuentra un determinado
		//caracter en la cadena de texto
		System.out.println(cadena.charAt(cadena.length()-1));
		System.out.println(cadena.charAt(25));
		 
		//.substring - nos devuelve una subcadena a partir
		//del indice especificado
		System.out.println(cadena.substring(5));
		
		System.out.println(cadena.substring(5,10));
		
		//.toLowerCase()/toUpperCase() - Convierte la cadena
		// a minusculas o a mayusculas respectivamente
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() - comparar el valor de un objeto
		//contra otro
		System.out.println(cadena.equals("hoy es 8 de agosto de 2023"));
		
		//.equalsIgnoreCase - compara las cadenas ignorando el uso
		//de maýusculas y minusculas
		System.out.println(cadena.equalsIgnoreCase("hOy Es 8 de Agosto de 2023"));
		
		//.replace - reemplazar las apariciones de un texto o caracter
		//con otro que indiquemos
		System.out.println(cadena.replace("2023", "2003"));
		System.out.println(cadena.replace(" ", "$"));
		
	}

}
