package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JABR {

	public static void main(String[] args) {
		
		// Realiza un programa que reciba dos n�meros 
		//por teclado e indique cu�l es mayor o si son iguales.
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer n�mero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo n�mero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer n�mero es mayor.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo n�mero es mayor.");
        } else {
            System.out.println("Los n�meros son iguales.");
        }
		

	}

}
