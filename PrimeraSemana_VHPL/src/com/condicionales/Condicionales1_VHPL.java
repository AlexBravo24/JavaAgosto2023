package com.condicionales;

import java.util.Scanner;

public class Condicionales1_VHPL {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos n�meros por 
		//   teclado e indique cu�l es mayor o si son iguales.

		
		int num;				//Declaraci�n de mi primer variable
		int num2;				//declaraci�n de mi segunda variable
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un n�mero (x)");
		num = input.nextInt();
		
		System.out.println("Introduce un segundo n�mero (y)");
		num2 = input.nextInt();
		input.close();
		
		
		if (num>num2) {
			System.out.println("El n�mero de mayor valor ser�: x= " + num);
		} else {
			System.out.println("El n�mero de mayor valor ser�: y= " + num2);
		}
		
	
		
		
		
	} // Cierre del main
}// Cierre de la clase
