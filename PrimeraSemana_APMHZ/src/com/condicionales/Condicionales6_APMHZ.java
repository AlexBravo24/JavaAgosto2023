 package com.condicionales;

import java.util.Scanner;

public class Condicionales6_APMHZ {

	public static void main(String[] args) {
		
		// La asociacion de vinicultores tiene como politica
		// fijar un precio inicial al kilo de uva
		// la cual se clasifica en tipos A y B
		// y ademas en tamaños 1 y 2
		// Se requiere determinar cuanto recibira un productor
		// por la uva que entrega en un embarque
		// considerando lo siguiente:
		// Si es de tipo A, se le cargan 20 centimos al precio inicial
		// cuando es de tamaño 1 y 30 centimos si es de tamaño 2
		//
		// Si es de tipo B, se rebajan 30 centimos cuando es de tamaño 1
		// y 50 centimos cuando es de tamaño 2
		//
		// Precio inicial se recibe desde el teclado
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Indique el precio inicial del kilo de uva");
		double precio = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Introduzca el tipo de uva (A o B)");
		String tipo = input.nextLine();
		
		System.out.println("Introduzca el tamaño de la uva (1 o 2)");
		int tam = input.nextInt();
		
		input.close();
		
		if (tipo.equalsIgnoreCase("A")) {
			if (tam == 1) {
				double pfinal = (precio + 0.2);
				pfinal = Math.round(pfinal*100)/100d;
				System.out.println("El productor recibira: " + pfinal);
			}
			else if (tam == 2) {
				double pfinal = (precio + 0.3);
				pfinal = Math.round(pfinal*100)/100d;
				System.out.println("El productor recibira: " + pfinal);
			}
		}
		
		if (tipo.equalsIgnoreCase("B")) {
			if (tam == 1) {
				double pfinal = (precio - 0.3);
				pfinal = Math.round(pfinal*100)/100d;
				System.out.println("El productor recibira: " + pfinal);
			}
			else if (tam == 2) {
				double pfinal = (precio - 0.5);
				pfinal = Math.round(pfinal*100)/100d;
				System.out.println("El productor recibira: " + pfinal);
			}
		}
		
		
		

	}

}
