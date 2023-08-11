package com.arrays;

import java.util.Scanner;

public class Arrays2_CIAV {
/*Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
1 al 100. Obt�n la suma de todos ellos y la media.*/
	
    public static void main(String[] args) {
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.print("Ingrese un n�mero ");
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

        System.out.println("Suma de los n�meros: " + suma);
        System.out.println("Media de los n�meros: " + media);
        
        entrada.close();
    }
}
