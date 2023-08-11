package com.ciclos;

import java.util.Scanner;

public class Ciclos12_JRCT {

	public static void main(String[] args) {
		/*
		 * Se ingresan un conjunto de n edades de 
		 * personas por teclado. El programa finalizara
cuando el promedio de las edades sea superior a 25.
		 */
		int suma = 0, elementos = 0;
		float media = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("ingresa una edad");
		int i = input.nextInt();
		
		if(media<25) {
		while(i<=100) {
			suma += i;
			elementos++;
			
		System.out.println("ingresa otra una edad");
		i = input.nextInt();
		
		media = (float) suma/elementos;
		System.out.println(" la media es de: " + media);
		
			}	
		}
			
			
		
	}

}
