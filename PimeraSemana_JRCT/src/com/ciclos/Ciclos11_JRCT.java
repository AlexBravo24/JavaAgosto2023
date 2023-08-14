package com.ciclos;

import java.util.Scanner;

public class Ciclos11_JRCT {

	public static void main(String[] args) {
		// .Dibuja un cuadrado, como en la imagen 
		//que acompaña, introducir desde teclado el
		//ancho y el alto. Ejemplo: 8 x 8 

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("in troduza el ancho: ");
		int an = input.nextInt();
		
		if(an>=2 && an<=50) {
			for(int i=1; i<=an; i++) {
				for(int o=1; o<=an; o++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}

}
