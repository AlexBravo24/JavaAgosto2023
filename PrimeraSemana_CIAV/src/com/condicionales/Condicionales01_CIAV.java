package com.condicionales;

import java.util.Scanner;

public class Condicionales01_CIAV {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Intorduce el primer numero: ");
		int x = entrada.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int y = entrada.nextInt();
		
		if(x == y) {
			System.out.println("Ambos numeros son iguales");
		}else if(x > y ){
			System.out.println("El numero " + x + " es el número mayor");			
		}else {
			System.out.println("El numero " + y + " es el número mayor");
		}
		
		entrada.close();
	}

}
