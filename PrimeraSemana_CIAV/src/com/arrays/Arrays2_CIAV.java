package com.arrays;

import java.util.Scanner;

public class Arrays2_CIAV {
/*Crea un array de números de 100 posiciones, que contendrá los números del 
1 al 100. Obtén la suma de todos ellos y la media.*/
	
    public static void main(String[] args) {
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.print("Ingrese un número ");
        int tamArr = entrada.nextInt();
    	
        int[] numeros = new int[tamArr];

        for (int i = 0; i < numeros.length; i++) {
        	System.out.println(numeros[i] = i + 1);
        }

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        double media = (double) suma / numeros.length;

        System.out.println("Suma de los números: " + suma);
        System.out.println("Media de los números: " + media);
        
        entrada.close();
    }
}
