package com.ciclos;

public class Ciclos1_JABR {

	public static void main(String[] args) {

		// Programa un algoritmo que realice la tabla de multiplicar del 12
		
		System.out.println("Ejemplo con ciclo WHILE");
		System.out.println();
		
		int r = 1;

		while (r < 11) {
			System.out.println("12 x " + r + " = " + r * 12);
			r++;
		}
		
		System.out.println();
		System.out.println("Ejemplo con ciclo FOR");
		System.out.println();
		
		for (int i = 1; i < 11; i++) {
			System.out.println("12 x " + i + " = " + i*12);
		}

	}

}
