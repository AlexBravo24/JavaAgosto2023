package com.condicionales;

import java.util.Scanner;

public class Condicionales3_VHPL {

	public static void main(String[] args) {
		
		// 3.Crea un programa que pida al usuario dos números y muestre 
		//   el resultado de su división. Si el segundo número es 0, debe
		//   mostrar un mensaje de error.

		
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Ingrese un número (a)");
		
		double num1 = input.nextDouble();
		
		
		System.out.println("Ingrese el segundo número, este será dividido entre en primer número");
		double num2 = input.nextDouble();
		
		if (num2 == 0) { 
			System.out.println("Error");
		}else {
			double resultado = num2 / num1 ;
			System.out.println("El resultado de la división es; " + resultado);
		}
		input.close();
		
		
		
		
		
	} // Cierre main
} //Cierre de clase
