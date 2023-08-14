package com.condicionales;

import java.util.Scanner;

public class Condicionales1_VHPL {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos números por 
		//   teclado e indique cuál es mayor o si son iguales.

		
		int num;				//Declaración de mi primer variable
		int num2;				//declaración de mi segunda variable
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un número (x)");
		num = input.nextInt();
		
		System.out.println("Introduce un segundo número (y)");
		num2 = input.nextInt();
		input.close();
		
		
		if (num>num2) {
			System.out.println("El número de mayor valor será: x= " + num);
		} else {
			System.out.println("El número de mayor valor será: y= " + num2);
		}
		
	
		
		
		
	} // Cierre del main
}// Cierre de la clase
