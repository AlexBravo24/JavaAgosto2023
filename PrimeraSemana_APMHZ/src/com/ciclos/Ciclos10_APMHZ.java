package com.ciclos;

import java.util.Scanner;

public class Ciclos10_APMHZ {

	public static void main(String[] args) {
		// Programa que lea 20 números e indique
		// si son positivos o negativos y pares o
		// impares y además muestre la sumatoria 
		//  de los positivos y sumatoria de los impares. 
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		int suma1 = 0;
		int suma2 = 0;
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese un numero");
			num = input.nextInt();
			if (num%2 != 0) {
				suma2 = suma2 + num;
			}
			if (num>0) {
				if (num%2 == 0) {
					System.out.println("El numero ingresado es positivo y par");
				} else {
					System.out.println("El numero ingresado es positivo e impar");
					
				}
				suma1 = suma1 + num;
				//System.out.println("La suma de los numeros positivos es " +suma1);
			} else {
				if (num%2 == 0) {
					System.out.println("El numero ingresado es negativo y par");
				} else {
					System.out.println("El numero ingresado es negativo e impar");
					
				}
			}
			
		}
		
		input.close();
		
		System.out.println("La suma de los numeros positivos es " +suma1);
		System.out.println("La suma de los numeros impares es " +suma2);
		
		

	}

}
