package com.condicionales;

import java.util.Scanner;

public class Condicionales1_APMHZ {

	public static void main(String[] args) {
		
		// Realiza un programa que reciba 2 numeros
		// por teclado e indique cual es mayor
		// o si nos iguales
		
		int numero1;
		int numero2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		numero1=input.nextInt();
		
		System.out.println("Introduce otro numero");
		numero2=input.nextInt();
		
		input.close();
		
		if (numero1 == numero2) {
			System.out.println("Los numeros son iguales");
		}
		else if(numero1 > numero2) {
			System.out.println("Es mayor el primero numero: " + numero1);
		}
		else if(numero1 < numero2) {
			System.out.println("Es mayor el segundo numero: " + numero2);
		}
		
	}

}
