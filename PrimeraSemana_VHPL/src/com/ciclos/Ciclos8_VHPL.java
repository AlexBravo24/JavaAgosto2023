package com.ciclos;

import java.util.Scanner;

public class Ciclos8_VHPL {

	public static void main(String[] args) {
		
		
		// 8. Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el mayor

		Scanner scanner = new Scanner(System.in);

	 	int num1;					//Variable del primer n�mero a ingresar
	 	int num2;					//Variable del segundo n�mero a ingresar
	 	int numeromayor;			// Variable con ell�mete de mayor valor
	 	int numeromenor;			// variable de menor valor
	 
        System.out.print("Ingrese el primer n�mero: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo n�mero: ");
        num2 = scanner.nextInt();

        System.out.println("N�meros ordenados de menor a mayor desde " + numeromenor + " hasta " + numeromayor + ":");

        while (numeromenor < numeromayor) {
        	
            System.out.print(numeromenor + "-");
            numeromenor++;
        }

        scanner.close();
		
		
	}

}
