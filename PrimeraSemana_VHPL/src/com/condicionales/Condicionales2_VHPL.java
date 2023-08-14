package com.condicionales;

import java.util.Scanner;

public class Condicionales2_VHPL {

	public static void main(String[] args) {
		
		// 2.Realiza un programa que pida un número por 
		//   teclado y nos indique si es par o impar.
		
		
		int num1;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Por favor, introduce un número");
		num1 = input.nextInt();
		input.close();
		
		
		if (num1 % 2 == 0 ) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}


		
		
		
		
	} //Cierre main
} //Ciere Class
