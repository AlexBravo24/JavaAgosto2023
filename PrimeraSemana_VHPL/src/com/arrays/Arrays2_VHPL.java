package com.arrays;

public class Arrays2_VHPL {

	public static void main(String[] args) {
		
		/*2. Crea un array de n�meros de 100 posiciones, que contendr� 
	  	 los n�meros del 1 al 100. Obt�n la suma de todos ellos y la media. */

		int[] enteros = new int[100];
		int suma = 0;
		double promedio;
		
		
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
        }
        
        for (int numero : enteros) {
            suma += numero;
        }
        System.out.println("Suma de todos los n�meros enteros del 1 al 100: " + suma);
        
        promedio = (double) suma / enteros.length;
        System.out.println("Promedio de la suma: " + promedio);
  
}
}
