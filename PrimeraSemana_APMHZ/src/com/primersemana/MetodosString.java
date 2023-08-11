package com.primersemana;

public class MetodosString {

	public static void main(String[] args) {
		
		//METODOS O FUNCIONALIDADES DE LA CLASE STRING
		
		//Declaramos una cadena de texto
		
		String cadena = "Hoy es 8 de agosto de 2023";
		
		//.length() - devuelve el tamaño de nuestra cadena de texto
		// en un valor numerico entero
		
		System.out.println(cadena.length());

		//.charAt() - Nos devuelve el valor en el índice o posición
		// en el que se encuentra un determinado caracter
		// en la cadena de texto
		
		System.out.println(cadena.charAt(cadena.length()-1));
		// es lo mismo que poner
		System.out.println(cadena.charAt(25));
		
		// .substring - nos devuelve una subacdena a partir
		//del indice especificado
		
		System.out.println(cadena.substring(4));
		
		System.out.println(cadena.substring(4, 8)); //indice de inicio, indice final
		
		// .toLowerCase() / .toUpperCase() - Convierte la cadena
		// a minusculas o mayusculas respectivamente
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		// Metodo .equals() - comparar el valor de un objeto contra otro
		
		System.out.println(cadena.equals("Hola mundo")); // devuelve true o false
		
		System.out.println(cadena.equals("hoy es 8 de agosto de 2023"));
		// Distingue mayusculas y minusculas
		
		System.out.println(cadena.equals("Hoy es 8 de agosto de 2023"));
		
		// .equalsIgnoreCase - compara las cadenas ignorando el uso
		// de mayusculas y minusculas
		
		System.out.println(cadena.equalsIgnoreCase("hOy Es 8 de AgOstO de 2023"));
		
		// .replace - reemplazar las apariciones de un texto o caracter
		// con otro que indiquemos
		
		System.out.println(cadena.replace("2023", "2003"));
		
		System.out.println(cadena.replace(" ", "."));
		
	}

}
