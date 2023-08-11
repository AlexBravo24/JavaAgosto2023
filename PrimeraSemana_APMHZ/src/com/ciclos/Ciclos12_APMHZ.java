package com.ciclos;

import java.util.Scanner;

public class Ciclos12_APMHZ {

	public static void main(String[] args) {
		// Se ingresan un conjunto de n edades
		// de personas por teclado. 
		// El programa finalizara 
		// cuando el promedio de las edades sea superior a 25
		
		Scanner input = new Scanner(System.in);
		
		double prom = 0;
		int edad = 0;
		int n= 0;
		int sum = 0;
		do {
			System.out.println("Ingrese la edad de la persona");
			edad = input.nextInt(); 
			sum = sum + edad ;
			n++;
			if (n>=2) {
				prom = (sum)/n;
				System.out.println("El promedio de las edades ingresadas es: " +prom);
			}
		} while (prom <= 25 );
		input.close();
		System.out.println("El promedio de las edades es superior a 25");
		
		
		

	}

}
