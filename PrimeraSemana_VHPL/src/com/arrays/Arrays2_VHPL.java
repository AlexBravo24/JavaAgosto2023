package com.arrays;

public class Arrays2_VHPL {

	public static void main(String[] args) {
		
		/*2. Crea un array de números de 100 posiciones, que contendrá 
	  	 los números del 1 al 100. Obtén la suma de todos ellos y la media. */

		int[] enteros = new int[100];
		int suma = 0;
		double promedio;
		
		
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
        }
        
        for (int numero : enteros) {
            suma += numero;
        }
        System.out.println("Suma de todos los números enteros del 1 al 100: " + suma);
        
        promedio = (double) suma / enteros.length;
        System.out.println("Promedio de la suma: " + promedio);
  
}
}
