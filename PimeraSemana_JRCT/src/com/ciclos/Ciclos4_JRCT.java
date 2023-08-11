package com.ciclos;

import java.util.Scanner;

public class Ciclos4_JRCT {

	public static void main(String[] args) {
		/*
		 * .Programa que reciba una frase y una letra por 
		 * teclado. Deberá retornar como resultado
cuántas veces existe esa letra dentro de la frase. 
Si no existe, imprimir un mensaje
“Carácter no encontrado”. 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("intruduza su texto: ");
		String t = input.nextLine();
		
		
		System.out.println("intruduza la letra: ");
		String l = input.nextLine();
	    
	    
	    int contador = 0;
		
	    while (t.indexOf(l) > -1) {
	    	t = t.substring(t.indexOf(l) + l.length(),t.length());
	    	contador++;
	    }
	    if(contador >= 1) {
	    	System.out.println("se encontro: "+contador +"  veces");
	    }else {
	    	System.out.println("caracter no encontrado");
	    }
	    
		
		
		
	}

}
