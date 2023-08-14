package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JRCT {

	public static void main(String[] args) {
		// .Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales.

		int a;
		int b;
		
		Scanner input = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		a = input.nextInt();
		
		System.out.println("introduce otro numero:");
		b = input.nextInt();
		
		if (a < b) {
			System.out.println("El numero mayor es: " + b);
		}else if(a>b) {
			System.out.println("El numeor mayor es: "+ a);
		}else {
			System.out.println("Los numero son igaules: " + a);
		}
		
		
		
		
		
		
		
		
		
	}

}
