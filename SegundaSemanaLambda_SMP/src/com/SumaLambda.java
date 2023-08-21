package com;

interface Operacion {
	int calcular(int a, int b);
}

public class SumaLambda {
	public static void main(String[] args) {

		/*
		 * En este ejemplo, he definido una expresión lambda que implementa el método
		 * calcular de la interfaz funcional Operacion. Esta expresión lambda realiza
		 * una suma de dos números. Luego, he creado una instancia de la interfaz
		 * Operacion usando la expresión lambda y la he utilizado para realizar una
		 * suma.
		 */

		// Usando una expresión lambda para definir una función suma
		Operacion suma = (a, b) -> a + b;

		int resultado = suma.calcular(5, 3); // Llamada a la función lambda
		System.out.println("Resultado de la suma: " + resultado);
	}
}
