package com.arrays;

public class Arrays2_JABR {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, 
		//que contendr� los n�meros del 1 al 100. 
		//Obt�n la suma de todos ellos y la media.
		
		 int[] numeros = new int[100];
	        
	        // Llenar el array con los n�meros del 1 al 100
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = i + 1;
	        }
	        
	        // Calcular la suma de los n�meros
	        int suma = 0;
	        for (int numero : numeros) {
	            suma = suma + numero;
	        }
	        
	        // Calcular la media
	        double media = (double) suma / numeros.length;
	        
	        System.out.println("Suma de los n�meros: " + suma);
	        System.out.println("Media de los n�meros: " + media);

	}

}
