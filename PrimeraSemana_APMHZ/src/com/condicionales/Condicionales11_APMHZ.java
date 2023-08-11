package com.condicionales;

import java.util.Scanner;

public class Condicionales11_APMHZ {

	public static void main(String[] args) {
		// Una compañía de transporte internacional 
		// tiene servicio en algunos países de América del Norte, 
		// América Central, América del Sur, Europa y Asia. 
		// El costo por servicio de transporte se basa en 
		// el peso del paquete y la zona a la que va dirigida. 
		// Lo anterior se muestra en la siguiente tabla:
		// America del norte - 24 euros
		// America Central - 20 euros
		// America del sur - 21 euros
		// Europa - 10 euros
		// Asia - 18 euros
		//	Parte de su política implica que los paquetes 
		// con un peso superior a 5kg no son transportados, 
		// por cuestiones de logística y seguridad.
		// Realiza un algoritmo para determinar 
		// el cobro por la entrega de un paquete o, 
		// en su caso, el rechazo de la entrega.	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca la zona de ubicacion");
		String zona = input.nextLine();
		
		System.out.println("Introduzca el peso de su paquete");
		double peso = input.nextDouble();
		
		input.close();
		
		if (peso <= 5) {
			if (zona.equalsIgnoreCase("America del Norte")) {
				System.out.println("El costo de entrega es de: " + peso * 24.00d + " euros");
			}
			else if (zona.equalsIgnoreCase("America Central")) {
				System.out.println("El costo de entrega es de: " + peso * 20.00d + " euros");
			}
			else if (zona.equalsIgnoreCase("America del Sur")) {
				System.out.println("El costo de entrega es de: " + peso * 21.00d + " euros");
			}
			else if (zona.equalsIgnoreCase("Europa")) {
				System.out.println("El costo de entrega es de: " + peso * 10.00d + " euros");
			}
			else if (zona.equalsIgnoreCase("Asia")) {
				System.out.println("El costo de entrega es de: " + peso * 18.00d + " euros");
			}
		}
		else {
			System.out.println("LOS PAQUETES CON UN PESO SUPERIOR A 5KG NO SON TRANSPORTADOS");
		}
		
		

	}

}
