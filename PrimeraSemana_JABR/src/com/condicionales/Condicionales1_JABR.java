package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JABR {

	public static void main(String[] args) {
		
		// Realiza un programa que reciba dos números 
		//por teclado e indique cuál es mayor o si son iguales.
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Los números son iguales.");
        }
		

	}

}
