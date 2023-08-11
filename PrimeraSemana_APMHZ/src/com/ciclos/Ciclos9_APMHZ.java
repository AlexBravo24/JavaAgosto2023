package com.ciclos;

import java.util.Scanner;

public class Ciclos9_APMHZ {

	public static void main(String[] args) {
		// Programa Java que lea dos números y
		// y muestre los números pares entre ellos
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int num1 = input.nextInt();
		
		System.out.println("Ingrese un numero diferente");
		int num2 = input.nextInt();
		
		input.close();
		
		System.out.println("Los numeros pares entre ellos son: ");
		
		if (num1<num2) {
			for (int i = num1; i <= num2; i++) {
				if (i%2==0) {
					System.out.println(i);
				}
			}
		}
		
		if (num2<num1) {
			for (int i = num2; i <= num1; i++) {
				if (i%2==0) {
					System.out.println(i);
				}
			}
		}
		
		
		
	}

}
