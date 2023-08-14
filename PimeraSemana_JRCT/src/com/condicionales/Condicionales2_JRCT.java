package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JRCT {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado
		//y nos indique si es par o impar.

		
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		a = input.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
			
		
		
		
		
		
	}

}
