package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JRCT {

	public static void main(String[] args) {
		/* La asociaci�n de vinicultores tiene como pol�tica 
		 * fijar un precio inicial al kilo de uva, la cual se
		clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		Cuando se realiza la venta del producto, �sta
		es de un s�lo tipo y tama�o, se requiere determinar cu�nto 
		recibir� un productor por la uva que
		entrega en un embarque considerando lo siguiente:
		* Si es de tipo A, se le cargan 20 c�ntimos al precio 
		* inicial cuando es de tama�o 1 y 30 c�ntimos si
		es de tama�o 2.
		* Si es de tipo B, se rebajan 30 c�ntimos cuando es de 
		* tama�o 1, y 50 c�ntimos cuando es de
		tama�o 2.
		Precio inicial se recibe desde teclado*/

		
		int p, t;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca el precio inicial: ");
		p = input.nextInt();
		
		System.out.println("Seleccione el tipo (A , B): ");
		String tipo = input.nextLine();
		input.nextLine();
		
		System.out.println("Seleccione el tama�o (1 , 2): ");
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


