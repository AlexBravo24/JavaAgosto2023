package com.ciclos;

import java.util.Scanner;

public class Ciclos11_OICM {

	public static void main(String[] args) {
		
		//Dibuja un cuadrado, como en la imagen que acompaña, 
		//introducir desde teclado el ancho y el alto. Ejemplo: 8 x 8 
		
		System.out.println("---- Dibujar Cuadrado ----");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el Ancho");
		int ancho = input.nextInt();
		
		System.out.println("Ingresa el Alto");
		int alto = input.nextInt();
		
		input.close();
		
		System.out.println("Dibujando...\n");
		
		for (int columna = 0; columna < alto; columna++) {
			for (int fila = 0; fila < ancho; fila++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
