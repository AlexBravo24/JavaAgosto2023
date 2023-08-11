package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JRCT {

	public static void main(String[] args) {
		/* La asociación de vinicultores tiene como política 
		 * fijar un precio inicial al kilo de uva, la cual se
		clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		Cuando se realiza la venta del producto, ésta
		es de un sólo tipo y tamaño, se requiere determinar cuánto 
		recibirá un productor por la uva que
		entrega en un embarque considerando lo siguiente:
		* Si es de tipo A, se le cargan 20 céntimos al precio 
		* inicial cuando es de tamaño 1 y 30 céntimos si
		es de tamaño 2.
		* Si es de tipo B, se rebajan 30 céntimos cuando es de 
		* tamaño 1, y 50 céntimos cuando es de
		tamaño 2.
		Precio inicial se recibe desde teclado*/

		
		int p, t;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca el precio inicial: ");
		p = input.nextInt();
		
		System.out.println("Seleccione el tipo (A , B): ");
		String tipo = input.nextLine();
		input.nextLine();
		
		System.out.println("Seleccione el tamaño (1 , 2): ");
		t = input.nextInt();
		input.nextLine();
		
	
		
		if(t==1) {
			tipo.contentEquals("A");
			System.out.println("Precio: " + p + 0.20);
		}else if(t==1) {
		
			tipo.contentEquals("B");
			System.out.println("Precio: " + p + 0.30);
		}
		if(t==2) {
			tipo.contentEquals("A");
		    System.out.println("Precio: " + (p - 0.30));
		}else if(t==2) {
			tipo.contentEquals("A");
		    System.out.println("Precio: " + (p - 0.50));
			
		}else {
			System.out.println("ERROR");
		}
		
			

		}
		
		
	}


