package com.condicionales;

import java.util.Scanner;

public class Condicionales3_SVL {

	public static void main(String[] args) {
		// Programa que pide al usuario dos n�meros y muestra el resultado de su divisi�n. 
		//Si el Segundo n�mero es 0, debe mostrar un mensaje de error
		
		Scanner input = new Scanner (System.in);
		int numero1, numero2;
		
		System.out.println("ESTE EJERCICIO REALIZARA UNA DIVISION");
		
		System.out.println("Digita un numero");
		numero1 = input.nextInt();
		System.out.println("Dividido entre");
		numero2 = input.nextInt();
		
		if (numero2 != 0) {
			System.out.println((double)numero1 / (double) numero2);
			System.out.println("ES EL RESULTADO DE DIVIDIR   " +numero1 + "  ENTRE  " +numero2);
		}else {
			System.out.println("��ERROR��");
		}

	}

}
