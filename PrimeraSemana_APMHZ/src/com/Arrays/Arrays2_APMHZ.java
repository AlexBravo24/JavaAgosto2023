package com.Arrays;

public class Arrays2_APMHZ {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones,
		// que contendrá los números del 1 al 100
		// Obtén la suma de todos ellos y la media.
		
		int [] numero = new int[100];
		int n = 1;
		double suma = 0;
		double media = 0;

		for (int i = 0; i < 100; i++) {
			 numero [i] = n;
			 suma = suma + n;
			 n++;	
			 if (n==100) {
				 System.out.println("La suma de los numeros consecutivos del 1 al 100 es: " +suma);
				 media = suma/100;
				 System.out.println("La media es: " + media);
			 }
		}
		
		
		
	}

}
