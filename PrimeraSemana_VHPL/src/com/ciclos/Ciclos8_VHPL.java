package com.ciclos;

import java.util.Scanner;

public class Ciclos8_VHPL {

	public static void main(String[] args) {
		
		
		// 8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor

		Scanner scanner = new Scanner(System.in);

	 	int num1;					//Variable del primer número a ingresar
	 	int num2;					//Variable del segundo número a ingresar
	 	int numeromayor;			// Variable con ellímete de mayor valor
	 	int numeromenor;			// variable de menor valor
	 
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("Números ordenados de menor a mayor desde " + numeromenor + " hasta " + numeromayor + ":");

        while (numeromenor < numeromayor) {
        	
            System.out.print(numeromenor + "-");
            numeromenor++;
        }

        scanner.close();
		
		
	}

}
