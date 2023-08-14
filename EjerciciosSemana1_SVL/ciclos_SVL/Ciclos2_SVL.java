package com.ciclos;

import java.util.Scanner;

public class Ciclos2_SVL {

	public static void main(String[] args) {
		//  Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un numero con el que se genera una tabla de multiplicar");
		
		int numero = input.nextInt();
		
		System.out.println("Teclea hasta que numero deseas que se multiplique " +numero);
		int largo = input.nextInt();
		
	    for (int i = 0; i <= largo; i++) {	
	    	System.out.println( numero + " X " + i + " = " +(numero*i));
		}
		
		}
		
		
	}


