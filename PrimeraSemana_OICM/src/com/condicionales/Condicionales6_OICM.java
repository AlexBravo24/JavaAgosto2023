package com.condicionales;

import java.util.Scanner;

public class Condicionales6_OICM {

	public static void main(String[] args) {
		
		int tamano;
		
		double kilos;
		double precio;
		
		String tipo;

		
		System.out.println("---- Asociacion de Vinicultores ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el Precio Inicial de Uva");
		precio = input.nextDouble();
		precio = precio * 1000;
		
		System.out.println("Ingresa el Tipo de Uva (A o B)");
		tipo = input.next();
		
		System.out.println("Ingresa el Tamaño de Uva (1 o 2");
		tamano = input.nextInt();
		
		System.out.println("Ingresa los Kilos de Uva");
		kilos = input.nextDouble();
		
		input.close();
		
		switch(tamano) {
		case 1:
			if(tipo.equalsIgnoreCase("A")) {
				precio = (precio + 200)/1000;
				precio = (kilos * precio);
				System.out.println("El precio de la Venta es de: "+ precio);
			}else if(tipo.equalsIgnoreCase("B")) {
				precio = (precio - 300)/1000;
				precio = (kilos * precio);
				System.out.println("El precio de la Venta es de: "+ precio);
			}else {
				System.out.println("ERROR! Captura de datos Incorrecta");
			}
			break;
		case 2:
			if(tipo.equalsIgnoreCase("A")) {
				precio = (precio + 300)/1000;
				precio = (kilos * precio);
				System.out.println("El precio de la Venta es de: "+ precio);
			}else if(tipo.equalsIgnoreCase("B")) {
				precio = (precio - 500)/1000;
				precio = (kilos * precio);
				System.out.println("El precio de la Venta es de: "+ precio);
			}else {
				System.out.println("ERROR! Captura de datos Incorrecta");
			}
			break;
		default:
			System.out.println("ERROR! Captura de datos Incorrecta");
			break;
		}//cierre switch
		
	}//cierre main

}
