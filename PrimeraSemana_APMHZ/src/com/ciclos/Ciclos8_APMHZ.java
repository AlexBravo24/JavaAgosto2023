package com.ciclos;

import java.util.Scanner;

public class Ciclos8_APMHZ {

	public static void main(String[] args) {
		// Programa Java que lea dos números
		// y muestre los números desde
		// el menor hasta el mayor
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("SUCESION DE MENOR A MAYOR ENTRE 2 NUMEROS DADOS");
		
		System.out.println("Ingrese un numero");
		int num1 = input.nextInt();
		
		System.out.println("Ingrese un numero mayor al anterior");
		int num2 = input.nextInt();
		
		input.close();
		
		System.out.println("Sucesion del menor al mayor:");
		
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		
		

	}

}
