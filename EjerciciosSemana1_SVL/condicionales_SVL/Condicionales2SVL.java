package com.condicionales;

import java.util.Scanner;

public class Condicionales2SVL {

	public static void main(String[] args) {
		//Programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner input = new Scanner (System.in);
		int numero;
		
		System.out.println("ESTE EJERCICIO INDICARA SI EL NUMERO TECLEADO ES PAR O INPAR");
		
		System.out.println("Digita un numero");
		numero = input.nextInt();
		input.hasNextLine();
		
		if (numero % 2 == 0) {
		System.out.println(+numero + "  ES UN NUMERO PAR");
		} else {
		System.out.println(+numero + "  ES UN NUMERO INPAR");
		}
	
		
		

	}

}
