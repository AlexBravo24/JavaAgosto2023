package com.ciclos;
import java.util.Scanner;
public class Ciclos10_JLJC {

	public static void main(String[] args) {
		/* Programa que lea 20 n�meros e indique si son positivos o negativos y pares o
		impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares. 
		*/
		
		Scanner escaner = new Scanner(System.in);
		// Mandar mensaje
		System.out.println("Escribe un n�mero:");
		// Leer lo que se introduce
		double numero = escaner.nextDouble();
		// Comparar
		if (numero == 0) {
			System.out.println("El n�mero es neutro");
		} else if (numero < 0) {
			System.out.println("El n�mero es negativo");
		} else {
			System.out.println("El n�mero es positivo");
		}
	}

}
