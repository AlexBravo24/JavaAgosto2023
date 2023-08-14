package com.ciclos;

import java.util.Scanner;

public class Ciclos2_VHPL {

	public static void main(String[] args) {
		
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado,
		//	hasta la iteración deseada por el usuario. 
		//	Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

		
		
		Scanner input= new Scanner(System.in);					// Iniciamos el Java scanner para poder ingresar los datos siempre, si no, no jala
		
		int numero;							// declaramos las variables
		int numeromaximo;					// el valor máximo al que llegará a multiplicar la operación 
		
		System.out.println("Por favor, teclea un número ");
		numero = input.nextInt();
		
		System.out.println("¿Hasta qué número te gustaría multiplicar?");
		numeromaximo = input.nextInt();
		
		
		for (int i = 1; i <= numeromaximo; i++) {		// El ciclo for 
			int resultado;
			resultado = numero * i;
			System.out.println(numero + "x" + i + " = " + resultado);
		}
		
		
		
		input.close();	
	
	}

}
