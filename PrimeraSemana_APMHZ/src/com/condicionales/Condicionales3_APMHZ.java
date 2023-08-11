package com.condicionales;

import java.util.Scanner;

public class Condicionales3_APMHZ {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario
		// dos numeros y muestre el resultado de su division
		// si el segundo numero es 0
		// debe mostrar un mensaje de error
		
		int num1;
		int num2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		num1=input.nextInt();
		
		System.out.println("Introduce otro numero");
		num2=input.nextInt();
		
		input.close();
		
		if (num2 != 0) {
			double div = (num1 / num2); 
			System.out.println("El resultado de su division es: " + div);
		}
		else {
			System.out.println("ERROR");
		}

	}

}
