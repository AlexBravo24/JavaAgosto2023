package com.condicionales;

import java.util.Scanner;

public class Condicionales1_SVL {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
		
		int numero1, numero2;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Este Ejercicio Indicara si el numero tecleado es menor, mayor o igual");
		
		System.out.println( "Teclea un NUMERO");
		numero1 = input.nextInt();
		
		System.out.println("Teclea otro NUMERO");
		numero2 = input.nextInt();
		
		if (numero1>numero2) {
		System.out.println("El primer numero:  " +numero1 + "  Es MAYOR al segundo numero:  " +numero2);
		
		}else if (numero1<numero2) {
			System.out.println("El primer numero: " +numero1 + "  Es MENOR al segundo numero:  " +numero2);
		
		}else {
			System.out.println("Los numeros son IGUALES");
			
		}
				
	}
}
