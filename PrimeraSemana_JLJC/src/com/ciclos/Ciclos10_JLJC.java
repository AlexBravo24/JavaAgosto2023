package com.ciclos;
import java.util.Scanner;
public class Ciclos10_JLJC {

	public static void main(String[] args) {
		/* Programa que lea 20 números e indique si son positivos o negativos y pares o
		impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 
		*/
		
		Scanner escaner = new Scanner(System.in);
		// Mandar mensaje
		System.out.println("Escribe un número:");
		// Leer lo que se introduce
		double numero = escaner.nextDouble();
		// Comparar
		if (numero == 0) {
			System.out.println("El número es neutro");
		} else if (numero < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
	}

}
