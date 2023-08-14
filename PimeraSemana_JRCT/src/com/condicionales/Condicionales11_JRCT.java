package com.condicionales;

import java.util.Scanner;

public class Condicionales11_JRCT {

	public static void main(String[] args) {
		/*
		 * . Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
ZONA UBICACIÓN COSTO/KILOGRAMO
1 América del Norte 24,00 euros
2 América Central 20, 00 euros
3 América del Sur 21,00 euros
4 Europa 10,00 euros
5 Asia 18,00 euros
Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por
cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
de la entrega.
		 */
		int p, n;

		Scanner input = new Scanner(System.in);
		System.out.println("ingresa el peso del paquete en Kilogramos: ");
		p = input.nextInt();
		
		if(p <= 5 && p>=0) {
			System.out.println("Ingrese el numero de la zona:"+
					" 1 América del Norte, " + 
					" 2 América Central, " + 
					" 3 América del Surn, " + 
					" 4 Europa, " + 
					" 5 Asia, ");
			n = input.nextInt();
			switch(n) {
			case 1:
				System.out.println("costo de tralado: " + (p * 24) + " Euros" );
				break;
			case 2:
				System.out.println("costo de tralado: " + (p * 20) + " Euros" );
				break;
			case 3:
				System.out.println("costo de tralado: " + (p * 21) + " Euros" );
				break;
			case 4:
				System.out.println("costo de tralado: " + (p * 10) + " Euros" );
				break;
			case 5:
				System.out.println("costo de tralado: " + (p * 18) + " Euros" );
				break;
			default:
				System.out.println("ERROR, zona mal indicada");
			}
		}else {
			System.out.println("ERROR, numero de kilogramos no permitidos");
		}
		
		
		
		
		
		
		
	}

}
