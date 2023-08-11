package com.ciclos;

import java.util.Scanner;

public class Ciclos10_OICM {

	public static void main(String[] args) {
		
		//Programa que lea 20 números e indique si son 
		//positivos o negativos y pares o impares y además 
		//muestre la sumatoria de los positivos y sumatoria 
		//de los impares.
		
		int suma = 0;
		int sumaimpar =0;
		
		System.out.println("---- Ingresar 20 Numeros ----");
		
		Scanner input = new Scanner(System.in);
		
		for (int n = 1; n <= 20; n++) {
			System.out.println("\n["+ n +"] Ingresa un Numero");
			
			int num = input.nextInt();
			if(num >= 0) {
				System.out.println("El Numero es Positivo");
				suma = num + suma;
			}else {
				System.out.println("El Numero es Negativo");
			}
			
			int res = num % 2;
			if(res == 0) {
				System.out.println("El Numero es Par"); 
			}else {
				System.out.println("El Numero es Impar");
				sumaimpar = num + sumaimpar;
			}	
		}//cierre for
		
		input.close();
		System.out.println("\nLa Sumatoria de los Numeros Positivos es: "+suma);
		System.out.println("La Sumatoria de los Numeros Impares es: "+sumaimpar);
		System.out.println("\nFin de Programa...");
		
	}//Cierre main

}
