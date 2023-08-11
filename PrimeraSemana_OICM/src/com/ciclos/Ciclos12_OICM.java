package com.ciclos;

import java.util.Scanner;

public class Ciclos12_OICM {

	public static void main(String[] args) {
		
		//Se ingresan un conjunto de n edades de personas por teclado. 
		//El programa finalizara cuando el promedio de las edades sea 
		//superior a 25
		
		double n = 0;
		int sum = 0;
		double media = 0;
		
		System.out.println("---- Promedio de Edades Superior a 25 ----");
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Ingresa Edad");
			int edad = input.nextInt();
			sum = (edad + sum);
			n++;
			if(n > 1) {
				media = sum / n;
				System.out.println("El Promedio es: "+ media);
			}
		}while(media <= 25);

		input.close();
		System.out.println("\nFin de Programa...");
	}

}
