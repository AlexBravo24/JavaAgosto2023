package com.condicionales;

import java.util.Scanner;

public class Condicionales3_OICM {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		
		System.out.println("---- Divicion de Dos Numeros ----");
		System.out.println("Ingresa el Primer Numero");
		
		Scanner input = new Scanner(System.in);
		
		num1 = input.nextInt();
		
		System.out.println("Ingres el Segundo Numero");
		
		num2 = input.nextInt();
		
		input.close();
		
		if(num2 == 0) {
			System.out.println("ERROR! la Division por 0 no es Valida");
		}else {
			double numdiv = (num1 / num2);
			System.out.println("El resultado de " + num1 + " / " + num2 + " es: " + numdiv);
		}

	}//Cierre de main

}
