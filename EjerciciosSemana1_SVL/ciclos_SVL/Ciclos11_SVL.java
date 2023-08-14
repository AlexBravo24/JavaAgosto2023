package com.ciclos;

import java.util.Scanner;

public class Ciclos11_SVL {

	public static void main(String[] args) {
		// Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto

		Scanner input = new Scanner(System.in);
		int l, a;
		
		System.out.println("Programa que dibujara un cuadro del largo y ancho indicado");
		System.out.println("Ingresa el LARGO");
		l = input.nextInt();
		System.out.println("Ingresa el ANCHO");
		a = input.nextInt();
		
		for (int i = 0; i < a ; i++) {
			for (int j = 0; j < l; j++) {
				
			}
		 System.out.print("* ");
		}
		 System.out.println();
		 
		
		
		 		
	}
	
	}


