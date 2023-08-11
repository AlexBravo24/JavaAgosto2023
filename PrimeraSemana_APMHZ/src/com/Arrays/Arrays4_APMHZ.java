package com.Arrays;

public class Arrays4_APMHZ {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones
		// con los siguientes valores: {1,2,3,4,5}
		// Guardar los valores de este array
		// en otro array distinto pero con
		// los valores invertidos, es decir, que
		// el segundo array deberá tener los valores
		// {5,4,3,2,1}.
		
		int [] numeros = {1,2,3,4,5};
		int [] invert = new int [5];
		int n = 0;
		
		System.out.println("El arreglo de numeros {1, 2, 3, 4, 5} invertido es: ");
		
		for (int i = numeros.length-1; i >= 0; i--) {
			invert[n] = numeros[i];
			System.out.print(" ' " + invert[n] + " ' ");
			n++;
		}
		
		

	}

}
