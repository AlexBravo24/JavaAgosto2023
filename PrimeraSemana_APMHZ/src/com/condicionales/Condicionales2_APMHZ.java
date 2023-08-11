package com.condicionales;

import java.util.Scanner;

public class Condicionales2_APMHZ {

	public static void main(String[] args) {
		// Realiza un programa que 
		// pida un numero por teclado
		// y nos indique si es par o impar
		
		int numero;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		numero=input.nextInt();
		
		input.close();
		
		if (numero % 2 == 0) {
			System.out.println("El numero introducido es par");
		}
		else {
			System.out.println("El numero introducido es impar");
		}

	}

}
