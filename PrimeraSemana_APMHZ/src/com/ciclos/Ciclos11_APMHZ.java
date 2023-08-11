package com.ciclos;

import java.util.Scanner;

public class Ciclos11_APMHZ {

	public static void main(String[] args) {
		// Dibuja un cuadrado, como en la imagen que acompaña
		//  introducir desde teclado el 
		// ancho y el alto. Ejemplo: 8 x 8 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca ancho de figura");
		int ancho = input.nextInt();
		
		System.out.println("Introduzca alto de figura");
		int alto = input.nextInt();
		
		input.close();
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		

	}

}
