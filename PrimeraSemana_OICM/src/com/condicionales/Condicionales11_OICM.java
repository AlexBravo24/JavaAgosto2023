package com.condicionales;

import java.util.Scanner;

public class Condicionales11_OICM {

	public static void main(String[] args) {
		
		double peso;
		double pago;
		
		System.out.println("---- Transporte Internacional ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Zona Ubicacion");
		System.out.println("[1]  America del Norte");
		System.out.println("[2]  America Central");
		System.out.println("[3]  America del Sur");
		System.out.println("[4]  Europa");
		System.out.println("[5]  Asia");
		
		System.out.println("Ingresa el numero de Zona a Transportar");
		byte zona = input.nextByte();
		
		System.out.println("Ingresa el peso del paquete en 'Kg'");
		peso = input.nextDouble();
		
		input.close();
		
		if(peso > 5) {
			System.out.println("Por politicas de la empresa no se pueden transportar");
			System.out.println("paquetes con un peso superior a 5Kg.");
			
		}else {
			switch(zona) {
			case 1:
				pago = 24 * peso;
				System.out.println("El cobro por la entrega de este paquete son: " + pago + " euros");
				break;
			case 2:
				pago = 20 * peso;
				System.out.println("El cobro por la entrega de este paquete son: " + pago + " euros");
				break;
			case 3:
				pago = 21 * peso;
				System.out.println("El cobro por la entrega de este paquete son: " + pago + " euros");
				break;
			case 4:
				pago = 10 * peso;
				System.out.println("El cobro por la entrega de este paquete son: " + pago + " euros");
				break;
			case 5:
				pago = 18 * peso;
				System.out.println("El cobro por la entrega de este paquete son: " + pago + " euros");
				break;
			default:
				System.out.println("EROR! Zona no Existente");
			}
		}
		

	}

}
