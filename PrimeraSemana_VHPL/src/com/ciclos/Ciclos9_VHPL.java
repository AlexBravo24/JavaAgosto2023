package com.ciclos;

import java.util.Scanner;

public class Ciclos9_VHPL {

	public static void main(String[] args) {
		
		// 9. Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos.
		
		

				Scanner input = new Scanner(System.in);

				int num1;
				int num2;
				
		        System.out.print("Ingresa el primer n�mero: ");
		        		num1 = input.nextInt();

		        System.out.print("Ingresa el segundo n�mero: ");
		        		num2 = input.nextInt();

		        System.out.println("N�meros pares entre " + num1 + " y " + num2 + ":");

		        for (int i = num1; i <= num2; i++) {
		        	
		            if (i % 2 == 0) {
		                System.out.print(i + " ");
		            }
		        }

		        input.close();
				
	}

}
